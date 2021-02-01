package Object;

public class Account {
	int acc_no;
	String name;
	float acc_bal;

	// Method to initialize
	void insert(int a, String n, float b) {
		acc_no = a;
		name = n;
		acc_bal = b;
	}

	void deposit(int amt) {
		acc_bal += amt;
	}

	void withdraw(int amt) {
		acc_bal -= amt;
	}

	void displayBalance() {
		System.out.println("Balance : " + acc_bal);
	}

	void display() {
		System.out.println("Name : " + name + "; Account Number : " + acc_no + "; Balance : " + acc_bal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account();
		a1.insert(101, "Aritra", 100);
		a1.display();

		// deposit 200
		a1.deposit(200);
		a1.displayBalance();

		// withdraw 50
		a1.withdraw(50);
		a1.displayBalance();

		// display details
		a1.display();
	}

}
