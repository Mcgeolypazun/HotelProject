package tae_in_reservation;

import customer.Customer;
import sunghyuk.ReservationRoomDate;
import sunghyuk.PersonReservation;

import java.util.ArrayList;
import java.util.Scanner;

import static hotelroom.RoomDataClass.hotelRoomHashMap;

public class ReservationCheck { //고객이 자신의 정보 조회
    static ArrayList<Customer> arrCustomerData = new ArrayList<>();

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


            if (equals(Customer.)) {

            }
        }

        public String reservationDate () {

            return "";
        }


}
