package pg87;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List {

	public static void main(String[] args) {
		LinkedList<String> Al = new LinkedList<String>();
		Al.add("Game of Thrones");
		Al.add("Breaking Bad");
		Al.add("Bard of Blood");
		Al.add("Mandalorian");

		Iterator<String> itr = Al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}/*
	 * output: Game of Thrones Breaking Bad Bard of Blood Mandalorian
	 */