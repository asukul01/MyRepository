package Polymorphism;

class Bank {
	double getROI() {
		return 0;
	}
}

class SBI extends Bank {
	double getROI() {
		return 5.5;
	}
}

class ICICI extends Bank {
	double getROI() {
		return 5.9;
	}

}

public class MethodOverriding_Test {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		System.out.println("SBI ROI = " + sbi.getROI());

		ICICI icici = new ICICI();
		System.out.println("ICICI ROI = " + icici.getROI());
	}

}
