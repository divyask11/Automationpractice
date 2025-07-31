package nov8polymorphism;


class nbi{
	void roi() {
		System.out.println("Bank roi is 10.56");
	}
}
class SBI extends nbi{
	void roi() {
		System.out.println("SBI roi is 12.56");
	}
}
public class example2 {

	public static void main(String[] args) {
		SBI ref1=new SBI();
		ref1.roi();
		
		nbi ref2=new nbi();//Inheritance + Upcasting + overriding
		ref2.roi();
	}

}