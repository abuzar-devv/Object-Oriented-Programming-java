class Account {
    int balance;

    
    Account() {
        balance = 0;
    }

    
    Account(int b) {
        balance = b;
    }

    void deposit(int amount) {
        balance = balance + amount;
    }

    void withdraw(int amount) {
        balance = balance - amount;
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(1000);

        a2.deposit(500);
        a2.withdraw(200);

        System.out.println("Balance: " + a2.balance);
    }
}
