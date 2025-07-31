package nov6modifier;

public class sample1 {
private int num=10;
int num2=20;
protected int num3=10;
public int num4=50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      sample1 a1 = new sample1();
      // private member can not acees ouside the class
      System.out.println("private modifier :"+a1.num);
   // it can acess with the class by same package but not different package 
      System.out.println(" default :"+a1.num2);
      // create inheriance to acees other package 
      System.out.println("protected:"+a1.num3);
      /*
      public members can be access from anywhere only if public member class should also be declared as public 
      */
      System.out.println("public:"+a1.num4);
	}

}
