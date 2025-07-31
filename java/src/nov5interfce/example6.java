package nov5interfce;
interface animal10{
	int age =10;
	public void sound();
	public void sleep();
		
}
class pig10 implements animal10{
	public void sound() {
		System.out.println("pig sound ");
	}
	public void sleep() {
		System.out.println("pig sleep ");
	}
}



public class example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pig10 p1= new pig10();
p1.sound();
p1.sleep();
System.out.println(animal10.age);
	}

}
