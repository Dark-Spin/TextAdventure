import java.util.Scanner;


public class Introduction
	{
	static String name;
	
	public static void main(String[] args)
		{
		Introduction1();
		}

	static void Introduction1()
		{
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome Stranger, Please Enter Your Name");
		name = input.nextLine();
		System.out.println("Welcome to Sword Art Online" + name + "\n");

		}

	}
