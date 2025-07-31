package javaoct14assignment;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Count Number of Digits in an Integer using for loop
	
		
		        int number = 56783; // The integer to count digits in
		        int count = 0;       // Counter for the number of digits

		        // The for loop iterates as long as 'number' is not 0.
		        // In each iteration, 'number' is divided by 10, and 'count' is incremented.
		        for (; number != 0; number /= 10, ++count) {
		            // The loop body can be empty as all operations are in the update part
		        }

		      System.out.println("ptint count=" +count);
		    }
		}
