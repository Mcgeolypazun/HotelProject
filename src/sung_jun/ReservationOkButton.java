package sung_jun;

import dong_min.Reservation;
import hyun_gu.PaymentView;
import interfaces.HotelRoom;
import sunghyuk.Hotel;
import sunghyuk.PersonReservation;
import sunghyuk.ReservationRoomDate;
import sunghyuk.ReservationRoomDateReady;
import tae_in_reservation.MainView;
import java.util.Scanner;
import java.util.UUID;

import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;

public class ReservationOkButton extends CreateObject {

    public ReservationOkButton(Reservation reservation, PersonReservation personReservation) throws InterruptedException {//1.생성자 매개변수 수정
        // 2. 이 객체로 name, phone, money, room,예약시간 출력(시작시간, 종료시간)
        //super(name, phone, money, uuid); // CreateObject가 이용되지 않기 때문에 부모클래스 생성자를 사용하지 못함
        // 선택한 방 데이터 출력
        System.out.println("선택하신 방과 예약자 정보를 확인해 주세요");
        ReservationRoomDateReady reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get(reservation.room),reservation.startTime,reservation.endTime);
        System.out.println(reservation.room);
        // 예약자 정보 출력

        System.out.println(personReservation.getName());
        System.out.println("1. 확인     2. 취소");
        Scanner reservationOkButton = new Scanner(System.in);
        // 확인, 취소 입력 시 작동
        int OkOrNo = reservationOkButton.nextInt();
        if (OkOrNo == 1) {
            // 방이 true 인지 false 인지
            int count = 0;//숫자가 차면 다음 페이지로 넘어감
           for(int i=0;i<arrRoomDate.size();i++) {
               if (arrRoomDate.get(i).getHotelRoom().getName() == reservation.room) {
                   System.out.println("이미 예약된 방입니다.");
                   break;
               }
               else if(count == arrRoomDate.size()-1){

                   arrRoomDate.add(new ReservationRoomDate(hotelRoomHashMap.get(reservation.room),reservation.startTime,reservation.endTime));
                   System.out.println("결제화면으로 넘어갑니다.");
                   //System.out.println(reservation);
                   PaymentView paymentView = new PaymentView();
                   break;
                   //paymentView.moneyComparison();
               }
               count++;
           }
        } else if (OkOrNo == 2) {
            System.out.println("처음 화면으로 돌아갑니다.");
            MainView mainView = new MainView();

        }
    }
}
