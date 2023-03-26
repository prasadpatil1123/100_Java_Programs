package pg29;

import java.util.Scanner;

public class subString {

	public static void main(String[] args) {

		String str, sub;
		int i, c, length;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Line : ");
		str = sc.nextLine();
		length = str.length();

		System.out.println("substring of /" + str + "/ is ");
		for (c = 0; c < length; c++) {
			for (i = c+1; i <= length; i++) {
				sub = str.substring(c,i);
				System.out.println(sub);
			}
		}
		sc.close();
	}

}
