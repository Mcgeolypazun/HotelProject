package tae_in_reservation;

import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.PaymentView.customers;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;
import interfaces.HotelRoom;
import sunghyuk.Hotel;
import sunghyuk.ReservationRoomDateReady;

public class HotelReserveCheck { //호텔 측에서 모든 고객 정보 조회
    public String CustomerName;

    HotelReserveCheck() { //String 입력받아서 밑에 4가지 메소드에 대입
        for (int i=0; i<customers.size() ;i++) { //모든 예약 목록 조회(호텔측)
            System.out.println(i+1+"번째 --------------------------------------------------------");
            System.out.println("고객이름 : "+customers.get(i).getName());
            System.out.println("전화번호 : "+customers.get(i).getPhone());
            System.out.println("id : "+ customers.get(i).getUuid());
            System.out.println("방 이름 : "+ReservationRoomDateReady.arrRoomDate.get(i).getHotelRoom().getName());
            System.out.println("시작 시간 : " + ReservationRoomDateReady.arrRoomDate.get(i).getStartTime());
            System.out.println("종료 시간 : " + ReservationRoomDateReady.arrRoomDate.get(i).getEndTime());
            System.out.println("고객 소지금 : "+customers.get(i).getMoney());
            System.out.println("--------------------------------------------------------");
        }
        Hotel hotel = Hotel.getInstance();
        System.out.println("호텔 자산 : "+hotel.getHotelAsset());
        System.out.println("--------------------------------------------------------");
        System.out.println();
    }

    public HotelRoom allCustomerRoom() {

        return null;
    }

    public String allDate() {

        return null;
    }

    public String allPhone() {

        return null;
    }

    public String allUuid() {

        return null;
    }


}
