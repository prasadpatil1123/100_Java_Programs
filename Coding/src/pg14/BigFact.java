
package pg14;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFact {

	public static void main(String[] args) {
		int n;
		BigInteger inc = new BigInteger("1");
		BigInteger fact = new BigInteger("1");
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		n = x.nextInt();
		
		
		for(int c = 1; c <= n; c++ ) {
			fact = fact.multiply(inc);
			inc = inc.add(BigInteger.ONE);
		}
		System.out.println(n + " ! = "+fact);
		x.close();
	}

}
