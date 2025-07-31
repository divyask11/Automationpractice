package nov6encapsulationcasting;

public class sample3 {
// castingg 
	
	
	
	
	
public static void main(String[] args) {
	///windinf operation
   addition(10,20);
 System.out.println("*****************");
   System.out.println("reverse no is:"+getrevnum(123));
 System.out.println("intrsdt is :"+getintrest(12,12.23,12));      
}


static int getintrest(int p,double r ,int t) {
	
	double interest=(p*r*t)/100;
	
	return (int)interest;//narrowing its is only done by explicit 
}


static double getrevnum(int num) {
	System.out.println("Original number is: "+num);
	int rev=0,rem=0;
	while(num>0) {
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	return rev;

	
	
}
	
	
	static void addition(int num1,double num2) {//int num1=25 | double num2=25;//implicit widening
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2 );
		double result=num1+num2;
		System.out.println("result:"+result);
		
	}
       
       
	}


//byte<short<int<long<float < double1
// +