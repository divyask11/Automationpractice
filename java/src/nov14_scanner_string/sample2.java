package nov14_scanner_string;

public class sample2 {

	public static void main(String[] args) {
		
		
		String s1=new String ("banglore");
		System.out.println("s1:"+s1);
		System.out.println("no of char:"+s1.length());
		
		System.out.println("s1:"+s1.trim());
		System.out.println("no of char in s1 :"+s1.trim().length());
		
		String s2="a am core java , and learning string ";
		
		System.out.println("s2:"+s2);
		
		
		String[] words=s2.split("a");
         for(String sch:words) {
        	 System.out.println(sch);
         }
         
         System.out.println("s2:"+s2);
         String[] words1=s2.split(" ",4);
         for(String sch:words) {
        	 System.out.println(sch);
         }
	}

}
