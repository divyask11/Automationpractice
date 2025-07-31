package nov5interfce;
interface i1{
	//variable ---> by default ----> public static final
		//method ---> by default ----> public abstract
		//no complete methods/non-abstract
		//no constructor
	
}


// interface declaration for first user
interface drawable{
	int salary=100;//by default---> public static final int salary=25000;
	void draw() ;//by default---->public abstract void draw();
	
}

//inmplimentation by second user 
class Renctangle1 implements drawable{
	public void draw(){
		System.out.println(" draw rectangle ");
	}	
}

class circle1 implements drawable{
	public void draw() {
		System.out.println(" draw circle ");
	}
}

// user interface bu third 
public class example1 {

	public static void main(String[] args) {
	
		
		 Renctangle1 R1= new  Renctangle1();
		 R1.draw();
		
		circle1 c1=new circle1();
		c1.draw();
//		Drawable d1=new Drawable(); can't create an instance of interface
			//Circle class object is created and refereed by Interface Drawable
			drawable d = new circle1();
			d.draw();//drawing circle

	}

}
