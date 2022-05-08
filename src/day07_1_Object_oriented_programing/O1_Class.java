package day07_1_Object_oriented_programing;

public class O1_Class 
{
	// here we have data members
	static String name;  // all data members will have their default values. 
	// static data is ---common to whole class--- which can be accessed from anywhere
	
	
	// then methods
	public static void main(String[] args) 
	{
		System.out.println("The name is : "+name);      //we will get compile time error.
		// as the name is declared outside of the main which can't be accessed inside the main method.
		// if the name was static then it can be accessed.
		// non static(instance) can't be accessed in the main method.
	}

}
