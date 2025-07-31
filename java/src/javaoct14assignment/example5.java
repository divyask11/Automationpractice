package javaoct14assignment;

public class example5 {

	public static void main(String[] args) {
		
		
		//Java Program to Check Palindrome number
		
		 int originalNum = num; // Store the original number
	        int reversedNum = 0;
	        int remainder;

	        // Loop to reverse the number
	        for (; num != 0; num /= 10) {
	            remainder = num % 10; // Get the last digit
	            reversedNum = reversedNum * 10 + remainder; // Build the reversed number
	        }

	        // Check if the original number is equal to the reversed number
	        if (originalNum == reversedNum) {
	            System.out.println(originalNum + " is a palindrome number.");
	        } else {
	            System.out.println(originalNum + " is not a palindrome number.");
	        }
	    }
	
	}
