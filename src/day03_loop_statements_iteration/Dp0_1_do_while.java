package day03_loop_statements_iteration;

public class Dp0_1_do_while {

	public static void main(String[] args) 
	{
		// in this do while statement the condition is tested at last 
		int i=1;
		do
		{
			System.out.println(i);
			i+=2; //update statement
		}
		while(i<=30);
	}

}
