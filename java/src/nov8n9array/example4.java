package nov8n9array;
//creating a method which receives an array as a parameter
class testarray{
	
static void min(int arr[]) {//int arr[]=a={ 33, 13, 4, 50,15,1 };
	int min = arr[0];
	//33
	for (int i = 1; i < arr.length; i++) {
		if (min > arr[i]) {//33>13 | 13>4 | 4>50 | 4>15 | 4>1
			min = arr[i];  //13    |  4					| 1
		}
	}
	System.out.println("Min number in array is: "+min);
}

static void max(int arr[]) {
	int max = arr[0];
	for (int i = 1; i < arr.length; i++) {
		if (max < arr[i]) {// 
			max = arr[i];
		}
	}
	System.out.println("Max number in array is: "+max);
}
}

public class example4 {

	public static void main(String[] args) {
     int a[]= {5,32,45,56,67,67};
     testarray.min(a);
     testarray.max(a);
     
    		 }

}
