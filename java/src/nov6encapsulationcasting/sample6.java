package nov6encapsulationcasting;

// down casting 
// its not possible direct ly 1st create up cating then down cating 
public class sample6 {

	public static void main(String[] args) {
//		 Child c1 = new grandfather(); 
		// not possible directly 
		
		
		GrandFather ref1=new Child(); // upcasting done 
		ref1.myHome();
		
		// down casting
		Child c1=(Child)ref1;// down casting auto not possible 
		c1.myHome();
		c1.myBike();
		c1.myCar();
		
		
		
		
		
	}

}
