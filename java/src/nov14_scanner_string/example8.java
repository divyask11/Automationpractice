package nov14_scanner_string;

public class example8 {

	public static void main(String[] args) {
		// string example 
		//String object using new keyword and object will be stored outside String Constant Pool area of heap

		
		String s1=new String("pune");//two object created  1. String Constanr Pool 2. Non SCP
		String s2=new String ("pune");// one obj created in non scp
		String s3=new String ("banglore");//two object created  1. String Constanr Pool 2. Non SCP
		String s4="pune";//no object created, it will point to the same object created by s1
		String s5="Banglore";//String object using literal and object will be stored in String Constant Pool area of heap

		
		System.out.println("s1:"+s1);//toString() is overried that will give value stored inside the object
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println("s5:"+s5);
		
		// comparing two obj based on value
		System.out.println("compare s1 and s2:"+s1.equals(s2));
		System.out.println("compare s3 and s1:"+s3.equals(s1));
		System.out.println("compare s1 and s4:"+s1.equals(s4));
		System.out.println("compare s2 and s4:"+s2.equals(s4));


		// comparing two obj based on address
		 System.out.println("s1=s2:"+(s1==s2));
		System.out.println("s1=s3:"+(s1==s3));
		 System.out.println("s1=s4:"+(s1==s4));
			System.out.println("s1=s3:"+(s2==s4));
			
		
		

	}

}
