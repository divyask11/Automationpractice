package nov14_scanner_string;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
// scanner with array 
		
		
		char[] chararr=new char[5];
		Scanner scn=new Scanner(System.in);
	for(int i=0;i<chararr.length;i++) {
		System.out.println("enter char at index "+i);
		chararr[i]=scn.next().charAt(0);
		
		
	}
	for(char ch:chararr) {
		System.out.println(ch);
	}
		
		
		
		
		
		
	}

}
