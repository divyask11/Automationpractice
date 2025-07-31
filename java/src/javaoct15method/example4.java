package javaoct15method;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("program start");
  addnum();
   System.out.println("*****************************************");
   example4.addnum();// the stand method to call the static method by using classname 
   System.out.println("*******second method call*************");
   substractnum();
   System.out.println("**************************************");
  example4.substractnum();
  System.out.println("*********************multiply call ***************");
  multiplication(10,20); // in this we add a no to direct method call
  System.out.println("______________");
  example4. multiplication(10,20);
   //now we are calling this in multiple time 
   
   
   
   System.out.println("program end ");
		
		
		
		
		
		//method call 
		
		
	}
		static void addnum() {
			int num1=5, num2=20, res= num1+ num2;
			System.out.println("number1="+num1);
			System.out.println("number2="+num1);
			System.out.println("result="+res);

		}
			
			 static void substractnum() {
				 int num1=50,num2=100,res=num2-num1;
				 System.out.println("number1="+num1);
					System.out.println("number2="+num2);
					System.out.println("result="+res);
					
			 }	
			 
			 static void multiplication(int num1, int num2) {
				int  res=num1*num2;
				 System.out.println("number1="+num1);
				 System.out.println("number2="+num2);
				 System.out.println("result="+res);
				 
				 
			 }
			 
		}
		
		
		
		
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/
		
		
		
	












// we can write this repetadly but id time consuming