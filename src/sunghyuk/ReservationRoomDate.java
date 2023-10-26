package sunghyuk;

import interfaces.HotelRoom;

import java.time.LocalDateTime;

public class ReservationRoomDate {
    HotelRoom hotelRoom;
    LocalDateTime startTime;
    LocalDateTime endTime;

    ReservationRoomDate(HotelRoom hotelRoom,LocalDateTime startTime,LocalDateTime endTime){
        this.hotelRoom = hotelRoom;
        this.startTime = startTime;
        this.endTime = endTime;
    }
    ReservationRoomDate(){}

    public HotelRoom getHotelRoom() {
        return hotelRoom;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setHotelRoom(HotelRoom hotelRoom) {
        this.hotelRoom = hotelRoom;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
