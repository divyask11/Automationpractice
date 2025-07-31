package javaoct14;

public class forloopex2 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			System.out.println("helow");
		}
			
		System.out.println("*********print 1 to 5 *****************");
		
		for(int i=1;i<=5; i++) {
			System.out.println(i);
		}
		
System.out.println("*********print 5 to 1*****************");
		
		for(int i=5;i>=1; i--) {
			System.out.println(i);
		}
		
		
System.out.println("*********even no bet 1 -10*****************");
		
		for(int i=1;i<=10; i++) {
			if(i%2==0) {
			System.out.println(i);
		}	
		}
	
System.out.println("*********odd no bet 1 -10*****************");
		
		for(int i=1;i<=10; i++) {
			if(i%2==1) {
			System.out.println(i);
		}
		}



System.out.println("**********Print Character from A to Z***************");
for(char ch='A';ch<='Z';ch++) {
	System.out.print(ch+" ");
}
System.out.println("**********Print Character from A to Z***************");
for(char ch='a';ch<='l';ch++) {
	System.out.println(ch+" ");
}

System.out.println("**********Print Character from z to a***************");
for(char ch='z';ch>='a';ch--) {
	System.out.print(ch+ " ");
}
	}
}
