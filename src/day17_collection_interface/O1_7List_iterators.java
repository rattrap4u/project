// List iterators can traverse in any direction

/* list iterator is not universal because it can't be applied on all collection object 
 * it can be applied on linked types only like linkedlist linkedhahset linkedhashmap. 
 */

package day17_collection_interface;

import java.util.*;

public class O1_7List_iterators 
{

	public static void main(String[] args) 
	{
		List ll=new LinkedList();
		ll.add("Agra");
		ll.add("Java");
		ll.add("Pune");    // arraylist method to add
		ll.add("Chennai");
		ll.add("Mumbai");
		ll.add("Delhi");
		
		System.out.println(ll);
		
		Collections.reverse(ll);
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("**********************");
		Collections.sort(ll);
		
		ListIterator litr=ll.listIterator();
		while(litr.hasNext())
			System.out.println(litr.next());
		
		System.out.println("\n"+litr.previous());   // to print last element
	}

}
