package pg15;

import java.util.Scanner;

public class compareStrings {

	public static void main(String[] args) {
		String s1,s2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first String here : ");
		
		s1 = sc.nextLine();
		
		System.out.println("Enter your second String here : ");
		s2 = sc.nextLine();
		
		if(s1.compareTo(s2) > 0) {
			System.out.println("first string is greater than second string");
		}else if(s1.compareTo(s2) < 0) {
			System.out.println("first string is smaller than second string");
		}else {
			System.out.println("both are equal");
		}
		sc.close();
	}

}
