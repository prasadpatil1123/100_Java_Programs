package pg54;

import java.sql.Date;

public class StringToSQLDateExample {

	public static void main(String[] args) {

		String str = "2023-01-22";
		Date date = Date.valueOf(str);
		System.out.println(date);
	}

}
// 2023-03-11