package constructor2;
int age;
double salary;
Example8(){
	System.out.println("I am zero-param cons...");
}
Example8(int num){
	System.out.println("I am int-param cons...");
	age=num;
}
Example8(double num){
	System.out.println("I am double-param cons...");
	salary=num;
}
Example8(int num1,double num2){
	System.out.println("I am int-double-param cons...");
	age=num1;
	salary=num2;
}
void display() {
	System.out.println("Printing NSGV values, age: "+age+" & Salary: "+salary);
}
public static void main(String[] args) {
	System.out.println("Program Starts");
	Example8 ref1=new Example8();
	ref1.display();
	
	Example8 ref2=new Example8(25);
	ref2.display();
	
	Example8 ref3=new Example8(25000.36);
	ref3.display();
	
	Example8 ref4=new Example8(35,25000.36);
	ref4.display();
	System.out.println("Program Ends");
	
	
}
}


// referance prog