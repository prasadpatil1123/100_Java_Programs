package pg55;

import java.sql.Date;
import java.text.*;

public class SimpleDateFormatExample2 {

	public static void main(String[] args) {

		Date date = new Date(1);
		System.out.println("Date format changed by Kashi"); // Date format changed by Kashi
		SimpleDateFormat formater = new SimpleDateFormat("MM/DD/YY");
		String strDate = formater.format(date);
		System.out.println("Date format with MM/DD/YY : " + strDate); // Date format with MM/DD/YY : 01/01/70

		formater = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strDate = formater.format(date);
		System.out.println("Date format with dd-M-yyyy hh:mm:ss : " + strDate); // Date format with dd-M-yyyy hh:mm:ss :
																				// 01-1-1970 05:30:00

		formater = new SimpleDateFormat("dd MMMM yyyy");
		strDate = formater.format(date);
		System.out.println("Date format with dd MMMM yyyy : " + strDate); // Date format with dd MMMM yyyy : 01 January
																			// 1970

		formater = new SimpleDateFormat("dd MMMM yyyy zzzz");
		strDate = formater.format(date);
		System.out.println("Date format with dd MMMM yyyy zzzz : " + strDate);// Date format with dd MMMM yyyy zzzz : 01
																				// January 1970 India Standard Time

		formater = new SimpleDateFormat("E, dd MMMM yyyy HH:mm:ss z");
		strDate = formater.format(date);
		System.out.println("Date format with E, dd MMMM yyyy HH:mm:ss z : " + strDate);// Date format with E, dd MMMM
																						// yyyy HH:mm:ss z : Thu, 01
																						// January 1970 05:30:00 IST
	}

}
