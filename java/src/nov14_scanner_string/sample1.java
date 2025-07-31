package nov14_scanner_string;

public class sample1 {

	public static void main(String[] args) {
		
		String s1=new String("banglore");
		System.out.println("s1:"+s1);//two object 1. SCP 2. Non SCP
		
		
		System.out.println("no of char in string :"+s1.length());//show cut of char
		
		System.out.println("char at 3rd index :"+s1.charAt(3));
		//showing which char are present in index no 3 
		
		for(int i=0;i<s1.length();i++) {
			System.out.println(s1.charAt(i));// print single char in every line 
			
				}
		
		System.out.println(s1.isEmpty());// it say ur string is empty or not as true false
		System.out.println(s1.startsWith("ban"));// it show can ur string is start with ban
		
		System.out.println(s1.endsWith("re"));//ur string end with re?
		System.out.println(s1.indexOf("l"));
		
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.replace('a', 'o'));
		System.out.println(s1.replaceFirst("a", "p"));
		
		
		
		
	}

}
