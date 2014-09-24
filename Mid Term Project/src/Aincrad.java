import java.util.Scanner;

public class Aincrad
	{

	static String[] name =
		{ "Diavel", "Klein" };
	static String[] class1 =
				{ "Swordsman", "MaceWielder" };

	public static String[] getName()
		{
		return name;
		}

	public static String[] getClass1()
		{
		return class1;
		}

	public static void setName(String[] name)
		{
		Aincrad.name = name;
		}

	public static void setClass1(String[] class1)
		{
		Aincrad.class1 = class1;
		}

	public static void main(String[] args)
		{
		Aincrad1();

		}

	static void Aincrad1()
		{
		boolean again = true;
		do

			for (int i = 0; i < name.length; i++)
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
						System.out
								.println("You walk over to the player tutorial arena. An automated system greets you."
										+ "\n"
										+ "\n"
										+ "Welcome to the new player tutorial. This game was designed in Java by a North American company that has made a tutorial that should provide the needed help.");
						System.out
								.println("Which topic would you like to view?"
										+ "\n" + "\n");
						System.out
								.println("<1> Explanation of Sword Art Online story");
						System.out.println("<2> How to navigate the game.");
						System.out.println("<3> Exit the tutorial.");
						option = input.nextInt();

						if (option == 1)
							{
							System.out
									.println("This game is based on a T.V. show by the name of Sword Art Online. Sword Art Online is a death game where any of the players who logged in on launch day were sent into the game via V.R. and could not be disconnected unless they would suffer the consequence of death by microwaves send from the V.R. straight to the player's nervous system and brain. This game does not have that as a limitation, however it may give you a slight headache. Please select a number from above to continue.");
							option = input.nextInt();
							}
						if (option == 2)
							{
							System.out
									.println("If you have not already figured out, this game is navigated by the input of numbers. The number that coincides with the given action is selected to move on to the next part. Please select a number from above to continue.");
							option = input.nextInt();
							}
						if (option == 3)
							{
							System.out
									.println("You exit the tutorial, the city is lively and robust with noises and smells around you. There is a dungeon nearby with a group of players moving inside."
											+ "\n" + "\n");
							System.out
									.println("Would you like to join their party?");
							System.out
									.println("<1> Join the raid party and enter the dungeon.");
							System.out.println("<2> Enter the dungeon alone.");
							option = input.nextInt();

							if (option == 1)
								{
								System.out
										.println("The main raid party leader, "
												+ name[i] + ", " + class1[i]
												+ ", hands you a sword. As you enter the cave with the raid party, shadow minions and demons emerge from the shadows. You and the raid party defeat the treat and reach the boss room on floor one. The raid party leader opens the door and everyone rushes in. The boss under heavy attack, the boss is left with one hitpoint.");
								System.out.println("This is your chance.");
								System.out
										.println("<1> " + Introduction.name + ", get the last hit with your sword skill Wind Breaker.");
								System.out
										.println("<2> Let the raid leader get the final hit.");
								System.out
										.println("<3> Let " + name[i+1] + ", " + class1[i+1] + ", get the last hit.");
								option = input.nextInt();

								if (option == 1)
									{
									System.out
											.println("You get the final kill and are awarded with the final hit bonus.");
									System.out.println("You Win!");
									System.out
											.println("The system will now automatically log you out.");
									System.exit(0);
									} else
									{
									System.out
											.println("The raid party has won the fight, the game is now complete.");
									System.out.println("You Win!");
									System.out
											.println("The system will now automatically log you out.");
									System.exit(0);
									}
								} else
								{
								System.out
										.println("A shadow minion dashes through the cave, slicing through you and you lose all of you hitpoints.");
								System.out.println("You have been killed.");
								System.out.println("Logging Out.");
								System.exit(0);
								}
							}
						} else
						{
						System.out
								.println("The shops have an abundant assortment of goods, you are given a sword by a younger merchant. A dungeon is nearby the shops.");
						System.out.println("Would you like to:");
						System.out.println("<1> Enter the dungeon.");
						System.out.println("<2> Do not enter the dungeon.");
						option = input.nextInt();

						if (option == 1)
							{
							System.out
									.println("A shadow demon rushes through the cave, slicing you in half and you lose all of you hitpoints.");
							System.out.println("You have been killed.");
							System.out.println("Logging Out.");
							System.exit(0);
							}
						if (option == 2)
							{
							System.out
									.println("The overwhelming act of doing nothing kills you.");
							System.out.println("You have been killed.");
							System.out.println("Logging Out.");
							System.exit(0);
							option = input.nextInt();
							}
						}
					}
				if (option == 2)
					{
					System.out.println("Goodbye.");
					System.exit(0);
					} else
					{
					System.out
							.println("Your input is invalid. Enter another number to reset the current prompt.");
					option = input.nextInt();
					}
				if (option == 1)
					{
					again = true;
					}

				if (option == 2)
					{
					again = false;
					}

				}
		while (again == true);

		}
	}
