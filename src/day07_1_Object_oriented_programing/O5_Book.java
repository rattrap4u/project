// By using scanner  i.e. taking input from the user.
package day07_1_Object_oriented_programing;


import java.util.Scanner;  // to read data from keyboard.

public class O5_Book {
	String title;
	int pages;
	String publisher;
// class contains data members as well as methods
	//structure contain only data
	void setBook()  //setter or mutator     //this is not a static method.
	{
		Scanner in =new Scanner(System.in);   // creating Scanner object
		System.out.println("Enter the title of the Book");
		title=in.nextLine();
		
		System.out.println("Enter publisher of the Book");
		publisher=in.nextLine();
		
		System.out.println("Enter the number of pages in the Book.");
		pages=in.nextInt();
		
	}
	void getBook() //this is not a static method
	{
		System.out.println(title+"\n"+pages+"\n"+publisher+"\n");
	}
	public static void main(String[] args) // static methods won't be able to call non-static methods
	{
		//static can be called in a static method.
		//setBook();   // Compile time error
		//getBook();   // Compile time error
		
		O5_Book b1=new O5_Book();// create an object -- Book   // variable type --- b1  // new is an operator  // class constructor -- Book()
		b1.setBook();
		b1.getBook();
		
		O5_Book b2=new O5_Book();
		b2.setBook();
		b2.getBook();
	}
	
	

}
