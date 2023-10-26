package sunghyuk;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReservationRoomDateReady {

    ReservationRoomDateReady(int year,int month,int dayOfMonth,int hour,int minute){
        LocalDateTime dateTime = LocalDateTime.of(year, month, dayOfMonth, hour, minute);

        // ISO 8601 형식으로 날짜와 시간 출력
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String isoDateTime = dateTime.format(formatter);

        System.out.println("ISO 8601 형식으로 표시된 날짜와 시간: " + isoDateTime);
    }

}
