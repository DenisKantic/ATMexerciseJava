package AtmPackage;

public class ATM {


    private int id;
    private double balance;

    public ATM() {

        this.id = 0;
        this.balance = 100.0;
    }

    public ATM(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // methods for deposit and withdraw


    public void deposit(double value) {

        balance += value;
    }

    public void withdraw(double value) {

        balance -= value;
    }
}