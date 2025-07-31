package nov14_scanner_string;

public class example7 {

	public static void main(String[] args) {
		// string example 
		//String object using new keyword and object will be stored outside String Constant Pool area of heap

		
		String s1=new String("pune");//two object created  1. String Constanr Pool 2. Non SCP
		String s2=new String ("pune");// one obj created in non scp
		String s3=new String ("banglore");//two object created  1. String Constanr Pool 2. Non SCP
		
		
		System.out.println("s1:"+s1);//toString() is overried that will give value stored inside the object
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		
		// comparing two obj based on value
		System.out.println("compare s1 and s2:"+s1.equals(s2));
		System.out.println("compare s3 and s1:"+s3.equals(s1));

		// comparing two obj based on address
		 System.out.println("s1=s2:"+(s1==s2));
		System.out.println("s1=s3:"+(s1==s3));
		
		
		

	}

}
