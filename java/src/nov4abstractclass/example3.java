package nov4abstractclass;
abstract class RBIbank{
	abstract double getRateOfInterestForHomeLoan(); // variable declaration
	final void loan () {
		System.out.println("as  per rbi loan ");
	}
}

class SBI extends RBIbank{
	double getRateOfInterestForHomeLoan() {
	return 60.65;
}
	void openpfact() {
		System.out.println(" SBI open pF account");
	}
}
	
	class NBI extends RBIbank{
		 double getRateOfInterestForHomeLoan() {
			return 50.50;
		}
		
	
	}
	

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method st
		
		NBI n1=new  NBI();
		n1.loan();
		System.out.println("NB getrateofintrst:"+n1.getRateOfInterestForHomeLoan());
		
		
		SBI n2=new  SBI();
		n2.loan();
		System.out.println("NB getrateofintrst:"+n2.getRateOfInterestForHomeLoan());
		
		
		RBIbank b1=new NBI();
		b1.loan();
		System.out.println("NB getrateofintrst:"+n1.getRateOfInterestForHomeLoan());

		RBIbank b2=new SBI();
		b2.loan();
		System.out.println("SNB getrateofintrst:"+n1.getRateOfInterestForHomeLoan());

		
		
	}

}

