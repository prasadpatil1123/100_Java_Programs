package pg91;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Kashi {

	public static void main(String[] args) {
		TreeSet<String> al = new TreeSet<String>();
		al.add("Kashi");
		al.add("Prasad");
		al.add("Madhukar");
		al.add("Patil");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
//
//output
//Kashi
//Madhukar
//Patil
//Prasad