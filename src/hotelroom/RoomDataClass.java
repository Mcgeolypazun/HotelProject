package hotelroom;

import interfaces.HotelRoom;

import java.util.ArrayList;
import java.util.HashMap;

/*      이런식으로 사용함
       RoomDataClass roomDataClass = new RoomDataClass();

       //점유되고 있는지 확인
       System.out.println(hotelRoomHashMap.get("single1"));

        */
public class RoomDataClass {
    public static HashMap<String , Boolean> hotelRoomHashMap = new HashMap();
    //HotelRoom 이 점유 되어 있으면 boolean을 true로 둔다.
    public RoomDataClass(){
        data();
    }

    public void data(){ //방 생성 및 ArrayList에 저장
        SingleRoom single1 = new SingleRoom();
        SingleRoom single2 = new SingleRoom();
        SingleRoom single3 = new SingleRoom();
        SingleRoom single4 = new SingleRoom();

        DoubleRoom double1 = new DoubleRoom();
        DoubleRoom double2 = new DoubleRoom();
        DoubleRoom double3 = new DoubleRoom();
        DoubleRoom double4 = new DoubleRoom();

        SuiteRoom suite1 = new SuiteRoom();
        SuiteRoom suite2 = new SuiteRoom();
        SuiteRoom suite3 = new SuiteRoom();

        TwinRoom twin1 = new TwinRoom();
        TwinRoom twin2 = new TwinRoom();
        TwinRoom twin3 = new TwinRoom();

        single1.setName("single1");
        single2.setName("single2");
        single3.setName("single3");
        single4.setName("single4");

        double1.setName("double1");
        double2.setName("double2");
        double3.setName("double3");
        double4.setName("double4");

        suite1.setName("suite1");
        suite2.setName("suite2");
        suite3.setName("suite3");

        twin1.setName("twin1");
        twin2.setName("twin2");
        twin3.setName("twin3");

        hotelRoomHashMap.put(single1.getName(),false);
        hotelRoomHashMap.put(single2.getName(),false);
        hotelRoomHashMap.put(single3.getName(),false);
        hotelRoomHashMap.put(single4.getName(),false);

        hotelRoomHashMap.put(double1.getName(),false);
        hotelRoomHashMap.put(double2.getName(),false);
        hotelRoomHashMap.put(double3.getName(),false);
        hotelRoomHashMap.put(double4.getName(),false);

        hotelRoomHashMap.put(suite1.getName(),false);
        hotelRoomHashMap.put(suite2.getName(),false);
        hotelRoomHashMap.put(suite3.getName(),false);

        hotelRoomHashMap.put(twin1.getName(),false);
        hotelRoomHashMap.put(twin2.getName(),false);
        hotelRoomHashMap.put(twin3.getName(),false);
    }

}
