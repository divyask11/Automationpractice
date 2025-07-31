package javaoct15method;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("program start");
   printdetail();
   System.out.println("*****************************************");
   example3.printdetail();// the stand method to call the static method by using classname 
   System.out.println("*******second method call*************");
   testdata();
   System.out.println("**************************************");
   example3.testdata();
   
   //now we are calling this in multiple time 
   
   
   
   System.out.println("program end ");
		
		
		
		
		
		//method call 
		
		
	}
		static void printdetail() {
			System.out.println("welcome");
			System.out.println("its java batch");
			System.out.println("in next selenium");
		}
			
			static void testdata() {
				System.out.println("test case");
				System.out.println("for manual testing");
				System.out.println("for automation ");
			}
			
			
		}
		
		
		
		
/*
Function/method: contains set of repetitive statements which needs to executed based on the need

void: a method should be declared with void return type when we don't want to return any value to JVM
*/
		
		
		
	












// we can write this repetadly but id time consuming