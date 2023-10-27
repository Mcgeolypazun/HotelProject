package dong_min;

import hotelroom.RoomDataClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ReservationView reservationView = new ReservationView();
        reservationView.start();





        // 특정 날짜와 시간을 나타내는 LocalDateTime 객체 생성
        LocalDateTime dateTime = LocalDateTime.of(2023, 10, 27, 15, 30);

        // LocalDateTime을 형식화하고 출력
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("형식화된 날짜 및 시간: " + formattedDateTime);

        // 산술 연산 수행
        LocalDateTime futureDateTime = dateTime.plusHours(3);
        System.out.println("미래의 날짜 및 시간: " + futureDateTime);


    }
}
