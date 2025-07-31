package constructor2;

public class example15 {
//
	//this keyword
	
	
	int num;
	example15(int num){
		System.out.println("Local num: "+num);
		System.out.println("NSGV num: "+this.num);
		//global=local;
		
		this.num=num;	
		System.out.println("Local num: "+num);
		System.out.println("NSGV num: "+this.num);
	}
	public static void main(String[] args) {
		System.out.println("Program starts");
		example15 ref=new example15(25);
		System.out.println("Program ends");
	
	}

	

	}


