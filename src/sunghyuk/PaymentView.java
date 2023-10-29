package sunghyuk;

import customer.Customer;
import dong_min.ReservationView;
import hotelroom.SingleRoom;
import interfaces.HotelRoom;
import tae_in_reservation.MainView;

import java.util.ArrayList;
import java.util.UUID;

import static hotelroom.RoomDataClass.hotelRoomHashMap;

public class PaymentView {

    Hotel hotel = Hotel.getInstance();
    Customer customer;
    public static ArrayList<Customer> customers = new ArrayList<>();

    public PaymentView(Customer customer, HotelRoom hotelRoom) throws InterruptedException {
        this.customer = customer;
        int customerMoney = customer.getMoney();
        if(customer.getCustomerRoomDate().getHotelRoom().getName().equals(hotelRoom.getName())){
            moneyComparison(customerMoney,hotelRoom.getRoomCost());//방 가격과 고객돈을 비교해 고객돈이 많으면
            // 호텔돈과 고객돈에 변동이 생기며 고객객체를 저장함, uuid 할당
        }
    }
//customer : Customer객체 , getCustomerRoomDate() : Customer클래스 안 ReservationRoomDate클래스 객체,
// getHotelRoom(): ReservationRoomDate클래스안에 HotelRoom클래스 객체, getName() : HotelRoom의 String 객체

    public void moneyComparison(int custMoney,int roomFee) throws InterruptedException {
        if(custMoney >= roomFee){
            hotel.setHotelAsset(roomFee); // 호텔 자산 변동
            customer.setMoney(custMoney - roomFee);//고객 돈 설정
            reservationNumber();//uuid할당
            customers.add(customer);
            System.out.println();
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println();
            new MainView();

        }
        else{//소지금 부족
            System.out.println("소지금이 부족합니다. 예약화면으로 돌아갑니다.");
            System.out.println("─────────────────────────────────────────────────────────");
            System.out.println();
            new ReservationView();
        }

    }

    public void reservationNumber(){//호텔과 고객에게 uuid 할당함
        UUID randomUUID = UUID.randomUUID();
        customer.setUuid(randomUUID);
        System.out.println("결제되었습니다. 고객님의 id는 "+randomUUID);
    }

}

