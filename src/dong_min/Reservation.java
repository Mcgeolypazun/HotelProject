package dong_min;

import hotelroom.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static sunghyuk.PaymentView.customers;
import static sunghyuk.ReservationRoomDateReady.arrRoomDate;

public class Reservation {
    String dateCheck;
    public String room;
    boolean ended;
    RoomDataClass roomDataClass = new RoomDataClass();
    public LocalDateTime startTime;
    public LocalDateTime endTime;

    public Reservation() {
    }


    public LocalDateTime startTime(int year, int month, int day) {
        this.startTime = LocalDateTime.of(year, month, day, 0, 0);
        return startTime;
    }

    public LocalDateTime endTime(int stay) {
        this.endTime = this.startTime.plusDays(stay);
        return endTime;
    }

    public String startTimeCheck() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String startTimeFormatter = startTime.format(formatter);
        return startTimeFormatter;
    }

    public String endTimeCheck() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String endTimeFormatter = endTime.format(formatter);
        return endTimeFormatter;
    }

//    public void dateSearch () {
//        List<String> list = new ArrayList<>();
//        String search = list.stream().filter(date -> date.getDate.equals(this.date),date.getEmpty.equals(true))
//                .forEach(f-> System.out.println(f.getRoom + f. getRoomNumber));
//        String search = this.roomDataClass.hotelRoomHashMap.stream().fil
//        for (int i = 1; i <= 4; i++) {
//            String roomNumber = room + Integer.toString(i);
//            String emptyCheck = String.valueOf(this.roomDataClass.hotelRoomHashMap.get(roomNumber));
//            System.out.println(roomNumber + " / " + emptyCheck);
//        }
//    }

    public String choiceRoom(String num) {
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

    public void roomSearch(String room) {

        for (int i = 0; i < 4; i++) {
            String roomNumber = room + Integer.toString(i+1);
            for (int j=0;j<customers.size();j++){
            //String emptyCheck = String.valueOf(this.roomDataClass.hotelRoomHashMap.get(roomNumber));
            String emptyCheck = customers.get(j).getCustomerRoomDate().getHotelRoom().getName();
            if (emptyCheck.equals(roomNumber)) {
                System.out.println(roomNumber + " / 체크인" + arrRoomDate.get(j).getStartTime());
                System.out.println(roomNumber + " / 체크아웃" + arrRoomDate.get(j).getEndTime());
                System.out.println();
            }
            }
        }
    }
}
//                hotelRoomHashMap의 value 값이 true,false 로 반환할수 있을때
//                boolean bempty = this.roomDataClass.hotelRoomHashMap.get(roomNumber);
//                String check = (empty) ? "〇" : "×";
//                System.out.println(roomNumber + " / " + check);

