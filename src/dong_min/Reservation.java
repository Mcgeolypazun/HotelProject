package dong_min;

import hotelroom.*;
import interfaces.HotelRoom;

import java.util.Scanner;

public class Reservation {
    String date;
    String room;
    RoomDataClass roomDataClass;

    public Reservation(){
    }

    public String choiceDate(String date){
        this.date = date;
        return date;
    }

    public void choiceRoom(String num){
        switch (num) {
            case "1" :
                SingleRoom singleRoom = new SingleRoom();
                System.out.println("Room_Size : " + singleRoom.getRoomSize());
                System.out.println("Room_Cost : " + singleRoom.getRoomCost());
                roomDataClass.hotelRoomHashMap.get("single1");
                break;
            case "2" :
                DoubleRoom doubleRoom = new DoubleRoom();
                System.out.println("Room_Size : " + doubleRoom.getRoomSize());
                System.out.println("Room_Cost : " + doubleRoom.getRoomCost());
                roomDataClass.hotelRoomHashMap.get("double1");
                break;
            case "3" :
                SuiteRoom suiteRoom = new SuiteRoom();
                System.out.println("Room_Size : " + suiteRoom.getRoomSize());
                System.out.println("Room_Cost : " + suiteRoom.getRoomCost());
                roomDataClass.hotelRoomHashMap.get("suite1");
                break;
            case "4" :
                TwinRoom twinRoom = new TwinRoom();
                System.out.println("Room_Size : " + twinRoom.getRoomSize());
                System.out.println("Room_Cost : " + twinRoom.getRoomCost());
                roomDataClass.hotelRoomHashMap.get("twin1");
        }
    }
}
