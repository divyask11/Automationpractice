package nov8polymorphism;
class Bank2{
	int num=102;
}
class SBI2 extends Bank2{
	int num=103;
}
public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		Bank2 ref2=new SBI2();//Inheritance + Upcasting = no runtime poly
		System.out.println(ref2.num);
	}

}
