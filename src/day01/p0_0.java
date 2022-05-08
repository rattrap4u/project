package day01;
import java.util.Scanner;

public class p0_0 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int a = s.nextInt();
		s.close();
		if(a % 2==0)
			System.out.println("The number "+a+" is Even.");
		else
			System.out.println("The number "+a+" is Odd.");
	}

}
