import customer.Customer;
import customer.CustomerBuilder;
import hotelroom.RoomDataClass;
import tae_in_reservation.MainView;
import hotelroom.SingleRoom;
import sunghyuk.ReservationRoomDateReady;


import java.time.LocalDateTime;
import java.util.*;

import static hotelroom.RoomDataClass.hotelRoomHashMap;

public class Main {
    static Scanner kb = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {

//<<<<<<< HEAD

        //점유되고 있는지 확인
        System.out.println("방 상태:"+hotelRoomHashMap.get("single1"));
//=======
//>>>>>>> b6b19f2d74b51b7a9a951c0e2f4a9f6e04904622

        RoomDataClass roomDataClass = new RoomDataClass();
        MainView mainView = new MainView();
        mainView.mainView();


//<<<<<<< HEAD
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

        LocalDateTime startTime5 = LocalDateTime.of(2023,10,22,13,0);
        LocalDateTime endTime5 = LocalDateTime.of(2023,10,25,16,0);
        reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime5,endTime5);
        //예약됨
        boolean isAfter = startTime2.isAfter(startTime3);
        System.out.println(isAfter);



//            Customer customer1 = new CustomerBuilder()
//                    .setMoney(100000)
//                    .setName("김철수")
//                    .setPhone("010-4444-9999")
//                    .setUuid(uuid.toString())
//                    .build();
//=======
//>>>>>>> 683f6ea8af62b8348418ad1434130f34d060ed7e


    }
}