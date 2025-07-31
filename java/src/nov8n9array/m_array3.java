package nov8n9array;

public class m_array3 {

	public static void main(String[] args) {
		
		// declaring and initialize array
		
		int arr[][]= { {1,2,3},{4,5},{6,7,8}};// echa entry in one row 
		// print 2d array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("******print char ********");
		
		char chararr[][]= { {'A','B'},{'C','D','E'},{'F','G'}};
		for (int i =0;i<chararr.length;i++) {
			for (int j=0;j<chararr[i].length;j++) {
				System.out.print(chararr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
