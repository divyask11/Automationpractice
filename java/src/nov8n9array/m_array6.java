package nov8n9array;

import java.util.Arrays;

public class m_array6 {



	public static void main(String[] args) {
		
		// declaring array 
		char[] arr= {'a','c','u','e','k'};
		
		//duplicate array
		
		char clonearray[]=arr.clone();
		Arrays.sort(arr);
		for(char ch:arr) {
			System.out.print(ch+ " ");
		}
		System.out.println("\nCloned array: ");
		for( char ch:clonearray) {
			System.out.print(ch+" ");
		}
		
		System.out.println("\n+++++++++++++++++++++++++++++++");
           boolean results=Arrays.equals(clonearray,arr);
		System.out.println(results);
		
		
		System.out.println("*****************");

		for(int i=clonearray.length-1;i>=0;i--) {
			System.out.print(clonearray[i]+" ");
		
		
		
	}
		System.out.println("\n###########################");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
	
	}
}
}

