package class1.ex;

public class AccountSystemMain {
    public static void main(String[] args) {
        AccountSystem account = new AccountSystem();
        account.deposit(10000);
        account.withdraw(10000);
        account.withdraw(200000000);
    }
}
