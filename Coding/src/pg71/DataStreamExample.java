package pg71;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DataStreamExample {

	public static void main(String[] args) throws Exception {
		try {
			FileInputStream fin = new FileInputStream("pg71\\kashi.txt");
			int i = fin.read();
			System.out.println((char) i);
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
