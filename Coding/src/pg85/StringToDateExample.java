package pg85;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateExample {

	public static void main(String[] args) {
		String Date1 = "31/12/2023";
		String Date2 = "31-Dec-2023";
		String Date3 = "12 31, 2023";
		String Date4 = "Thu, Dec 31 2023";
		String Date5 = "Thu, Dec 31 2023 23:35:50";
		String Date6 = "31-Dec-2023 23:35:50";

		SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat f2 = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat f3 = new SimpleDateFormat("MM dd, yyyy");
		SimpleDateFormat f4 = new SimpleDateFormat("E, MM dd yyyy");
		SimpleDateFormat f5 = new SimpleDateFormat("E, MM dd yyyy HH:mm:ss");
		SimpleDateFormat f6 = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");

		try {
			Date d1 = f1.parse(Date1);
			Date d2 = f2.parse(Date2);
			Date d3 = f3.parse(Date3);
			Date d4 = f4.parse(Date4);
			Date d5 = f5.parse(Date5);
			Date d6 = f6.parse(Date6);

			System.out.println("String To Date Converter by Kashi");

			System.out.println(Date1 + " " + d1);
			System.out.println(Date2 + " " + d2);
			System.out.println(Date3 + " " + d3);
			System.out.println(Date4 + " " + d4);
			System.out.println(Date5 + " " + d5);
			System.out.println(Date6 + " " + d6);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
