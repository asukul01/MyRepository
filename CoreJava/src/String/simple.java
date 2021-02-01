package String;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

public class simple {
	public static void main(String[] args) {

		String s = "abc";
		System.out.println("Hashcode of s : " + s.hashCode());
		String s1 = "bcd";
		System.out.println("Hashcode of s1 : " + s1.hashCode());
		System.out.println("Hashcode of s1 after concat bcd : " + (s1+"bcd").hashCode());
		String s2 = new String("abc");
		System.out.println("s==s1" + s == s1);
		System.out.println("s==s2" + s == s2);
		System.out.println("s.equals(s2)" + s.equals(s2));
		System.out.println("s.equals(s1)" + s.equals(s1));

		byte[] b_arr = { 65, 68, 78, 90, 102, 119, 122 };
		String s3 = new String(b_arr);
		Charset c = Charset.defaultCharset();
		String s4 = new String(b_arr, c);

		System.out.println(s3);
		System.out.println(s4); //
		System.out.println(s3);

		String st1 = "Sachin";// created in scp
		String st2 = "Sachin";// points to the same instance of s1.
		String st3 = new String("Sachin");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);

		String sep = " Hello   ";
		System.out.println(String.join(sep, "first", "second", "third"));
		List<String> elements = Arrays.asList(new String[] { "first", "second", "third" });
		System.out.println(String.join(sep, elements));

		String value = "Hello" + "" + "World";
		value.chars().forEach(character -> {
			System.out.print(character + " ");
		});
		System.out.println();
		value.codePoints().forEach(character -> {
			System.out.print(character + " ");
		});

		String value1 = "";
		// System.out.println(value1.isBlank());
		System.out.println(value1.isEmpty());

		/*
		 * String s = "GeeksforGeeks"; // or String s= new String
		 * ("GeeksforGeeks");
		 * 
		 * // Returns the number of characters in the String.
		 * System.out.println("String length = " + s.length());
		 * 
		 * // Returns the character at ith index. System.out.println(
		 * "Character at 3rd position = " + s.charAt(3));
		 * 
		 * // Return the substring from the ith  index character // to end of
		 * string System.out.println("Substring " + s.substring(3));
		 * 
		 * // Returns the substring from i to j-1 index. System.out.println(
		 * "Substring  = " + s.substring(2, 5));
		 * 
		 * // Concatenates string2 to the end of string1. String s1 = "Geeks";
		 * String s2 = "forGeeks"; System.out.println("Concatenated string  = "
		 * + s1.concat(s2));
		 * 
		 * // Returns the index within the string // of the first occurrence of
		 * the specified string. String s4 = "Learn Share Learn";
		 * System.out.println("Index of Share " + s4.indexOf("Share"));
		 * 
		 * // Returns the index within the string of the // first occurrence of
		 * the specified string, // starting at the specified index.
		 * System.out.println("Index of a  = " + s4.indexOf('a', 3));
		 * 
		 * // Checking equality of Strings Boolean out =
		 * "Geeks".equals("geeks"); System.out.println("Checking Equality  " +
		 * out); out = "Geeks".equals("Geeks"); System.out.println(
		 * "Checking Equality  " + out);
		 * 
		 * out = "Geeks".equalsIgnoreCase("gEeks "); System.out.println(
		 * "Checking Equality " + out);
		 * 
		 * // If ASCII difference is zero then the two strings are similar int
		 * out1 = s1.compareTo(s2); System.out.println(
		 * "the difference between ASCII value is=" + out1); // Converting cases
		 * String word1 = "GeeKyMe"; System.out.println(
		 * "Changing to lower Case " + word1.toLowerCase());
		 * 
		 * // Converting cases String word2 = "GeekyME"; System.out.println(
		 * "Changing to UPPER Case " + word2.toUpperCase());
		 * 
		 * // Trimming the word String word4 = " Learn Share Learn ";
		 * System.out.println("Trim the word " + word4.trim());
		 * 
		 * // Replacing characters String str1 = "feeksforfeeks";
		 * System.out.println("Original String " + str1); String str2 =
		 * "feeksforfeeks".replace('f', 'g'); System.out.println(
		 * "Replaced f with g -> " + str2);
		 */
	}
}