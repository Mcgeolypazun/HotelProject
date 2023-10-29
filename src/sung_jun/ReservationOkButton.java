package sung_jun;

import customer.Customer;
import dong_min.Reservation;
//import hyun_gu.PaymentView;
import interfaces.HotelRoom;
import sunghyuk.Hotel;
import sunghyuk.PersonReservation;
import sunghyuk.ReservationRoomDate;
import sunghyuk.ReservationRoomDateReady;
import tae_in_reservation.MainView;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;
import sunghyuk.PaymentView;
import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;

public class ReservationOkButton extends CreateObject {

    public ReservationOkButton(Reservation reservation, PersonReservation personReservation) throws InterruptedException {//1.생성자 매개변수 수정
        // 2. 이 객체로 name, phone, money, room,예약시간 출력(시작시간, 종료시간)
        //super(name, phone, money, uuid); // CreateObject가 이용되지 않기 때문에 부모클래스 생성자를 사용하지 못함
        // 선택한 방 데이터 출력
        System.out.println("선택하신 방과 예약자 정보를 확인해 주세요");
        ReservationRoomDateReady reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime);
        int forSize = arrRoomDate.size();

        if (reservationRoomDateReady.isRoomDateOccupied(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime)) {
            System.out.println("방 이름 : " + reservation.room);
            System.out.println("이름 : " + personReservation.getName());
            // 예약자 정보 출력


            System.out.println("1. 확인     2. 취소");
            Scanner reservationOkButton = new Scanner(System.in);
            // 확인, 취소 입력 시 작동
            int OkOrNo = reservationOkButton.nextInt();
            if (OkOrNo == 1) {
                // 방이 true 인지 false 인지
                int count = 0;//숫자가 차면 다음 페이지로 넘어감
                for (int i = 0; i < arrRoomDate.size(); i++) {
                    if (isRoomFull(i, reservation.startTime, reservation.endTime, reservation.room)) {
                        arrRoomDate.add(new ReservationRoomDate(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime));
                        Customer customer = new Customer(personReservation.getName(), personReservation.getPhone(), personReservation.getMoney(), null);
                        customer.setCustomerRoomDate(new ReservationRoomDate(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime));
                        System.out.println("결제화면으로 넘어갑니다.");
                        //System.out.println(reservation);
                        PaymentView paymentView = new PaymentView(customer, hotelRoomHashMap.get(reservation.room));
                        break;
                    } else if (count == arrRoomDate.size() - 1) {
                        System.out.println("이미 예약된 방입니다.");
                        break;

                        //paymentView.moneyComparison();
                    }

                    count++;
                }
                if(arrRoomDate.size()==0){
                    arrRoomDate.add(new ReservationRoomDate(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime));
                    Customer customer = new Customer(personReservation.getName(), personReservation.getPhone(), personReservation.getMoney(), null);
                    customer.setCustomerRoomDate(new ReservationRoomDate(hotelRoomHashMap.get(reservation.room), reservation.startTime, reservation.endTime));
                    System.out.println("결제화면으로 넘어갑니다.");
                    //System.out.println(reservation);
                    PaymentView paymentView = new PaymentView(customer, hotelRoomHashMap.get(reservation.room));
                }
            } else if (OkOrNo == 2) {
                System.out.println("처음 화면으로 돌아갑니다.");
                MainView mainView = new MainView();

            }
        }
        else{
            System.out.println("방을 예약하실수 없습니다.");
        }
    }
        public boolean isRoomFull ( int i, LocalDateTime startTime, LocalDateTime endTime, String hotelRoom){
            if (!arrRoomDate.get(i).getHotelRoom().getName().equals(hotelRoom)) {//이름이 같지 않은가?
                return true;
            } else if (!arrRoomDate.get(i).getStartTime().isBefore(startTime) //둘다 getStartTime()보다 이전 시간인가?
                    && !arrRoomDate.get(i).getStartTime().isBefore(endTime)) {

                return true;
            } else if ((!arrRoomDate.get(i).getEndTime().isAfter(startTime)//둘다 getEndTime()보다 이후의 시간인가?
                    && !arrRoomDate.get(i).getEndTime().isAfter(endTime))) {

                return true;
            } else return false; //한쪽이라도 getStartTime()과 getEndTime에 위치하면 false출력
        }

}
