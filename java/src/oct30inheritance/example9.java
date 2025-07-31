package oct30inheritance;
//parent class
class vehicle {
	public void wheel() {
		System.out.println(" a have a wheel ");
	}
}
class bike extends vehicle {
	public void wheelct() {
		System.out.println(" a have  bike a  2 wheel ");
	}
}
class car1 extends vehicle{
	public void wheelctcar() {
		System.out.println(" a have a car 4 wheel ");
	}
}

class scooter extends vehicle {	
	public void countwls() {
		System.out.println("I am a scooter and has 2 wheels");
	}
}
public class example9 {	

	public static void main(String[] args) {
		
		
		System.out.println("**********************************");
            bike b1=new bike();
            b1.wheel();
            b1.wheelct();
            System.out.println("+++++++++++++++++");
           
            
            
            
            
         
		scooter s1=new scooter();
		s1.wheel();
		s1.countwls();
		
	}

}

