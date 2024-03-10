package poly.exfinal.pay;

public class DefaultPay implements PayCenter{

    @Override
    public boolean pay(int amount) {
        System.out.println("올바른 결제 수단이 아닙니다.");
        return false;
    }
}
