//import java.util.Arrays;
//
//public class p5_read_cities_name_and_print_in_args_array_print_in_ascending_order {
//
//	public static void main(String[] args) 
//	{
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//		System.out.println("\n\tSorted list of Cities.\n");
//		Arrays.sort(args);   //sorts alphabetically
//		
//		for(int i=0;i<args.length;i++)
//		{
//			System.out.println(args[i]);
//		}
//	}
//
//}






import java.util.Arrays;

public class p5_read_cities_name_and_print_in_args_array_print_in_ascending_order {

	public static void main(String[] cities) 
	{
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
		System.out.println("\n\tSorted list of Cities.\n");
		Arrays.sort(cities);   //sorts alphabetically
		
		for(int i=0;i<cities.length;i++)
		{
			System.out.println(cities[i]);
		}
	}

}