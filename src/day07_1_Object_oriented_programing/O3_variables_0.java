package day07_1_Object_oriented_programing;

public class O3_variables_0 
{
	public static void main(String[] args) 
	{
		
	}

}

//data types
//1.primitive   2. reference/ non-primitve
//1. primitive
//8 -byte,short,int,long,float,double,char,boolean  
//
//2. reference
//Class-String
//array
//
//  ##  ---kinds on variable based on place of declaration
//--1.instance variables  (non-static) --- any 
//--2. Static variables  (class)  
//--3. local variables    ----  declared within a method or in a constructor

// ## any variable which is declared in a class but outside of the method or constructor---can be instance/static
// ## int a is primitive which doesn't have static keyword so it is instance.


// ## local variable-- 
class x
{
	int a;   // instance(non-static)
	
	void msg()
	{
		int x = 0;   // local variable // declared inside a method called msg  this is local variable. 
		a=a + x;
	}
}