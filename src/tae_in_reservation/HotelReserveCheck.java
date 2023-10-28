package tae_in_reservation;

import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;
import interfaces.HotelRoom;
import sunghyuk.ReservationRoomDateReady;

public class HotelReserveCheck { //호텔 측에서 모든 고객 정보 조회
    public String CustomerName;

    HotelReserveCheck() { //String 입력받아서 밑에 4가지 메소드에 대입
        for (int i=0; i<arrRoomDate.size() ;i++) { //모든 예약 목록 조회(호텔측)
            System.out.println("의뢰자 null" + i);
            System.out.println("고객이름 , 전화번호 , uuid");
            System.out.println(ReservationRoomDateReady.arrRoomDate.get(i).getHotelRoom().getName());
            System.out.println("시작 시간 : " + ReservationRoomDateReady.arrRoomDate.get(i).getStartTime());
            System.out.println("종료 시간 : " + ReservationRoomDateReady.arrRoomDate.get(i).getEndTime());
        }
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
