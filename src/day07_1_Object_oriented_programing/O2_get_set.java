package day07_1_Object_oriented_programing;

// class is limited but objects can be infinite
public class O2_get_set 
{
	//data member
	String name;
	
	
	//method --- will have code inside
	//setter or mutator method
	void setName(String n) //void is return type
	// setter is used to set non static data of the class
	{
		name=n;  // n is local variable -- it can't be accessed outside of the method--inside it can be accessed
	}
	
	// getter or accessor method  --- will have return type
	String getName()
	// getter is used to get the value of that non static data of the class 
	{
		return name;
	}
	public static void main(String[] args) 
	{
//		setName("Java");  //method call---- here it can't be called as it is non static-- 
//		but can be accessed by creating object of the class
//		System.out.println(getName());
		
		// creating object to access non static method
		
//		# how do you create an object in java
		O2_get_set get_set=new O2_get_set(); //new must be followed by class constructor (here -O2_get_set()) --- compiler supplies class constructor--default constructor
		// new operator will allocate memory in heap area.   
		//all objects are created in heap area.
		// jvm has 5 run time memories one of them is heap area.
		
		get_set.setName("Java");//calling the non static methods.    //setName  is method call
//		System.out.println(get_set.getName)    alter way is below two lines
		String str=get_set.getName();
		System.out.println(str);
		
		// by using this way we can create n number of objects. 
		O2_get_set get_set_1=new O2_get_set();
		get_set_1.setName("Python");
		System.out.println(get_set_1.getName());
		
//		above are the objects inside the main method that can be infinite.
//		through objects we can access data members
		
//		direct access of non static methods using objects.
		
//		System.out.println(get_set.getName); // it going to be null as i haven't set the values
		
//		so setting the values
		get_set.setName("c++");
		System.out.println(get_set.getName());
	}
}


// Heap for object will contain - non static data members called - instance