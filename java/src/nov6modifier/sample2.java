package nov6modifier;

public class sample2 {
private int num=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      sample1 a1 = new sample1();
     // System.out.println("private modifier :"+a1.num);
      // private member can not acees ouside the class 
      System.out.println(" default :"+a1.num2);// it can acess with the class by same package but not different package 
      System.out.println("protected:"+a1.num3);
      System.out.println("public:"+a1.num4);
	}
	

}
