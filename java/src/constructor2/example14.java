package constructor2;

public class example14 {
//
	//this keyword
	int num;
	
	example14(int num){
		System.out.println("local num:"+num);
		System.out.println("NSGV NUM USING THIS :"+this.num);
		//local=global
		this.num=num;
		System.out.println("local num update:"+num);
		System.out.println("local this update:"+this.num);
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Program starts");
		
		example14 ref=new example14(12);
		
		
		System.out.println("Program ends");
	}

	

	}


