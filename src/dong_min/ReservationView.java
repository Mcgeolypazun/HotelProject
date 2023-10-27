package dong_min;

import tae_in_reservation.ReservationCheck;

import java.util.Scanner;

public class ReservationView {
    public static void start () {
        Reservation reservation = new Reservation();
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------");
        System.out.println("날짜를 입력해주세요.");
        System.out.println("예시) 2023-10-26");
        String date = sc.nextLine();
        reservation.choiceDate(date);

        System.out.println("------------------------");
        System.out.println("원하는 방의 타입을 선택해주세요.");
        System.out.println("( 1 ~ 4 중 입력해주세요.)");
        System.out.println("1. Single       2. Double       3. Suite        4. Twin");
        String num = sc.nextLine();
        String roomType = reservation.choiceRoom(num);

        System.out.println("------------------------");
        System.out.println(roomType + "방의 현황");
        reservation.roomSearch(roomType);

    }
}
