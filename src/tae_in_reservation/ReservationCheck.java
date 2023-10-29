package tae_in_reservation;

import customer.Customer;
import sunghyuk.ReservationRoomDate;
import sunghyuk.PersonReservation;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.PaymentView.customers;

public class ReservationCheck { //고객이 자신의 정보 조회
    //static ArrayList<Customer> arrCustomerData = new ArrayList<>();

    String customerName;
    String phone;
    String uuid;

    public ReservationCheck() {
        System.out.println("\n예약 조회 서비스 입니다. 예약자명, 전화번호, 예약번호를 아래 순서에 맞게 입력해주세요.");

        Scanner cusName = new Scanner(System.in);
        System.out.println("\n예약자명을 입력해 주세요.");
        customerName = cusName.next();

        Scanner cusPhone = new Scanner(System.in);
        System.out.println("전화번호를 입력해 주세요.");
        phone = cusPhone.next();

        Scanner cusUuid = new Scanner(System.in);
        System.out.println("에약번호를 입력해 주세요.");
        uuid = cusUuid.next();
        UUID id = UUID.fromString(uuid);
        findUuidExist(customerName,phone,id);


        }

      public void findUuidExist(String customerName, String phone, UUID uuid){
        for(int i=0;i<customers.size();i++){
            if(customers.get(i).getUuid().equals(uuid)){
                System.out.println("이름 : "+customers.get(i).getName());
                System.out.println("방 : "+customers.get(i).getCustomerRoomDate().getHotelRoom().getName());
                System.out.println("체크인 : "+customers.get(i).getCustomerRoomDate().getStartTime());
                System.out.println("체크아웃 : "+customers.get(i).getCustomerRoomDate().getEndTime());
                System.out.println("비용 : "+ customers.get(i).getCustomerRoomDate().getHotelRoom().getRoomCost());
                System.out.println("방넓이 : "+customers.get(i).getCustomerRoomDate().getHotelRoom().getRoomSize());
                System.out.println("손님 잔액 : "+customers.get(i).getMoney());
                System.out.println("손님 id : "+customers.get(i).getUuid());
                System.out.println("─────────────────────────────────────────────────────────");
                System.out.println();
                break;
            }
            else if(i == customers.size()-1){
                System.out.println("다시 입력해주세요");
                new ReservationCheck();
            }
        }

      }


}
