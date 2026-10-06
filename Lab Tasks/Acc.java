public class Acc {

    private double balance;

    public Acc() {
        balance = 0;
    }

    public Acc(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Runner {

    public static void main(String[] args) {

        Acc account1 = new Acc(5000);
        Acc account2 = new Acc(account1.getBalance());

        account1.deposit(1000);
        account1.withdraw(500);

        System.out.println("Account 1 Balance: " + account1.getBalance());
        System.out.println("Account 2 Balance: " + account2.getBalance());
    }
}