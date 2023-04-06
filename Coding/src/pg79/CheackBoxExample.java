package pg79;

import java.awt.Checkbox;
import java.awt.Frame;

public class CheackBoxExample {
	CheackBoxExample() {
		Frame f = new Frame("CheckBox Example By Kashi");
		Checkbox cb1 = new Checkbox("C++");
		cb1.setBounds(100, 100, 50, 50);
		Checkbox cb2 = new Checkbox("Java", true);
		cb1.setBounds(100, 150, 50, 50);
		f.add(cb1);
		f.add(cb2);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

	public static void main(String[] args) {

		new CheackBoxExample();
	}

}
