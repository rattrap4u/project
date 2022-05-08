// Earlier to Generics, used to store any type of objects in collection. 
// Now, in generics, java programmer is forced to store specific type of objects


// by adding generics we will get error during compilation time only.

// Generics are for type safety.

package day17_collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class O1_5generics_in_arraylist 
{

	// creation of arraylist.

		public static void main(String[] args) 
		{
			//  <Integer>  is called Generics which is used to store specific type of objects.
			ArrayList<Integer> al=new ArrayList();   //heterogenous objects
			al.add(10);
			al.add(15);
			al.add(20);    // arraylist method to add
			al.add(true);
			al.add(30.00);
			al.add(35); //duplicate values can be added into the arraylist.
			al.add("java");
			al.add(3.14);
			// collection arraylist contains all types of datatypes
			
			System.out.println(al);
			System.out.println("\t");
			//  accessing arraylist object by object

			Collections.reverse(al);   // Collections  -- 
			
			for(Object o:al)
				System.out.println(o);
			
			
			System.out.println("\n****************************\n");
			
			// cursor   // interface called iterator
			
			Iterator itr=al.iterator();   //Iterator is a interface -- itr - al.iterator()  - is cursor - is a universal cursor it can be applied any object.
			//there are 3 cursors in collection framework 
//			iterator
//			list - for linked types.
//			enumeration is only for legacy.
			
			while(itr.hasNext())  // as long as there exists an object in itr hasnext group.
			{
				System.out.println(itr.next());
			}
		}
	}
