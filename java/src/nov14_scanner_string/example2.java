package nov14_scanner_string;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empid;
		double salary;
		char grade;
		boolean status;
		
		
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("enter empid:");
		empid=scn.nextInt();
		
		System.out.println("enter salary:");
		salary=scn.nextInt();
		
		System.out.println("enter grade :");
		grade=scn.next().charAt(0);
		
		
		System.out.println("status:");
		status=scn.nextBoolean();
		
		// print all
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(grade);
	System.out.println(status);
	
	
	
	
	// we add name of emp
	String name ;
	System.out.println("enter ur name :");
	name=scn.next();
	
	
	
	
	
	}
	

}
