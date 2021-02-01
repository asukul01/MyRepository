package EnumumeratedList;

public class Demo {

	public static void main(String[] args) {
		learning learn = learning.COLLECTIONS;
		switch (learn) {
		case COLLECTIONS:
			System.out.println("Collection framework");
			break;
		case CORE_JAVA:
			System.out.println("Core Java");
			break;
		case GENERICS:
			System.out.println("Generics");
			break;
		case JSPANDSERVLETS:
			System.out.println("JSP and Servlets");
			break;
		case MULTITHREADING:
			System.out.println("Multithreading");
			break;
		default:
			System.out.println("Wrong option");
			break;

		}

	}

}
