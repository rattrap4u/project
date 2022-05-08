import java.lang.String;

// java.lang is imported to use String class
// java.lang is available by default in java program
// java.lang.* means it is importing everything that is present in the package.

public class p2 {
	// class is a keyword to designate p2 (class name)
// whenever we write a class name we need 1st letter to be uppercase 
	public static void main(String[] args)
	// main is method
// main is public as we want it available everywhere
/*main is static because it is called by jvm through an interpreter so method
 *  must be call without creation of any object. that's why static keyword 
 *  is kept with main */
//static is a keyword and a modifier.
// public is access or visibility modifier that can be accessed from anywhere
//private means that is available within the class only.
//public, static is modifier.
// String is a class
// String came from package called java.lang
// System is also a class, which is present in the java.lang package only.
// out is static member in system class so that we can call System.out
// System.out represent output stream through which printing is performed.

//String[] args helps us to pass command line arguments.	
	
	{
		System.out.println("Hello, World!");
		// here println is the method.

		// System is the class.
		// out is a member.
		// Hello, World! is an argument.
	}
	{
	}
}
