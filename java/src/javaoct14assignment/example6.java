package javaoct14assignment;

public class example6 {

	public static void main(String[] args) {
		
		//Program to Check Prime Number using a for loop
		
   int  num=1766;
   boolean flag=false;
   if(num==0 || num==1) {
	   flag=true;
	 
   }
    for(int   i = 2; i <= num / 2; ++i) {
    	 if (num % i == 0);
    	 flag=false;
    	 break;
    }
	
    	 
    	 if(!flag)
    	 System.out.println("given num is prime="+num);
    	 else 
    		 System.out.println("given no is="+num);
    	 }
    	 
    }
	            	
    
		
		
		
		
		
	
