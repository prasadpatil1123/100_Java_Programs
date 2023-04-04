package pg70;

import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success by Kashi");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
