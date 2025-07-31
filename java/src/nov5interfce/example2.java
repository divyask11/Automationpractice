package nov5interfce;
interface bank{
	float rateofintrest ();
		
	}


class IIFc  implements bank{
	public float rateofintrest() {
		return 9.9f;
	}
}
	
	class IBC implements bank{
		public float rateofintrest() {
			return 5.9f;
			}
	
	
}
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IIFc i1=new IIFc ();
		System.out.println("IIFC RATEOT:"+i1.rateofintrest());
		
		
		IBC I2=new  IBC();
		System.out.println("ibs rate of in:"+I2.rateofintrest());

	}

}
