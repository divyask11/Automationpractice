package nov8polymorphism;
class bank11{
	int num=18;
	
}
class SBI11 extends bank11{
	int num=20;
}





public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		bank11 ref2 = new SBI11();
		System.out.println("number is :"+ref2.num);//Inheritance + Upcasting = no runtime poly
		
		
	}

}
