package poly.exfinal.pay;

import java.util.Scanner;

public class PayMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService user = new PayService();
        System.out.println("결제 시스템에 접속하셨습니다.");

        while(true) {

            System.out.println("결제 방법 : kakao | naver | newpay (나가기 : exit)");
            System.out.print("결제 방법을 선택해 주세요 : ");
            String payMethod = sc.nextLine();

            if(payMethod.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("금액을 입력해주세요 : ");
            String amount = sc.nextLine();

            if(amount.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            user.payProcess(payMethod, Integer.parseInt(amount));
        }
    }
}
