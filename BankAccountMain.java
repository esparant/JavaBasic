package class1.access;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(100000);
        account.withdraw(100001);
        account.withdraw(99999);
        account.withdraw(1);


    }
}
