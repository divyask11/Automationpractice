package nov8polymorphism;
class bank23{
	void rate() {
		System.out.println(" rate of intrest is ....");
	}
}
class MAHA extends bank23{
	void loan() {
		System.out.println(" mha bank loan ......");
	}
}

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MAHA ref1= new MAHA();
		ref1.rate();
		
		bank23 ref2 = new MAHA();
		ref2.rate();
		
		
	}

}
