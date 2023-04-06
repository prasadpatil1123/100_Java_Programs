package pg89;

import java.util.HashSet;
import java.util.Iterator;

public class TestCollection9 {

	public static void main(String[] args) {

		HashSet<String> htr = new HashSet<String>();
		htr.add("Kashi");
		htr.add("Prasad");
		htr.add("Yash");
		htr.add("KashiPrasad");

		Iterator<String> itr = htr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
/*
 * output Kashi Prasad Yash KashiPrasad
 */
