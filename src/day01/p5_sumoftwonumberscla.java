//
//public class p5_sumoftwonumberscla {
//
//	public static void main(String[] args) 
//	{
////		int a=args[0]; //will show compile time error
////		int b=args[1]; //will show compile time error
//		int a=Integer.parseInt(args[0]);
//		int b=Integer.parseInt(args[1]);
//		int sum=a+b;
//		System.out.println(sum);
//	}
//
//}



public class p5_sumoftwonumberscla {

	public static void main(String[] args) 
	// the args is with the string type
	{
//		int a=args[0]; //will show compile time error
//		int b=args[1]; //will show compile time error
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double sum=a+b;
		System.out.println(sum);
	}

}