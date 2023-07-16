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

	public static void main(String[] args) {

		Account iciciAccount = new Account("ic939e", 30000);
		ATM iciciATM = new IciciAtm();
		System.out.println("ICICI ATM balance: " + iciciATM.getBalance(iciciAccount));

		try {

			iciciATM.withdraw(iciciAccount, 15000);
			System.out.println("Withdrawal successful!");
		} catch (Exception e) {
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

		iciciATM.deposit(iciciAccount, 1000);
		System.out.println("ICICI ATM balance after deposit: " + iciciATM.getBalance(iciciAccount));

	}

}