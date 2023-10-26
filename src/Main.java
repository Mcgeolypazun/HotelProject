import customer.Customer;
import customer.CustomerBuilder;
import hotelroom.RoomDataClass;

import java.util.*;

import static hotelroom.RoomDataClass.hotelRoomHashMap;

public class Main {
    public static void main(String[] args) {
        RoomDataClass roomDataClass = new RoomDataClass();

        //점유되고 있는지 확인
        System.out.println("방 상태:"+hotelRoomHashMap.get("single1"));

        //방을 예약할때
        hotelRoomHashMap.put("single1",true); // 이 값에 true를 입력함
        System.out.println("방 상태:"+hotelRoomHashMap.get("single1"));
        hotelRoomHashMap.put("single1",false);

//        Customer customer1 = new CustomerBuilder()
//                .setMoney(100000)
//                .setName("김철수")
//                .setPhone("010-4444-9999")
//                .setUuid(uuid.toString())
//                .build();

    }
}