package pg11;

import java.util.Scanner;

public class Ifelse {

	public static void main(String[] args) {
	int marksobtained;
	int passingmarks = 40;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Marks : ");
	marksobtained = sc.nextInt();
	if(marksobtained >= passingmarks) {
		System.out.println("You are Passed");
	}else {
		System.out.println("You are Failed");
	}
	sc.close();

	}

}
