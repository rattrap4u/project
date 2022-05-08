package day07_0_Object_oriented_programing_constructor;

import java.util.Scanner;

import java.util.Scanner;
public class Students 
{

	private int rollno;
	private String name;
	private int marks1;
	private int marks2;
	private int marks3;
	private static String org="C-DAC Hyderabad";  // class
	// well-formed encapsulation - data is private.
	
	public Students() // setter is eliminated using constructor name Student().
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter rollno, name, and marks in 3 subject of student : ");
		rollno=input.nextInt();
		name=input.next();   // name is a single word
		marks1=input.nextInt();
		marks2=input.nextInt();
		marks3=input.nextInt();
	}
	public void disp()  //display method to display the student data
	{
		System.out.println("Students Details : ");
		System.out.println("Name :"+name+"\tRoll no. :"+rollno);
		System.out.println(marks1+"\t"+marks2+"\t"+marks3);
		System.out.println("Organization : "+org+"\n");
	}
	public void findAvg()
	{
		double avg=(marks1+marks2+marks3)/3;
		System.out.println("Average Marks : "+avg);
	}
}
// it is the business class.