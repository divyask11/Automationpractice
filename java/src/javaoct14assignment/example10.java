package javaoct14assignment;

public class example10 {
	  // count the number in digit

	  public static void main(String[] args) {
	int num=1234566;
	int count=0;
	
	if (num==0) {
		count=1;
	}else
	{
		 while (num != 0) {
             num /= 10; // Remove the last digit
             count++;
	}
   }
   System.out.println("ptint reverse= "+num);
   System.out.println("ptint reverse= "+count);
    
	
    	 
	  }
    	 
    }
	            	
    
		
		
		
		
		
	
