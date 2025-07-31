package nov8n9array;

public class m_array {

	public static void main(String[] args) {
		int[][] arr = new int[3][3];// 3 row and 3 column
		System.out.println("total row in array: " + arr.length);//row count
		System.out.println("Col in row0:" + arr[0].length);//row-0, cell count
		for (int i = 0; i < arr.length; i++) {// row count
			for (int j = 0; j < arr[i].length; j++) {// cell count on current row
				System.out.print(arr[i][j] + " ");//0,0 | 0,1 | 0,2 | 1,0 | 1,1 |1,2|
			}
			System.out.println();
		}
System.out.println("*************************");

arr[0][0]=1;
arr[0][1]=1;
arr[0][2]=1;
arr[1][0]=1;
arr[1][1]=1;
arr[1][2]=1;
arr[2][0]=1;
arr[2][1]=1;
arr[2][2]=1;
for( int i = 0;i<arr.length;i++) {
	for ( int j=0;j<arr[i].length;j++) {
		System.out.print(arr[i][j]+" ");
	}
	System.out.println();
	
           }



	
	}
}
