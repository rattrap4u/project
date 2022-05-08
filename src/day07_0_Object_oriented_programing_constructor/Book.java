package day07_0_Object_oriented_programing_constructor;

import java.util.Scanner;

public class Book 
{
	String title;
	int pages;
	String publisher;
//class contains data members as well as methods
	//structure contain only data
	public Book()  //setter or mutator     //this is not a static method.
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
		
		Book b1=new Book();// create an object -- Book   // variable type --- b1  // new is an operator  // class constructor -- Book()
		//  here we are using default constructor
		// constructor should be made public such that anybody can access that constructor. 
		// here we have replaced setter with constructor.
		b1.getBook();
		
		Book b2=new Book();
		b2.getBook();
	}
	
}