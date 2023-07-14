package day05.practice.packageone;

public class AxisAtm implements ATM {
	private static final double charges = 5.0;


	public boolean deposit(Account account, double amount) {
		account.setBalance(account.getBalance() + amount);
		return true;
	}

	
	public boolean withdraw(Account account, double amount) throws Exception {
		if (account.getBalance() < 5000) {
			throw new Exception("Insufficient balance to withdraw.");
		} else {
			account.setBalance(account.getBalance() - (amount + charges));
			return true;
		}
	}

	public double getBalance(Account account) {
		return account.getBalance();
	}
	
	
	 public static void main(String[] args) {
	        Account axisAccount = new Account("ax1883", 1000);
	        ATM axisATM = new AxisAtm();
	        System.out.println("Axis ATM balance: " + axisATM.getBalance(axisAccount));
	        
	        try {
	            axisATM.withdraw(axisAccount, 10000);
	            
	            System.out.println("Withdrawal successful!");
	        } catch (Exception e) {
	            System.out.println("Withdrawal failed: " + e.getMessage());
	        }

	        axisATM.deposit(axisAccount, 2000);
	        System.out.println("Axis ATM balance after deposit: " + axisATM.getBalance(axisAccount));

}}