package FactoryPattern;

import java.util.Scanner;

public class GeneratesBill {

	private static Scanner sc;

	public static void main(String[] args) {
		GetPlanFactory planFactory = new GetPlanFactory();
		sc = new Scanner(System.in);
		String c;
		do {
			System.out.println("Please enter the number for billing");
			System.out.println("1. Commercial");
			System.out.println("2. Institutional");
			System.out.println("3. Domestic");

			int option = sc.nextInt();

			System.out.println("Please enter the units");
			int units = sc.nextInt();

			Plan p = planFactory.getPlan(option);
			if (p != null) {
				System.out.print("Bill amount of plan " + option + " for " + units + " units = ");
				p.getrate();
				p.calcultaeBill(units);
			}else{
				System.out.println("You are stupid, select the right option");
			}

			System.out.println("Do you want to continue(y/n)");
			c = sc.next();
		} while (c.equalsIgnoreCase("y"));

	}

}
