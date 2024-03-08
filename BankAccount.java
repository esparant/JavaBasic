package class1.access;

public class BankAccount {
    // 캡슐화의 착한얘들
    private int balance;


    public BankAccount() {
        balance = 0;
    }

    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            System.out.println(amount + "원이 입금되었습니다.");
            balance += amount;
            getBalance();
            return;
        }
        System.out.println("올바른 금액을 입력해주세요.");
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            System.out.println(amount + "원이 출금되었습니다.");
            balance -= amount;
            getBalance();
            return;
        }
        System.out.println("유효하지 않은 고객이거나 잔액이 부족합니다.");
        getBalance();
    }

    public void getBalance() {
        System.out.println("잔액 : " + balance);
    }

    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함.
        return amount > 0;
    }
}
