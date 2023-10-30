package sunghyuk;

import customer.Customer;
import customer.CustomerBuilder;
import hotelroom.RoomDataClass;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.UUID;

import static hotelroom.RoomDataClass.hotelRoomHashMap;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;

public class Main {

    static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        RoomDataClass roomDataClass = new RoomDataClass();
        //점유되고 있는지 확인
        System.out.println("방 상태:" + hotelRoomHashMap.get("single1"));

        hotelRoomHashMap.get("single1");
        //
        LocalDateTime startTime = LocalDateTime.of(2023,10,28,10,0);
        LocalDateTime endTime = LocalDateTime.of(2023,10,28,16,0);
        ReservationRoomDateReady reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime,endTime);
        //->예약이 되었다고 나오고 RoomReservationReady클래스의 static ArrayList<ReservationRoomDate> arrRoomDate = new ArrayList<>();에 저장됨
        LocalDateTime startTime2 = LocalDateTime.of(2023,10,28,13,0);
        LocalDateTime endTime2 = LocalDateTime.of(2023,10,28,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime2,endTime2);
        //안됨
        LocalDateTime startTime3 = LocalDateTime.of(2023,10,27,13,0);
        LocalDateTime endTime3 = LocalDateTime.of(2023,10,27,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime3,endTime3);
        System.out.println(hotelRoomHashMap.get("single1").getName());
        //->예약됨
        LocalDateTime startTime4 = LocalDateTime.of(2023,10,23,13,0);
        LocalDateTime endTime4 = LocalDateTime.of(2023,10,23,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime4,endTime4);
        //예약됨
        LocalDateTime startTime5 = LocalDateTime.of(2023,10,22,13,0);
        LocalDateTime endTime5 = LocalDateTime.of(2023,10,25,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime5,endTime5);
        //예약안됨
        LocalDateTime startTime6 = LocalDateTime.of(2023,9,22,13,0);
        LocalDateTime endTime6 = LocalDateTime.of(2023,9,25,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime6,endTime6);
        boolean isAfter = startTime2.isAfter(startTime3);
        System.out.println(isAfter);

        for(int i=0;i<arrRoomDate.size();i++){
            System.out.println("의뢰자 null"+ i);
            System.out.println("고객이름 , 전화번호 , uuid");
            System.out.println(arrRoomDate.get(i).getHotelRoom().getName());
            System.out.println("시작 시간 : "+arrRoomDate.get(i).getStartTime());
            System.out.println("종료 시간 : "+arrRoomDate.get(i).getEndTime());
        } //모든 예약 목록 조회(호텔측) - 고객 정보가 빠져있음

        UUID randomUUID = UUID.randomUUID();

        Customer cust = new Customer("일론머스크","01059595959",100000,randomUUID);

            Customer customer1 = new CustomerBuilder()
                    .setMoney(100000)
                    .setName("김철수")
                    .setPhone("010-4444-9999")
                    .setUuid(randomUUID)
                    .build();


        System.out.println("방이름 : "+arrRoomDate.get(1).getHotelRoom().getName());
        System.out.println("예약 시작시간 : "+arrRoomDate.get(1).getStartTime());
        System.out.println("예약 종료시간 : "+arrRoomDate.get(1).getEndTime());

    }
}
