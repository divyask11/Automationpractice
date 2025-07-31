package oct22thistatement;
// we can use this() to called constructor for creating only one obje
public class example2 {

	example2(){
		this(25.36);
		System.out.println("I am zero-param cons...");
	}
	example2(int num){
		System.out.println("I am int-param cons...");
	}
	example2(double num){
		this(11);
		System.out.println("I am double-param cons...");
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
	example2 ref1=new example2();
		System.out.println("Program ends");
	}

}

//to called constructor we can create a new obj for all const



