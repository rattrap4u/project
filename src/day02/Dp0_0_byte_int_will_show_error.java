//package day2;
//
//public class Dp0_0_byte_int_will_show_error {
//
//	public static void main(String[] args) 
//	{
//		byte b=100;
//		b=b+20;
//		// the above operation will throw compile time error
//		//as the value 20 is considered as integer
//		// the size of byte is 1 and int is 4.
//		System.out.println(b);
//	}
//
//}


//package day2;
//
//public class Dp0_0_byte_int_will_show_error {
//
//	public static void main(String[] args) 
//	{
//		byte b=100;
//		b=b+byte(20);
//		// the above operation will throw compile time error
//		//as the value 20 is considered as integer
//		// the size of byte is 1 and int is 4.
//		System.out.println(b);
//	}
//
//}



//package day2;
//
//public class Dp0_0_byte_int_will_show_error {
//
//	public static void main(String[] args) 
//	{
//		byte b=100;
//		b=(byte)(b)+(byte)(20);
//		// the above operation will throw compile time error
//		//as the value 20 is considered as integer
//		// the size of byte is 1 and int is 4.
//		System.out.println(b);
//	}
//
//}




package day02;

public class Dp0_0_byte_int_will_show_error {

	public static void main(String[] args) 
	{
		byte b=100;
		b=(byte)(b+20);
		// the above operation will throw compile time error
		//as the value 20 is considered as integer
		// the size of byte is 1 and int is 4.
		System.out.println(b);
	}

}