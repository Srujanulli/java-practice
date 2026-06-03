package Day_1;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double checkBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount>0){
            balance = balance + amount;
        }
    }

    public void withdraw(double amount){
        if (amount<=balance && amount>0){
            balance = balance - amount;
        }
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000);
        b.deposit(1000);
        System.out.println(b.checkBalance());
    }
}
