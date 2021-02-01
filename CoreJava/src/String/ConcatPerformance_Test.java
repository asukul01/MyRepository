package String;

public class ConcatPerformance_Test {
	static String concatWithString() {
		String s = "Hello";
		for (int i = 0; i <= 1000; i++) {
			s = s + "World";
		}
		return s;
	}

	// StringBuffer is synchronized i.e. thread safe. It means two threads can't
	// call the methods of StringBuffer simultaneously.
	// StringBuffer is less efficient than StringBuilder.
	static StringBuffer concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Hello");
		for (int i = 0; i <= 1000; i++) {
			sb = sb.append("World");
		}
		return sb;
	}

	// StringBuilder is non-synchronized i.e. not thread safe. It means two
	// threads can call the methods of StringBuilder simultaneously.
	// StringBuilder is more efficient than StringBuffer.
	static StringBuilder concatWithStringBuilder() {
		StringBuilder sb = new StringBuilder("Hello");
		for (int i = 0; i <= 1000; i++) {
			sb = sb.append("World");
		}
		return sb;
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken for String concat " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println("Time taken for StringBuffer concat " + (System.currentTimeMillis() - startTime) + "ms");
		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println("Time taken for StringBuilder concat " + (System.currentTimeMillis() - startTime) + "ms");
	}

}
