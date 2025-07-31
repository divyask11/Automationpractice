package nov4overriding;
class human{
	void  eat() {   // without public 
		System.out.println(" human can eat");
	}
	
}

class boy extends human{
	// over ride 
	public void eat() {
		System.out.println(" boy can eat");
	}
}
public class example3 {

	public static void main(String[] args) { // with public increase the visibility 
		boy b1=new boy();
		b1.eat();

	}

}


//Overridden method
	//in overriding we can increase the visibility of overridden method --> default-->protected-->public
	// default ---> default or protected or public
	// protected ---> protected or public
	// public ----> public
