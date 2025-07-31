package javaoct15method;

public class example8 {
	
  
   
	public static void main(String[] args) {
	
		System.out.println("Program Starts");
		//create a referance variable 
		example8 ref=new example8();
		ref.printdetail();
		
		
		
		System.out.println("************reverse num*******************");
ref.getreversenum(123);
		
		
		
		System.out.println("********************************");
		ref.reverseNumber(123);
		
		System.out.println("****************************");
		
		System.out.println("Program Ends");
		
	}
	
	void printdetail() {
		System.out.println("heloow java");
		System.out.println("its a automation");
		System.out.println("its a manual testing ");
	}
	
	
	
	int  getreversenum(int num) {
		int rem , rev=0;
		System.out.println("inial num="+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		return rev;
	}	
	void reverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
		for(;num>0;)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse number: "+rev);
	}
		
	}
	
	
	
	




		
		
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/
		
		
		
	












// we can write this repetadly but id time consuming