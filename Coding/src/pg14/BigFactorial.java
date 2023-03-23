package pg14;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		    System.out.println("ENter a number");
		    int n=sc.nextInt();

		    if (n < 0) 
		    {
		        System.out.println("Negative number not allowed");
		    }
		    
		    BigInteger result = BigInteger.ONE;  //class
		    
		    for (int i = 2; i <= n; i++)
		    {
		        result = result.multiply(BigInteger.valueOf(i)); //method
		    }
		    System.out.println(n + " != "+ result);
		    sc.close();
		  } 
	}


