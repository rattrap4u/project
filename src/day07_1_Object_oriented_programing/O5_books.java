
package day07_1_Object_oriented_programing;

public class O5_books {
	String title;
	int pages;
	String publisher;
// class contains data members as well as methods
	//structure contain only data
	void setBook(String t,int p,String pub)  //setter or mutator     //this is not a static method.
	{
		title=t;
		pages=p;
		publisher=pub;
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
		
		O5_books b1=new O5_books();// create an object -- Book   // variable type --- b1  // new is an operator  // class constructor -- Book()
		b1.setBook("Java",500,"TMH\n"); 
		b1.getBook();
		
		O5_books b2=new O5_books();
		b2.setBook("Python", 350, "DreamTechPress\n");
		b2.getBook();
	}
	
	

}
