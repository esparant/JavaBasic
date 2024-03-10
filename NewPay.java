package poly.exfinal.pay;

public class NewPay implements PayCenter {
    private final static String payName = "New Pay";
    @Override
    public boolean pay(int amount) {
        System.out.println(payName + "에 연결합니다.");
        System.out.println(amount + "원 결제를 진행합니다.");
        if (amount > 0) {
            return true;
        }
        System.out.println("올바른 결제 금액이 아닙니다.");
        return false;
    }
}
