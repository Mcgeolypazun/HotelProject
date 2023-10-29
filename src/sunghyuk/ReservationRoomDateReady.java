package sunghyuk;

import hyun_gu.PaymentView;
import interfaces.HotelRoom;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ReservationRoomDateReady {
    private LocalDateTime reservationStart;
    private LocalDateTime reservationEnd;
    private HotelRoom hotelRoom;
    public static ArrayList<ReservationRoomDate> arrRoomDate = new ArrayList<>();

    public ReservationRoomDateReady(HotelRoom hotelRoom,LocalDateTime start, LocalDateTime end){
        this.reservationStart = start;
        this.reservationEnd = end;
        this.hotelRoom = hotelRoom;
        //isRoomDateOccupied(hotelRoom,start,end);
    }
    public boolean isRoomDateOccupied(HotelRoom hotelRoom,LocalDateTime startTime,LocalDateTime endTime){
        int forSize = arrRoomDate.size();
        //startTime보다 endTime이 이전이면 다시 설정하게 해야됌
        for(int i=0;i<forSize;i++){
            if(ABStartEnd(i,startTime,endTime)){
                if(i == forSize-1) {
                    System.out.println("예약을 진행합니다.");
                    return true;
                    //arrRoomDate.add(new ReservationRoomDate(hotelRoom, startTime, endTime));//넣으면 arrRoomDate사이즈 증가 한번더 진행
                    //if문을 끝까지 돌면 add함
                    //dong_min패키지의
                    //new PaymentView();
                }
            }
            else {
                //System.out.println("예약을 할 수 없습니다.");
                return false;

            }

        }
//        if(arrRoomDate.size() == 0){
//            System.out.println("예약을 진행합니다.");
//            arrRoomDate.add(new ReservationRoomDate(hotelRoom,startTime,endTime));
//            //new PaymentView();
//        }
        return true;
    }

    public boolean ABStartEnd(int i,LocalDateTime startTime, LocalDateTime endTime){
        if(!arrRoomDate.get(i).getHotelRoom().getName().equals(hotelRoom.getName())){//이름이 같지 않은가?
            return true;
        }
        else if(!arrRoomDate.get(i).getStartTime().isBefore(startTime) //둘다 getStartTime()보다 이전 시간인가?
                &&!arrRoomDate.get(i).getStartTime().isBefore(endTime)){

            return true;
        }
        else if ((!arrRoomDate.get(i).getEndTime().isAfter(startTime)//둘다 getEndTime()보다 이후의 시간인가?
                &&!arrRoomDate.get(i).getEndTime().isAfter(endTime))){

            return true;
        }
        else return false; //한쪽이라도 getStartTime()과 getEndTime에 위치하면 false출력
    }






}
