//   ## here we have done the hard coding that is the problem.

package day06_Object_oriented_programing;

public class Book {
	String title;
	int pages;
	String publisher;
// class contains data members as well as methods
	//structure contain only data
	void setBook()  //setter or mutator     //this is not a static method.
	{
		
				// setBook()  --is the hard coding method.
		
		title="Java";
		pages=500;
		publisher="TMH";
	}
	void getBook() //this is not a static method
	{
		System.out.println(title+"\n"+pages+"\n"+publisher);
	}
	public static void main(String[] args) // static methods won't be able to call non-static methods
	{
		//static can be called in a static method.
		//setBook();   // Compile time error
		//getBook();   // Compile time error
		
		Book b1=new Book();// create an object -- Book   // variable type --- b1  // new is an operator  // class constructor -- Book()
		b1.setBook(); 
		b1.getBook();
		
	}
	
	

}
