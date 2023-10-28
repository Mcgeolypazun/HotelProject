package dong_min;

import sung_jun.ReservationOkButton;
import sunghyuk.PersonReservation;
import sunghyuk.ReservationRoomDateReady;
import tae_in_reservation.ReservationCheck;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static hotelroom.RoomDataClass.hotelRoomHashMap;

public class ReservationView {
    static Reservation reservation;
    public static void start () throws InterruptedException {
        reservation = new Reservation();
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
        //임시적으로 저장함 테스트용 밑3줄------
        LocalDateTime startTime6 = LocalDateTime.of(2023,9,22,13,0);
        LocalDateTime endTime6 = LocalDateTime.of(2023,9,25,16,0);
        ReservationRoomDateReady reservationRoomDateReady = new ReservationRoomDateReady(hotelRoomHashMap.get("single1"),startTime6,endTime6);
        //--------------
        reservation.roomSearch(roomType);

        //임시적으로 방생성 번호 대입 나중에 번호를 매겨 대입할것임
        System.out.println("몇번방의 방을 예약하시겠습니까?");
        int roomName = sc.nextInt();
        reservation.room = roomType+Integer.toString(roomName);

        // 고객 정보
        System.out.println("------------------------");
        System.out.println("고객정보를 입력해주세요");
        System.out.print("이름 : ");
        String personName = sc.next();
        System.out.print("전화번호 : ");
        String personphone = sc.next();
        System.out.print("소지금 : ");
        int personMoney = sc.nextInt();
        PersonReservation personReservation = new PersonReservation(personphone,personName,personMoney);

        new ReservationOkButton(reservation,personReservation);

    }



}
