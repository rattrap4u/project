package day17_collection_interface;

import java.util.*;

public class O1_6Linkedlist

	{

		public static void main(String[] args) 
		{
			// if we use list then all the methods we can use without restriction
		 // List ll=new LinkedList();
			Collection ll=new LinkedList();
			ll.add(10);
			ll.add("Java");
			ll.add(true);    // arraylist method to add
			ll.add(null);
			ll.add(3.14);
			ll.add(10); //duplicate values can be added into the arraylist.
			
			// collection arraylist contains all types of datatypes
			
			System.out.println(ll);
			//  accessing arraylist object by object
			for(Object o:ll)
				System.out.println(o);
			
			
			System.out.println("\n****************************\n");
			
			
			// we can't sort the linked list.
//			Collections.sort(ll);   // it will show error (classcastexception) as the arraylist consists of heterogenous elements(int,boolean,double,float,String)
			
//***___*** Collections class method will work with any List type 
			
			// cursor   // interface called iterator
			
			Iterator itr=ll.iterator();   //Iterator is a interface -- itr - al.iterator()  - is cursor - is a universal cursor it can be applied any object.
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