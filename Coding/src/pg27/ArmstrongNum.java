package pg27;

public class ArmstrongNum {

	public static void main(String[] args) {
//		int n = 153;
//		int t = n;
//		int s = 0;
//		int r;
//		while (n > 0) {
//			r = n % 10;
//			n = n / 10;
//			s = s + r * r * r;
//		}
//		if (t == s) {
//			System.out.println(t + " is Armstrong number.");
//		} else {
//			System.out.println(t + " is not Armstrong number.");
//		}
		int n = 153;
		int sum = 0;
		int temp = n;
		while (temp > 0) {
		    int digit = temp % 10;
		    sum += Math.pow(digit, 3);
		    temp /= 10;
		}
		if (n == sum) {
		    System.out.println(n + " is an Armstrong number.");
		} else {
		    System.out.println(n + " is not an Armstrong number.");
		}

	}

}
