import java.util.Scanner;

public class TextAdventureSwordArtOnline
	{

	public static void main(String[] args)
		{
		Introduction();
		Aincrad();
		}

	private static void Introduction()
		{
		Introduction.Introduction1();

		}

	private static void Aincrad()
		{
		boolean again = true;
		do
			{

			int option;

			Scanner input = new Scanner(System.in);
			System.out
					.println("Welcome to Aincrad "
							+ Introduction.name
							+ ". "
							+ " Even though this world is text generated, it is very much alive. Now I have a qestion for you.");
			System.out.println("");
			System.out.println("Do you: ");
			System.out.println("");
			System.out.println("<1> Plan to continue?");
			System.out.println("<2> Want to get out of this game?");
			option = input.nextInt();

			if (option == 1)
				{

				System.out
						.println(Introduction.name
								+ ", you are auto teleported to the main city on floor one, The Town of Begginings. There is a new player tutorial on the left and shops on the right.");
				System.out.println("");
				System.out.println("Would you like to go left or right?");
				System.out.println("");
				System.out.println("<1> Left");
				System.out.println("<2> Right");
				option = input.nextInt();

				if (option == 1)
					{
					System.out.println("You walk over to the player tutorial arena. "\"Welcome to the new player tutorial. This game was designed in Java by a North American company that barely monitors the use of the game, so any questions you might have rarely get answered, however this tutorial should provide the needed help.\"");
					}
				}
			if (option == 2)
				{
				System.out.println("Goodbye.");
				System.exit(0);
				}

			if (option == 1)
				{
				again = true;
				}

			if (option == 2)
				{
				again = false;
				}

			} while (again == true);
		}
	}
