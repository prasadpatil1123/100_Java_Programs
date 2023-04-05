package pg73;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.Technolamror.com");
			System.out.println("Host Name: " + ip.getHostName());
			System.out.println("Ip Address: " + ip.getHostAddress());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
