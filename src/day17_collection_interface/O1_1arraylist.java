// creation of arraylist.

package day17_collection_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class O1_1arraylist 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();   //heterogenous objects
		al.add(10);
		al.add("Java");
		al.add(true);    // arraylist method to add
		al.add(null);
		al.add(3.14);
		al.add(10); //duplicate values can be added into the arraylist.
		
		// collection arraylist contains all types of datatypes
		
		System.out.println(al);
		//  accessing arraylist object by object
		for(Object o:al)
			System.out.println(o);
		
		
		System.out.println("\n****************************\n");
		
		// cursor   // interface called iterator
		
		Iterator itr=al.iterator();   //Iterator is a interface -- itr - al.iterator()  - is cursor - is a universal cursor it can be applied any object.
		//there are 3 cursors in collection framework 
//		iterator
//		list - for linked types.
//		enumeration is only for legacy.
		
		while(itr.hasNext())  // as long as there exists an object in itr hasnext group.
		{
			System.out.println(itr.next());
		}
	}
}
