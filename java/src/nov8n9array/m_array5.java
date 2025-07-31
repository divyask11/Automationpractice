package nov8n9array;

import java.util.Arrays;

public class m_array5 {

	public static void main(String[] args) {
		// java program to clone the array 
		int array[]= {1,23,3,4,5,5,6,8,9,};
		System.out.println("print original array");
		for(int num:array) {
			System.out.print(num+" ");
		}
		
		System.out.println("\n printing clone the array ");
		int cloneArray[]=array.clone();
		for(int a:cloneArray) {
			System.out.print(a+" ");
		}
		
		System.out.println("\nAre both equal arr & carr ?");
		System.out.println("comparision bet two array :"+Arrays.equals(array,cloneArray));

		
		System.out.println("*********************************");
		int newcopy[]=Arrays.copyOf(array, array.length);
		for (int i:newcopy) {
			System.out.print(i+" ");
		}
		
		
		
		System.out.println("\n******************************");
        int[] copyrange=Arrays.copyOfRange(array, 1, 5);
		for(int i:copyrange) {
			System.out.print(i+" ");
			
		}
		System.out.println("\nComparing newCopiedRangeArray & newCopiedArray : "
				+Arrays.equals(newcopy, copyrange));
		
		
		
System.out.println("**************************");

Arrays.sort(array);
//sort the array elements in ascending order and stores the sorted element in the same array
System.out.println("afeter sorting:");	
for(int i :array) {
	
	System.out.print(i +" ");
	
	
	
	}
	
	
	}

}
