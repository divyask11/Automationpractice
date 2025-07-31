package nov8n9array;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] age= {12,34,25,54,56};
		System.out.println("associacte the array:");
		System.out.println("array element:"+age[0]);
		System.out.println("array element:"+age[1]);
System.out.println("array element:"+age[2]);
System.out.println("array element:"+age[3]);
System.out.println("array element:"+age[4]);
System.out.println("array length:"+age.length);

System.out.println("for loop _-_-__-_----_---");
   for( int i=0;i<age.length;i++) {
		if(age[i]==25){
		System.out.println(age[i]+"presen in index"+i);
		break;
		
		
		}
		}
   System.out.println(" for each loop");
   for(int num:age) {
	   if(num==25) {
		   System.out.println(num);
		   break;
		   
		   
	   }
   }
   
   
   
	}
}
