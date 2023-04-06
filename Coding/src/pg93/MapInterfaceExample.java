package pg93;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceExample {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Kashi");
		map.put(101, "Prasad");
		map.put(102, "Patil");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}

//output 
//100 Kashi
//101 Prasad
//102 Patil
