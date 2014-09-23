import java.util.Scanner;

public class TextAdventureSwordArtOnline {

	public static void main(String[] args) {
		Introduction();
		Aincrad();
	}

	private static void Introduction() {
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
					.println("Welcome to Aincrad, the main world for Sword Art Online, "
							+ Introduction.name
							+ ". "
							+ " Even though this world is text generated, it is still very much alive. Now that I have your attention, your first question.");
			System.out.println("");
			System.out.println("Do you want to: ");
			System.out.println("");
			System.out.println("<1> Continue?");
			System.out.println("<2> Exit the game.");
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
					System.out.println("You walk over to the player tutorial arena. An automated system greets you." + "\n" + "\n" + "Welcome to the new player tutorial. This game was designed in Java by a North American compan that has made a tutorial that should provide the needed help.");
					System.out.println("Which topic would you like to view?" + "\n" + "\n");
					System.out.println("<1> Explanation of Sword Art Online story");
					System.out.println("<2> How to navigate the game.");
					System.out.println("<3> Exit the tutorial.");
					option = input.nextInt();
					
					if(option == 1)
					{
						System.out.println("This game is based on a T.V. show by the name of Sword Art Online. Sword Art Online is a death game where any of the players who logged in on launch day were sent into the game via V.R. and could not be disconnected unless they would suffer the consequence of death by microwaves send from the V.R. straight to the player's nervous system and brain. This game does not have that as a limitation, however it may give you a slight headache.");
						option = input.nextInt();
					}
					if(option == 2)
					{
						System.out.println("If you have not already figured out, this game is navigated by the input of numbers. The number that coincides with the given action is selected to move on to the next part.");
						option = input.nextInt();
					}
					if(option == 3)
					{
						System.out.println("You exit the tutorial, the city is lively and robust with noises and smells around you. There is a dungeon nearby with a group of players moving inside." +"\n" + "\n");
						System.out.println("Would you like to join their party?");
						System.out.println("<1> Join the raid party.");
						System.out.println("<2> Do not join the raid party.");
						
						if(option == 1)
						{
							System.out.println( );
						}
					}
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
