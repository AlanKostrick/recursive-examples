package recursion;

import java.util.Scanner;

public class RecursiveApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		RecursiveMethods demo = new RecursiveMethods();

		System.out.println("Enter the example # you would like to test");
		System.out.println("Enter 1 for a call to mystery(4)");
		System.out.println("Enter 2 for a call to mystery(4,3,5)");
		System.out.println("Enter 3 for a call to recur(27)");
		System.out.println("Enter 4 for a call to recur(3,2,6)");
		System.out.println("Enter 5 for a call to recur(6,8)");
		System.out.println("Enter 6 for a call to result(5)");
		int example = input.nextInt();

		if (example == 1) {
			System.out.println("a call to mystery(4) produces a value of: " + demo.mystery(4));
		} else if (example == 2) {
			System.out.println("a call to mystery(4,3,5) produces a value of: " + demo.mystery(4, 3, 5));
		} else if (example == 3) {
			System.out.println("a call to recur(27) produces a value of: " + demo.recur(27));
		} else if (example == 4) {
			System.out.println("a call to recur(3,2,6) produces a value of: " + demo.recur(3, 2, 6));
		} else if (example == 5) {
			System.out.println("a call to recur(6,8) produces a value of: " + demo.recur(6, 8));
		} else if (example == 6) {
			System.out.println("a call to result(5) produces a value of: " + demo.result(5));
		} else {
			System.out.println("invalid input");
		}

	}

}
