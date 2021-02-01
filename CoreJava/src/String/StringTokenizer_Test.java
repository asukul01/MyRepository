//StringTokenizer class is deprecated now. It is recommended to use split() method of String class or regex (Regular Expression)

package String;

import java.util.StringTokenizer;

public class StringTokenizer_Test {

	public static void main(String[] args) {

		String s = "I,love: my}{country ''India";
		StringTokenizer str = new StringTokenizer(s, "}");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

		String str1[] = s.split("I");
		for (String st : str1) {
			System.out.println(st);
		}
	}

}
