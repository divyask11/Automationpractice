package javaoct15method;

public class example9 {
	
  
   
	
		public class Assignment {

			public static void main(String[] args) {
				System.out.println("is given number prime? "+checkPrime(23));
			}
			
			static boolean checkPrime(int num) {
				int ct=0;
				boolean res;
				System.out.println("Number is "+num);
				for(int i=1;i<=num;i++) {
					if(num>1) {
						if(num%i==0) {
							ct++;
						}
					}else {
						System.out.println("Either the given numbe is 1 or less then 1.");
					}
				}		
				if(ct==2) {
					res=true;
				}else {
					res=false;
				}
				return res;
			}

		}
		/*
		WAM for
			palindrome
			to check prime number
			to print even number of given range
			factor of +ive number
		
		ref.printDetails();
		System.out.println("*********************************");
		ref.reverseNumber(502);
		//System.out.println(ref.reverseNumber(502));//compile time error as we can't call void return type method from print
		System.out.println("************************************");
		//ref.getReverseNumber(714);//body will be executed but return value can;t be used	
		//System.out.println(ref.getReverseNumber(714));//body and return value both will be printed
		
		int rev=ref.getReverseNumber(714);//body will be executed and return value will be stored for future use
		System.out.println(rev);
		System.out.println("Program Ends");
	}
	void printDetails() {
		System.out.println("Welcome to java session");
		System.out.println("You are learning function/method");
		System.out.println("After this, we will learn overloading");
	}
	int getReverseNumber(int num) {
		int rem,rev=0;
		System.out.println("Initial number: "+num);
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