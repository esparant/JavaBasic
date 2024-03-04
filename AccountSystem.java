package class1.ex;

import javax.naming.NameNotFoundException;

public class AccountSystem {
    int amount;

    void deposit(int money) {
        amount += money;
        System.out.println(money + "원을 입금하셨습니다.");
        System.out.println("잔액 : " + amount);
    }
    void withdraw(int money) {
        if(amount < money) {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
            System.out.println("잔액 : " + amount);
            return;
        }
        amount -= money;
        System.out.println(money + "원을 출금하셨습니다.");
        System.out.println("잔액 : " + amount);
    }
}
