package nov6encapsulation;
 class sample{
	 
	 // read only class 
	 
private double salary = 1220;
private int empid=3;

public int getempid() {
	return empid;
}
 



public double getSalary() {
	return salary;
}




public void setSalary(double salary) {
	this.salary = salary;
}




public int getEmpid() {
	return empid;
}




public void setEmpid(int empid) {
	this.empid = empid;
}




public double getsalary() {
	return salary;
}


 }


public class example1 {

	public static void main(String[] args) {
		// we can acess the member as follow create obj
		
		sample s1 = new sample();
		System.out.println(s1.getsalary());
		
		System.out.println(s1.getempid() );
		System.out.println("****************updatede value *********************");
		
		//tem.out.println("Updated Salary"+s1.getsalary());
		
		s1.setEmpid(12);
		s1.setSalary(12345678);
System.out.println(s1.getsalary());
		
		System.out.println(s1.getempid() );
		
		
	}
	
		
		

	


}
