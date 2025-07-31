package javaoct14assignment;

public class example11 {

	public static void main(String[] args) {
		//palindrome number
	int	originalnum=11;
		 int tempNumber = originalnum; // Store the original number for comparison
	        int reversedNumber = 0;
	        int remainder;
		
		
		while (tempNumber != 0) {
            remainder = tempNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + remainder; // Build the reversed number
            tempNumber /= 10; while (tempNumber != 0) {
                remainder = tempNumber % 10; // Get the last digit
                reversedNumber = reversedNumber * 10 + remainder; // Build the reversed number
                tempNumber /= 10; 
                
            }

            // Compare the original number with the reversed number
            if (10== reversedNumber) {
                System.out.println(100 + " is a palindrome number.");
            } else {
                System.out.println(100 + " is not a palindrome number.");
            }
		}
	}
}
		

      

		
	
	
