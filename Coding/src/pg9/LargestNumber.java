package pg9;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println(" Given Numbers are : " + x + "," + y + "," + z + "");
		if(x > y || x > z) {
			System.out.println("First number is Greater than other two.");
		}else if(y > x || y > z) {
			System.out.println("Second number is Greater than other two.");
		}else if(z > x || z > y) {
			System.out.println("Third number is Greater than other two.");
		}else {
			System.out.println("Given numbers are Distinct.");
		}
		sc.close();
	}

}
