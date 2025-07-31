package nov8n9array;
class example{
int age;
double salary;
example(){
	System.out.println("zero param");
}

example(int age){
	System.out.println(" a am int param");
}

example(double a){
	a=salary;
	System.out.println(" a am double param");
}
	void calling() {
		System.out.println(" calling age:"+age);
		System.out.println("callinf salary:"+salary);
	}
}


public class example8 {

	public static void main(String[] args) {
		
		example e2=new example();
		example e3=new example(12);
		example e4= new example(23.4);
		e2.calling();
		e3.calling();
		e4.calling();
				
		System.out.println("********************");
		
		
       example[] e =new example[3];
       e[0]=new example();
       e[1]=new example(10);
       e[2]=new example(12.2);
       
    	e[0].calling();
    	e[1].calling();
    	e[2].calling();
		
		
		
		
		
		
		
		
		
	}

}
