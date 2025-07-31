package nov14_scanner_string;

public class example5 {

	public static void main(String[] args) {
		// string example 
		//String object using literal and object will be stored in String Constant Pool area of heap

		
		String s1="pune";
		String s2="pune";// no obje created as it not unique
		String s3="banglore";
		
		
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
