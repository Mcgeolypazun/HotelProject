package tae_in_reservation;

import dong_min.Reservation;
import dong_min.ReservationView;

import java.util.Scanner;

import static sunghyuk.PaymentView.customers;


public class MainView {

    public void mainViewPrint() throws InterruptedException { // 호텔 소개 문구
        Scanner sc = new Scanner(System.in);
        System.out.println(" \t ┌───────────────────\"시그니엘 부산에 오신걸 환영합니다.\" ───────────────────┐");
        System.out.println("\t 시그니엘 부산은 부산 해운대구 중동에 위치하며, \n" +
                "\t 해운대의 랜드마크 '엘시티(LCT)'타워 3~19층에 위치한 260실 규모의 럭셔리 호텔입니다. \n" +
                "\t 국내 럭셔리 호텔을 대표하는 '시그니엘 서울'에 이은 시그니엘의 두번째 프로퍼티로 \n" +
                "\t 세계적인 인테리어 디자인 그룹 HBA의 감각적인 디자인과 시그니엘의 품격이 어우러져 \n" +
                "\t └─────────────────── 럭셔리의 새로운 가치를 전합니다. ──────────────────────┘");
        System.out.println(" ");
        System.out.println("                  1. 예약하기 \t 2. 예약 조회\t    3.호텔 모든 고객 조회");

        int mainAns = sc.nextInt(); // 예약하기 / 예약 조회 선택

        if (mainAns == 1) {
            new ReservationView();
        } else if (mainAns == 2) {
            new ReservationCheck();
            countDown();
        } else if(mainAns == 3){
            new HotelReserveCheck();
            countDown();
        }
        else {
            wrongInput();
        }
    }
    public MainView() throws InterruptedException {//생성자에 mainViewPrint()사용
        mainViewPrint();
    }

    public static void wrongInput() throws InterruptedException { // 잘못된 입력
        System.out.println("잘못된 입력입니다.");
        System.out.println("메인 화면으로 돌아갑니다.");
        countDown();

    }

    public static void countDown() throws InterruptedException { // 카운트 다운
        System.out.println("3초 후 메인화면으로 돌아갑니다.");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2..");
        Thread.sleep(1000);
        System.out.println("1.");
    }


}

