package nov6encapsulationcasting;

public class sample2 {
// castingg 
	
public static void main(String[] args) {
	
       int num = 10;
       
      long num2=num;//winding  auto /implicit
      
      float num3=(float)num;//winding   //explicit 
      
      double num4=(double )num;
      
		
	// narowing operaton 
      double salary=45000.56;
		float num5=(float)salary;//narrowing - explicit --> loss in size
		long num6=(long)salary;//narrowing - explicit --> loss in value
		System.out.println("Salary: "+salary);
		System.out.println("num5: "+num5);
		System.out.println("num6: "+num6);
       
       
       
       System.out.println("num="+num);
       System.out.println("num2="+num2);

       System.out.println("num3="+num3);

       System.out.println("num4="+num4);

	}

}
//byte<short<int<long<float < double1
// 