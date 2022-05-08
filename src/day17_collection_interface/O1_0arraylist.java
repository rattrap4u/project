// creation of arraylist.

package day17_collection_interface;

import java.util.ArrayList;

public class O1_0arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Java");
		al.add(true);    // arraylist method to add
		al.add(null);
		al.add(3.14);
		al.add(10); //duplicate values can be added into the arraylist.
		
		// collection arraylist contains all types of datatypes
		
		System.out.println(al);
		ArrayList al1=new ArrayList();
		al1.add(50);    //arraylist method
		al1.add(60);
		al1.add(100);
		al.remove(5);  // tell about position if there are duplicates.
		al.addAll(al1);
		System.out.println(al);
		System.out.println(al1);
	}

}
