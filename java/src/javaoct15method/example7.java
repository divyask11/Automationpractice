package javaoct15method;

public class example7 {
	
    // declaration direct rev num 
   
	public static void main(String[] args) {
	
		System.out.println("Program Starts");
		//create a referance variable 
		example7 ref=new example7();
		int amount=2000;   //we declare the value of t
		//  can we directly call without declaration 
		double intrest=ref.getintrest(amount,20,30);
		System.out.println(" principle of intrest="+intrest);
		 double finalamount= amount+ intrest;
		 System.out.println("final amount="+finalamount);
		
		
		System.out.println("*******************************");
		// we try to directly call
		System.out.println("********************************");
		double intrest2=ref.getintrest(746,20,30);
		System.out.println(" principle of intrest="+intrest2);
		 double finalamount2= amount+ intrest;
		 System.out.println("final amount="+finalamount2);
		
		System.out.println("Program Ends");
		
	}
		double getintrest(int p,double r,int t) {
			System.out.println("principle="+p);

			System.out.println("roi="+r);
			System.out.println("time="+t);
double res= p*r*t/100;
return res;


		
		
		
	}
}

		
		
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/
		
		
		
	












// we can write this repetadly but id time consuming