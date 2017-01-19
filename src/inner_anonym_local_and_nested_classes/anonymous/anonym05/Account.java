package inner_anonym_local_and_nested_classes.anonymous.anonym05;

public class Account {
	private double amount = 108;
	private final String number;
	private final String owner;
	public Account(String number, String owner) {
		this.number = number;
		this.owner = owner;
	}
	double getAmount() { return amount; }
	String getNumber() { return number; }
	String getOwner() {	return owner; }
	double withdraw(double amountToWithdraw) {
		if (amount > 0) {
			if (amount > amountToWithdraw) {
				amount -= amountToWithdraw;
				return amountToWithdraw;
			}
			if (amount < amountToWithdraw) {
				double temp = amount;
				amount = 0;
				return temp;
			}
		}
		return 0.0;
	}

	void toDeposit(double amountToDeposit) {
		amount += amountToDeposit;
	}

	class Card {
		private final String number;
		private final String owner;
		Card(String number, String owner) {
			this.number = number;
			this.owner = owner;
		}
		String getNumber() { return number; }
		String getOwner() { return owner; }
		double withdraw(double amountToWithdraw) {
			return Account.this.withdraw(amountToWithdraw);
		}
		double getAmount() { return amount; }
		void toDeposit(double amountToDeposit) { 
			amount += amountToDeposit; 
		}
	}
}
