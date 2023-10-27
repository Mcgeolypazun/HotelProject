package dong_min;

import hotelroom.*;
import interfaces.HotelRoom;

import java.util.Scanner;

public class Reservation {
    String date;
    String room;
    boolean ended;
    RoomDataClass roomDataClass = new RoomDataClass();

    public Reservation(){
    }

    public String choiceDate(String date){
        this.date = date;

        return date;
    }

    public String choiceRoom(String num){
        switch (num) {
            case "1":
                SingleRoom singleRoom = new SingleRoom();
                System.out.println("Room_Size : " + singleRoom.getRoomSize());
                System.out.println("Room_Cost : " + singleRoom.getRoomCost());
                this.room = "single";
                break;
            case "2":
                DoubleRoom doubleRoom = new DoubleRoom();
                System.out.println("Room_Size : " + doubleRoom.getRoomSize());
                System.out.println("Room_Cost : " + doubleRoom.getRoomCost());
                this.room = "double";
                break;
            case "3":
                SuiteRoom suiteRoom = new SuiteRoom();
                System.out.println("Room_Size : " + suiteRoom.getRoomSize());
                System.out.println("Room_Cost : " + suiteRoom.getRoomCost());
                this.room = "suite";
                break;
            case "4":
                TwinRoom twinRoom = new TwinRoom();
                System.out.println("Room_Size : " + twinRoom.getRoomSize());
                System.out.println("Room_Cost : " + twinRoom.getRoomCost());
                this.room = "twin";
            default:
                System.out.println("다시 입력해주세요.");
                break;
        }
        return room;
    }
    public void roomSearch (String room) {

        for (int i = 1; i <= 4; i++) {
            String roomNumber = room + Integer.toString(i);
            String emptyCheck = String.valueOf(this.roomDataClass.hotelRoomHashMap.get(roomNumber));
            System.out.println(roomNumber + " / " + emptyCheck);

            // hotelRoomHashMap의 value 값이 true,false 로 반환할수 있을때
//             boolean bempty = this.roomDataClass.hotelRoomHashMap.get(roomNumber);
//             String check = (empty) ? "〇" : "×";
//             System.out.println(roomNumber + " / " + check);

        }

    }
}
