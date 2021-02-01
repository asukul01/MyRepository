package Exception;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		System.out.println("Enter 2 numbers to divide");
		Scanner s = new Scanner(System.in);
		int num1 = s.nextInt();
		int num2 = s.nextInt();

		try {
			System.out.println(num1 + "/" + num2 + " = " + num1 / num2);
			System.out.println("Rest of the code before catch");
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by 0" + "exception msg = " + e.getMessage());
		}

		System.out.println("Rest of the code after catch");
		
		PrintWriter p;
		try{
			p= new PrintWriter("abc.txt");
			System.out.println("Saved");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
		
		System.out.println("Rest of code after fprint writer");
		
		String str = null;
		try{
			System.out.println(str.length());
		}catch(ArithmeticException e){
			System.out.println("Arithmatic exception");
		}catch(Exception e){
			System.out.println("Parent exception " + e.getMessage());
		}
	}

}
