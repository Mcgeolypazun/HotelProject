package sunghyuk;

import interfaces.HotelRoom;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReservationRoomDateReady {
    private LocalDateTime reservationStart;
    private LocalDateTime reservationEnd;
    private HotelRoom hotelRoom;
    static ArrayList<ReservationRoomDate> arrRoomDate = new ArrayList<>();

    public ReservationRoomDateReady(HotelRoom hotelRoom,LocalDateTime start, LocalDateTime end){
        this.reservationStart = start;
        this.reservationEnd = end;
        this.hotelRoom = hotelRoom;
        isRoomDateOccupied(hotelRoom,start,end);
    }
    public void isRoomDateOccupied(HotelRoom hotelRoom,LocalDateTime startTime,LocalDateTime endTime){

        for(int i=0;i<arrRoomDate.size();i++){
            if(ABStartEnd(i,startTime,endTime) || startEndAB(i,startTime,endTime)){
                if(i<arrRoomDate.size()-1) continue;
                System.out.println("예약을 진행합니다.");
                arrRoomDate.add(new ReservationRoomDate(hotelRoom, startTime, endTime));//넣으면 arrRoomDate사이즈 증가 한번더 진행
                //if문을 끝까지 돌면 add함
                break;
            }
            else {
                System.out.println("예약을 할 수 없습니다.");
                break;
            }

        }
        if(arrRoomDate.size() == 0){
            System.out.println("예약을 진행합니다.");
            arrRoomDate.add(new ReservationRoomDate(hotelRoom,startTime,endTime));
        }

    }

    public boolean ABStartEnd(int i,LocalDateTime startTime, LocalDateTime endTime){
        if(arrRoomDate.get(i).getHotelRoom().equals(hotelRoom.getName()) &&
                arrRoomDate.get(i).getStartTime().isBefore(startTime) ||
                arrRoomDate.get(i).getStartTime().isBefore(endTime)){
            return true;
        }
        else return false;
    }//시작시간, 종료시간 <다른 예약시간 < 다른 예약 종료

    public boolean startEndAB(int i,LocalDateTime startTime, LocalDateTime endTime){
        if(arrRoomDate.get(i).getHotelRoom().equals(hotelRoom.getName()) &&
                arrRoomDate.get(i).getEndTime().isAfter(startTime) ||
                arrRoomDate.get(i).getEndTime().isAfter(endTime)){
            return true;
        }
        else return false;
    }// 다른 예약시간 < 다른 예약 종료< 시작시간, 종료시간

    public boolean isReserved(LocalDateTime checkTime){
        return checkTime.isAfter(reservationStart) && checkTime.isBefore(reservationEnd);
    }
//    ReservationRoomDateReady(int year,int month,int dayOfMonth,int hour,int minute){
//        LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);
//
//        // ISO 8601 형식으로 날짜와 시간 출력
//        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        String isoDateTime = dateTime.format(formatter);
//
//        System.out.println("ISO 8601 형식으로 표시된 날짜와 시간: " + isoDateTime);
//    }



}
