package pSolve;

import java.util.Stack;

public class ReverseStringUsingStack {
	public static String ReverseString(String str) {

		char[] reverseString = new char[str.length()];
		Stack<Character> stack = new Stack<Character>();// declare a stack of type character
		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i)); // push a stack by using loop
		}

		int i = 0;
		while (!stack.isEmpty()) {
			reverseString[i++] = stack.pop(); //get character from top of the stack
		}
		return new String(reverseString);// return string object

	}

	public static void main(String[] args) {

		String str1 = "ReverseStringUsingStack";
		String str2 = "Reverse String Using Stack";
		System.out.println(ReverseString(str1));
		System.out.println(ReverseString(str2));
		

	}

}
