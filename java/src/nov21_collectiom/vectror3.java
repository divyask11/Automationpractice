package nov21_collectiom;

import java.util.Vector;

public class vectror3 {

	public static void main(String[] args) {
          
		Vector <String>v1=new Vector<String>();
		//default capacity is 10, its capacity gets increase by 100% of its size
		System.out.println("default capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
		// adding element by add()method
		
		v1.add("mumbai");
		v1.add("pune");
		v1.add("nashik");
		v1.addElement("japan");
		v1.addElement("india");
		v1.addElement("kerala");
		v1.add("nashik");
		v1.addElement("japan");
		v1.addElement("india");
		v1.addElement("kerala");
		
		
		
		System.out.println("prnt:"+v1);
		
		
		System.out.println("updated capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
		v1.addElement("chaina");
		System.out.println("updated afeter adding 11 element capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		

		for(String str:v1) {
			System.out.println(str);
		}
		
		//addition method in vector 
		
		System.out.println("return 1st element of vector :"+v1.firstElement());
		System.out.println("return last element of vector :"+v1.lastElement());
		System.out.println("last index of :"+v1.lastIndexOf("chaina"));
	}

}

/**
Synchronized --> Thread Safe ----> slow
default capacity-->10 --> increases capacity by 100%
Vector comes from JDK 1.0 ---> also known as legacy class
*/
