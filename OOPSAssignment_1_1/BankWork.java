package OOPSAssignment_1_1;

public class BankWork {
	String nameOfDepositer, accountType;
	int accountNumber, balanceAmount;

	void assignValue() {
		nameOfDepositer = "Ruturaj";
		accountType = "Saving";
		accountNumber = 123345;
		balanceAmount = 20000;
	}

	int depositAmount() {
		int deposit = 5000;
		balanceAmount = balanceAmount + deposit;
		return deposit;
	}

	int withdrawAmount() {
		int withdraw = 1000;
		return withdraw;
	}

	void display() {
		System.out.println(nameOfDepositer);
		System.out.println("Amount Balance is = " + (balanceAmount - withdrawAmount()));
	}

	public static void main(String[] args) {

		BankWork b = new BankWork();
		b.assignValue();
		b.depositAmount();
		b.withdrawAmount();
		b.display();

	}
}
