package day05.practice.packageone;

public interface ATM {
    boolean deposit(Account account, double amount);
    boolean withdraw(Account account,double amount) throws Exception;
    double getBalance(Account  account);
}