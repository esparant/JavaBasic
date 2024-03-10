package poly.exfinal.pay;

public class PayStore {
    public static PayCenter findPay(String payMethod) {
        if (payMethod.equals("kakao")) {
            return new KakaoPay();
        }
        if (payMethod.equals("naver")) {
            return new NaverPay();
        }
        if (payMethod.equals("newpay")) {
            return new NewPay();
        }
        return new DefaultPay();
    }
}
