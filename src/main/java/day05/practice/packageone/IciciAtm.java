package day05.practice.packageone;

class IciciAtm implements ATM {
    private static final double charges = 10.0;

    public boolean deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        return true;
    }

    public boolean withdraw(Account account, double amount) throws Exception {
        if (account.getBalance() < 10000) {
            throw new Exception("Insufficient balance to withdraw.");
        } else {
            account.setBalance(account.getBalance() - (amount + charges));
            return true;
        }
    }

    public double getBalance(Account account) {
        return account.getBalance();
    }


}