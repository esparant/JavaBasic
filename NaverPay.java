package poly.exfinal.pay;

public class NaverPay implements PayCenter{

    private static final String payName = "Naver Pay";

    @Override
    public boolean pay(int amount) {
        System.out.println(payName + "에 연결합니다.");
        System.out.println(amount + "원 결제를 진행합니다.");
        if (amount > 0) {
            return true;
        }
        return false;
    }

}
