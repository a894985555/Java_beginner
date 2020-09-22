package week1;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		String a = cin.nextLine();
		int length = a.length();
		System.out.println(length);
		cin.close();
	}
}