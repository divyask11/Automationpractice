package nov5acessmodifier;

import nov6modifier.sample1;

// modifier 


public class example2 extends sample1  {

	public static void main(String[] args) {
		// protected class acees the member other package to acees this we use ingeritance a
		// create ojb with class name 
		 example2 a1 = new example2();
		 System.out.println("protected:"+a1.num3);
		 System.out.println("public:"+a1.num4);

}
}