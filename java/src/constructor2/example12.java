package constructor2;

public class example12 {
//
	//this keyword
	 int num;
	 //we create the method 
	 void calling() {
		 System.out.println("prinr LSV:"+num);
	 }
	 
	 void calling(int num) {
		 System.out.println("prinr nSV:"+num);
		 example12 ref2=new example12();
		 System.out.println("new lsv:"+ref2.num);
		 System.out.println("NSGV  this Number is: "+this.num);
			System.out.println("this keyword value: "+this);
	 }
	
	 
	
	
public static void main(String[] args) {
	example12 ref= new example12();
	ref.calling();
	ref.calling(123);
	

	}

}



/*
this keyword:
	its known as current class instance/object
	its used only inside non-static method/constructor
	its used to access non-static members of the class
	mainly used to differentiate when non-static global variable name and nonstatic method local variable name are same

*/




