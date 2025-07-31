package oct10typeofvariable;

public class example2 {
// access static global variable
	
	static int num1=10;
	static int num2=20;
	static int result;
	
	    public static void main(String[] args) {
		System.out.println("SGV="+example2.num1); //alway use class name to acess 
		System.out.println("SGV="+example2.num2);
		
		
		result=example2.num1+example2.num2;
		num2=15;
		System.out.println("SGV="+example2.num1); //alway use class name to acess 
		System.out.println("SGV="+example2.num2);
		System.out.println("SGV RESULT="+result);
	}

}









