package nov8n9array;
    //testreturnarray
class returnarray{
	static int[] getarray2() {
		int num[]=new int[4];
	return new int[] {12,20,30,40};
		
	}
}
public class example5 {

	public static void main(String[] args) {
// calling method which return array
		
		int arr[]=returnarray.getarray2();
		// print the valu of array
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
