import java.util.Scanner;

public class p1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number - ");
		int n = s.nextInt();
		s.close();
		if(n%2==0)
			System.out.println("The number is even");
		else
			System.out.println("The number is odd");
	}

}
