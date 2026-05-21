package basic;

public class BankAccount {

    private double balance;
    private final String owner;

    BankAccount(String owner, double balance) {

        this.owner = owner;

        if(balance >= 0) {
            this.balance = balance;
        }
    }

    public void deposit(double amount) {

        if(amount > 0) {
            balance += amount;
        }
        else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {

        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        }

        else if(amount > balance) {
            System.out.println("Insufficient balance");
        }

        else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {

        return "Owner: " + owner +
                ", Balance: " + balance;
    }

    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount("Srujan", 1000);

        BankAccount acc2 =
                new BankAccount("Vivek", 100);

        acc1.deposit(500);
        acc1.withdraw(300);

        acc2.deposit(4000);
        acc2.withdraw(1000);

        System.out.println(acc1);
        System.out.println(acc2);

        System.out.println(acc2.getBalance());
    }
}