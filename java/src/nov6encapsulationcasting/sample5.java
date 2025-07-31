package nov6encapsulationcasting;


public class sample5 {

	public static void main(String[] args) {
//		
	
		Child ref1=new Child();
		ref1.myHome();
		ref1.myCar();
		ref1.myBike();
		// we occre all the property with help of ref 1 
		
		
		// Father ref2= ref1; // auto casting implicit
		//Father ref2=(Father)ref1; //explicitit upcasting 
		Father ref2=(Father)new Child();
		ref2.myHome();
		ref2.myCar();		
		
		
		//GrandFather ref3=ref1;//auto
		//GrandFather ref3=(GrandFather)ref1; // explicit 
		GrandFather ref3=(GrandFather)new Child();// explicit 
		ref3.myHome();
		
		
		
		
		
		
		
	}

}
