package nov8n9array;

import java.util.Arrays;

public class m_array4 {

	public static void main(String[] args) {
	// declaring a source array 
		char copyform[]= {'a','d','f','d','e','h','i','w'};
		System.out.println("element count :"+copyform.length);
		
		
		// declaring a destination array to copy store array
		
		char[] copyto=Arrays.copyOf(copyform,5);
		System.out.println("number of element:"+copyto.length);
		for(int i = 0;i<copyto.length;i++) {
			
			System.out.print(copyto[i]+ " ");
		}
		System.out.println("\ncopy using range ");
		
		char[] copyrange=Arrays.copyOfRange(copyform, 2, 7);
		System.out.println("num of element:"+copyrange.length);
		for(int i=0;i<copyrange.length;i++) {
			System.out.print(copyrange[i]+" ");
		}
		
		System.out.println("\n****************After Sorting********************");

		Arrays.sort(copyrange);//it will sort array elements in ascending order and stored sorted element in the same array
     // for each loop
		for(char c : copyrange) {
			System.out.print(c+ " ");
		}
		
		
		
	}

}
/*
 * Arrays is a predefined class belongs to java.util package
 * it has so many useful function that can make developer life easier 
 */
