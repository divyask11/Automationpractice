package nov21_collectiom;

import java.util.Vector;

public class vectror2 {

	public static void main(String[] args) {
          
		Vector <String>v1=new Vector<String>();
		//default capacity is 10, its capacity gets increase by 100% of its size
		System.out.println("default capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
		// adding element by add()method
		
		v1.add("mumbai");
		v1.add("pune");
		v1.add("nashik");
		//adding element by using addelement()
		v1.addElement("japan");
		v1.addElement("india");
		v1.addElement("kerala");
		System.out.println("prnt:"+v1);
		
		for(String str:v1) {
			System.out.println(str);
		}
		System.out.println("updated capacity of vector:"+v1.capacity());
		System.out.println("size of vector:"+v1.size());
		
	}

}
/**
Synchronized --> Thread Safe ----> slow
default capacity-->10 --> increases capacity by 100%
Vector comes from JDK 1.0 ---> also known as legacy class
*/
