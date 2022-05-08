// creation of arraylist.

package day17_collection_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class O1_2arraylist_Collections_class 
{

	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();   //homogenous objects i.e. integers
		al.add(10);
		al.add(20);
		al.add(30);    // arraylist method to add
		al.add(40);
		al.add(50);
		al.add(10); //duplicate values can be added into the arraylist.
		
		// collection arraylist contains all types of datatypes
		
		System.out.println(al);
		//  accessing arraylist object by object
		for(Object o:al)
			System.out.println(o);
		
		
		System.out.println("\n****************************\n");
		
		// cursor   // interface called iterator
		
		// using class Collections.  Collection is interface.
		// Collections class has so many methods
		Collections.sort(al); //sort is used to arrange the list in increasing order.
		
		
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


//	what is the root/top most Collection interface ? -- Collection is the top most interface
//	what are the 3 major sub interfaces of Collcetion interface -- list, set & queue
//	what are the implementaion classes of list interface. --  4 implementation classes -- arraylist, linkedlist, vector and stack
//	what are methods of Collection interface -- add,remove,size,iterator,isEmpty,contains,addAll,clear,removeAll,retainAll,containsAll,
//	mention atleast 3 methods of Collections class  rotate ,sort,reverse,shuffle,swap,fill,copy,..
