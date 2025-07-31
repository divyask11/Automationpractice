package constructor2;

public class example10 {
//
	//non static 
	 int num;
	 //we create the method 
	 void calling() {
		 System.out.println("prinr LSV:"+num);
	 }
	 
	 void calling(int num) {
		 System.out.println("prinr nSV:"+num);
		 
	 }
	
	 
	
	
public static void main(String[] args) {
	example10 ref= new example10();
	ref.calling();
	ref.calling(123);
	

	}

}
