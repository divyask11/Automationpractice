package nov5interfce;
interface drawable2{
	void show();
}
interface printable2{
	void show();
}


	class Interface4 implements printable2, drawable2{
	public void show() {
		System.out.println("hello");
		
	}
}

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface4 obj = new Interface4();
		obj.show();
		
		printable2 obj2 = new Interface4();
		obj2.show();
		drawable2 obj3=new Interface4();
		obj3.show();
	}

}
