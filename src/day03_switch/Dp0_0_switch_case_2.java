package day03_switch;

public class Dp0_0_switch_case_2 {
	public static void main(String[] java)
	{
		String color=java[0];
		
		switch(color.toLowerCase())
		{
		case "red":System.out.println("Roses are red!");
		System.out.println("Sun is red!!");
		break;
		case "green":System.out.println("Earth is green!");
		System.out.println("Grasses are green!!");
		break;
		case "blue":System.out.println("Sky is blue!");
		System.out.println("Whale is blue!!");
		break;
		default:System.out.println("Please enter RGB color only1");
		}
	}

}
