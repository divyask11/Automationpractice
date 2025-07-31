package nov8n9array;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// array declaration 
		/*
		int a[];
		// initialization 
		a= new int[5];
		
		*/
		// array declaration and initialization 
		int a[] = new int[5];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		a[0]=10;// after initialization 
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("************");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("************count-arrayname.length******************");
		System.out.println(" aray element count:"+a.length);
		
		
		System.out.println("************for loop noramal**************");
		
		for (int i = 0;i<a.length; i++) {
			System.out.println(a[i]);//length is the property of array 
				
		}
		
		System.out.println("*******for each loop*****");
		/**
		 * LHS should be same as RHS(array) type in form of datatype or class
		 * for(LHS : RHS){     }
		 */
		
		for(int num:a) {
			System.out.println(num);
		}
		
		System.out.println("*****stor char value in this *****");
		
		char[] getarray=new char[] {'A','B','C','D','E'};
		//or
		char[] getArray1 =new char[4];
		getArray1[0]='A';
		getArray1[1]='B';
		getArray1[2]='C';
		getArray1[3]='D';
					//or
		char[] getArray2 ={ 'A','B','C','D' };

		
	
	System.out.println("**************for-each loop----5*************");
            for (char num:getarray) {
            	System.out.println(num);
            }
			
			System.out.println("''''''''''''''''");
			for (char num:getArray1) {
            	System.out.println(num);
            }
			
			System.out.println("------------------------");
			for (char num:getArray2) {
            	System.out.println(num);
            }
		
		
		
		
		
}	
	}


