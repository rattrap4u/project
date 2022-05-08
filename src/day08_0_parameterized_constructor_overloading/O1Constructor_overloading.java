package day08_0_parameterized_constructor_overloading;
//	Constructor overloading is possible when we use method without argument ,
//	with argument, and with some arguments.
//	
//	
//	# if we have declared default constructor by not declaring body and also declared
//	  parametrized constructor in the class and after that we have created one object in 
//	  main method which is matching to the parametrized constructor then we will not get compile time error.
//	  it will construct the value with default construtor and output will be default values.
//	  
//	# if we have used parameterized constructor in our class and in main method
//	  we want to fetch the value we have use the object to call the value of the parametrized constructor using the 
//	  object. but if we use the default object for default constructor then it can't call the value of the default 
//	  constructor in that case compiler will not supply the default constructor and while compiling it will produce 
//	  compile time error. 


## Copy constructor 
  it is used in C++ but it is not in java as copy constructor uses pointer as there is no pointers in java 
  so no copy constructor in java.
  but we can get the same kind of functionality in java for copy constructor.

  
  ex.  // copy constructor in java
  by using object we can use the concept of copy constructor.
  public Student(Student s)  // passing object reference
  {
	  rollno=s.rollno;
	  name=s.name;
	  marks1=s.marks1;
	  marks2=s.marks2;
	  marks3=s.marks3;
  }



now in main method

public static void main(String[] args)
{
	Student s1=new Student(123,"ASDF",89,88,78);
	s1.disp();
	s1.findAvg();
	
	Student s2=new Student(s2);   //creating an object referred by s2 with the values of s1.   // this is the copy constructor. 
	s2.disp();   //by using the existing object we use it.
	s3.findAvg();
}