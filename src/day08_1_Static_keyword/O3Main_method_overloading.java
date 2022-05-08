package day08_1_Static_keyword;

public class O3Main_method_overloading 
{
	/* Whenever your class is public and contains main() method, file name 
	 * must be same as your class name.
	 */

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		main(10);  // main() call
	}
	public static void main(int a)  // main()  method overloading
	{
		System.out.println(a);
	}

}
// number of arguments are same but types are different.