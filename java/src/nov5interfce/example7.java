package nov5interfce;
interface animal20{
	int age =10;
	public void sound();
	public void sleep();
		
}
interface rectile{
	public void color();
}


class pig12 implements animal20{
	public void sound() {
		System.out.println("pig sound ");
	}
	public void sleep() {
		System.out.println("pig sleep ");
	}
}


class dog extends pig12 implements rectile{
	public void color() {
		System.out.println("clor ");
	}
}
public class example7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pig12 p1= new pig12();
p1.sound();
p1.sleep();
System.out.println(animal10.age);


dog d1 =new  dog();
d1.color();
d1.sound();
d1.sleep();

	}

}
