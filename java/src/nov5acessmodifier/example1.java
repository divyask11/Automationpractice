package nov5acessmodifier;

import nov6modifier.sample1;  modifier 

// modifier 


public class example1 {

	public static void main(String[] args) {
		   sample1 a1 = new sample1();
		     // System.out.println("private modifier :"+a1.num);
		      // private member can not acees ouside the class 
		      System.out.println(" default :"+a1.num2);// it can acess with the class by same package but not different package 	}

}
