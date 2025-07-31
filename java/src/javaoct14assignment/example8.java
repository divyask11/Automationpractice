package javaoct14assignment;

public class example8 {
	  // The positive integer to find factors for

	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        // Check if the number is positive
	        if (number <= 0) {
	            System.out.println("Please enter a positive integer.");
	        } else {
	            System.out.print("Factors of " + number + " are: ");

	            // Loop from 1 up to the number
	            for (int i = 1; i <= number; i++) {
	                // Check if 'i' divides 'number' evenly
	                if (number % i == 0) {
	                    System.out.print(i + " ");
	                }
	            }
	            System.out.println(); // For a new line after printing factors
	        }
	        input.close();
	    }
	
      
		
		
		
		
		
		
		
		
		
		
		
   }
   
    
	
    	 
    	
    	 
    }
	            	
    
		
		
		
		
		
	
