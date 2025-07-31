package nov8n9array;

public class example3 {
 
	public static void main(String[] args) {
	int[] number= {12,24,36,48,-34,360,72};
	double sum=0;
	double avarage;
	// access all elements using for each loop add each element in sum
	for(int num:number) {
		sum=sum+num;
	}
		//sum = sum + number;//0+2=2+(-9)=-7
		//or
           //  sum +=  number; //===> sum = sum + number;
		int arraylength=number.length;
		avarage=sum/arraylength;
		System.out.println("number sum:"+sum);
		System.out.println("array average :"+avarage);
		
		
		
	}
			

	}


