package nov6encapsulation;
 class sample3{
	 
	 // read only class 
	 
private double salary = 1220;
private int empid=3;

public int getempid() {
	return empid;
}
 



public double getsalary() {
	return salary;
}


 }


public class example3 {

	public static void main(String[] args) {
		// we can acess the member as follow create obj
		
		sample3 s1 = new sample3();
		System.out.println(s1.getsalary());
		
		System.out.println(s1.getempid() );
		System.out.println("****************updatede value *********************");
		
		//tem.out.println("Updated Salary"+s1.getsalary());
	}
	
		
		

	


}
