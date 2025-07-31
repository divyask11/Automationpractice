package constructor2;

public class example13 {
//
	//this keyword
	 int num =145;
	 //we create the method 
	 void calling() {
		 System.out.println("prinr LSV:"+num);
	 }
	 
	 void calling(int num) {
		 System.out.println("prinr nSV:"+num);
		 example13 ref1= new example13();
		 System.out.println("NSGV:"+ref1.num);//its can acses the nsgv value 145
		 
	 }
	
	 
	
	
public static void main(String[] args) {
	example13 ref= new example13();
	ref.calling();
	ref.calling(123);
	

	}

}
