package nov21_collectiom;

import java.util.Vector;

public class vectror1 {

	public static void main(String[] args) {
          
		Vector v1=new Vector();
		System.out.println("default capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
		v1.setSize(3);
		System.out.println("print:"+v1);
		System.out.println("updated capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
		v1.add("mumbai");
		System.out.println("print:"+v1);
		System.out.println("updated capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
	}

}
