package pg100;

public class Test2 {

	public static void main(String[] args) {
		
		SBI I = new SBI();
		ICICI C = new ICICI();
		AXIS A = new AXIS();
		
		System.out.println("SBI Rate of Interest : "+ I.getRateInterest());
		System.out.println("ICICI Rate of Interest : "+ C.getRateInterest());
		System.out.println("AXIS Rate of Interest : "+ A.getRateInterest());
		
	}

}
