package pg88;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
	public static void main(String[] args) {
		// Creating list of Books
		List<Book> list = new ArrayList<Book>();
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Java Program Questation", "Rajendra", "Technolamror", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		System.out.println("Original content of list is: ");
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		java.util.ListIterator<Book> itr = list.listIterator();
		System.out.println("Modified content of list in backward is: ");
		while (itr.hasNext()) {
			Book st = (Book) itr.next();
			System.out.println(st.quantity + " " + st.publisher + " " + st.author + " " + st.name + " " + st.id);
		}
	}
}

/*
 * Output : Original content of list is: 101 Let us C Yashwant Kanetkar BPB 8
 * 102 Java Program Questation Rajendra Technolamror 4 103 Operating System
 * Galvin Wiley 6 Modified content of list in backward is: 8 BPB Yashwant
 * Kanetkar Let us C 101 4 Technolamror Rajendra Java Program Questation 102 6
 * Wiley Galvin Operating System 103
 */