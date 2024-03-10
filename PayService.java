package poly.exfinal.pay;

import static poly.exfinal.pay.PayStore.findPay;

public class PayService {
    public void payProcess(String payMethod, int amount) {
        System.out.println("결제를 시작합니다. 옵션 : " + payMethod + ", 금액 : " + amount);
        PayCenter newPay = findPay(payMethod);
        boolean bool = newPay.pay(amount);
        if (bool) {
            System.out.println(amount + "원 결제에 성공하였습니다.");
            return;
        }
        System.out.println("결제에 실패하였습니다.");
    }
}

