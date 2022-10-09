import java.util.*;

public class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated= new Date();

    {
        annualInterestRate = 7;
    }

    Account() {
        balance = 500;
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance= balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return balance*(annualInterestRate/1200);
    }

    public double withdraw(double a) {
        if(a<balance)
            balance-=a;
        else
            System.out.println("Insufficient balance");
        return balance;
    } 

    public double deposit(double a) {
        balance+=a;
        return balance;
    }
}
