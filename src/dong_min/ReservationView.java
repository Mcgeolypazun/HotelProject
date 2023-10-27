package dong_min;

import sunghyuk.PersonReservation;
import tae_in_reservation.ReservationCheck;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReservationView {
    public static void start () {
        Reservation reservation = new Reservation();
        Scanner sc = new Scanner(System.in);

        // 예약날짜 정보
        System.out.println("------------------------");
        System.out.println("예약 날짜를 입력해주세요.");
        System.out.println("------------------------");
        System.out.println("예시) 2023-10-11");
        System.out.println("년도 : 2023");
        System.out.println("월 : 10");
        System.out.println("일 : 11");
        System.out.println("------------------------");
        
        // 입실 : 체크인
        System.out.print("년도 : ");
        int checkInYear = Integer.parseInt(sc.nextLine());
        System.out.print("월 : ");
        int checkInMonth = Integer.parseInt(sc.nextLine());
        System.out.print("일 : ");
        int checkInDay = Integer.parseInt(sc.nextLine());
        reservation.startTime(checkInYear,checkInMonth,checkInDay);

        // 숙박일수 : 체크아웃
        System.out.println("------------------------");
        System.out.println("숙박일수를 입력해주세요.");
        System.out.println("예시) 2박3일 일 경우 : 2");
        System.out.print("숙박일수 : ");
        int stay = Integer.parseInt(sc.nextLine());
        reservation.endTime(stay);

        // 예약날짜 확인
        System.out.println("------------------------");
        System.out.print("체크인 : ");
        System.out.println(reservation.startTimeCheck());
        System.out.print("체크아웃 : ");
        System.out.println(reservation.endTimeCheck());

        // 방 선택
        System.out.println("------------------------");
        System.out.println("원하는 방의 타입을 선택해주세요.");
        System.out.println("( 1 ~ 4 중 입력해주세요.)");
        System.out.println("1. Single       2. Double       3. Suite        4. Twin");
        String num = sc.nextLine();
        String roomType = reservation.choiceRoom(num);

        // 방 조회
        System.out.println("------------------------");
        System.out.println(roomType + " type 방의 현황");
        reservation.roomSearch(roomType);

        // 고객 정보
        System.out.println("------------------------");
        System.out.println("고객정보를 입력해주세요");
        System.out.print("이름 : ");
        String personName = sc.nextLine();
        System.out.print("전화번호 : ");
        String personphone = sc.nextLine();
        System.out.print("소지금 : ");
        int personMoney = Integer.parseInt(sc.nextLine());
        PersonReservation personReservation = new PersonReservation(personphone,personName,personMoney);


    }
}
