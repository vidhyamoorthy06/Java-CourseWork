/**
 *Create a lottery game application. Generate three random numbers (Math.random()),
each between 0 and 9. Allow the user to guess three numbers. Compare each of
the users guesses to the three random numbers and display a message that includes
the users guess, the randomly determined three-digit number, and the amount of
money the user has won as follows:
Matching Numbers Award : ($)
Any one matching :10
Two matching :100
Three matching, not in order: 1,000
Three matching in exact order: 1,000,000
No matches 0
Note: Make certain that your application accommodates repeating digits. 
For example, if a user guesses 1, 2, and 3, and the randomly generated digits are 1, 1,
and 1, do not give the user credit for three correct guesses just one. Save the file as
LotteryXX.java. Note that for your submission, you need to replace XX with your
name.
Your application should be able to let user choose if he/she wants to play the game
again.
 * @author Moorthy , Vidhya
 * @assignment CSCI 531 ***
 * @date 02/28/2018
 */
import java.util.Arrays;
import java.util.Scanner;

public class LotteryVidhyaMoorthy {
  
	// this method prints the ticket 
public static void print(int[] a)
{
	for(int e: a)
	{
		System.out.print(e);
	}
	System.out.println();
}

	// this method validates the guessed ticket number with the actual ticket and returns the count of matches
public static int validateTicket(int[] r,int[] e)
{
	/**
	 * This method handles special case when there is a duplicate digit in the randomly generated ticket but not duplicate 
	 * digit in user entered guess digits
	 * For Example : e --> Entered ticket, r --> Randomly generated original ticket
	 * r = {111} e = {123} --> match = 1
	 * but
	 * r = {123} e = {111} --> match = 3
	 * r = {123} e = {213} --> match = 3
	 * r = {123} e = {246} --> match = 1
	 * r = {123} e = {243} --> match = 2
	 * r = {123} e = {123} --> match = 4 // special case for switch statement - perfect match
	 * Both the tickets duplicated cannot be handled in the same method
	 */
	int match=0;
		if ((e[0] == r[0]) && (e[1] == r[1]) && (e[2] == r[2])) { match = 4;} // perfect match - all the digits are in order
		if ((e[0] == r[0]) || (e[0] == r[1]) || (e[0] == r[2])) { match++;} // first digit matches
		if ((e[1] == r[0]) || (e[1] == r[1]) || (e[1] == r[2])) { match++;} //second digit matches
		if ((e[2] == r[0]) || (e[2] == r[1]) || (e[2] == r[2])) { match++;} // third digit matches
	
	return match;
}
	//this method generates a random three digit ticket number
public static int[] generateTicket()
{
	int max = 9;
	int min = 0;
	int range = max - min + 1;		
	int[] ticketNumber = new int[3];
	// generate random number from 1 to 10
	for(int i=0;i<3;i++)
	{
		ticketNumber[i] = (int) (Math.random()* range) + min;
	}
	return ticketNumber;
}

	//program execution starts here
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//generating the winning ticket to be guessed by the player
		int[] ticketNumber = generateTicket(); //generating a new ticket
		int[] guess = new int[3];
		int award=0;	
		
		//getting the guessed number from the user		
	
		String ch = "y";
		while(ch.equalsIgnoreCase("y"))
		{ 
			award=0; // reset the award money 
			ticketNumber = generateTicket(); //generating a new ticket
			//print(ticketNumber);
			System.out.println("Enter the first digit::");
			guess[0] = sc.nextInt();
			System.out.println("Enter the second digit::");
			guess[1] = sc.nextInt();
			System.out.println("Enter the third digit::");
			guess[2] = sc.nextInt();
			System.out.print("You guessed "); print(guess);
			System.out.println("Winning number was "); print(ticketNumber);
			// counting the number of matching digits in the guessed number
			int count = validateTicket(ticketNumber,guess);
			//the award money is calculated based on the count value
			//System.out.println("count ::"+count);
			switch(count)
			{
			case 1:
				// only one digit matches
				award+=10;
				break;
			case 2:
				// two digits are matching
				award+=100;
				break;
			case 3:
				// three digits are matching in no order
				award+=1000;
				break;
			case 4:
				// perfect match - three digits are matching in order
				award+=1000000;
				break;
			}
			
			//printing the award money in the current play
			System.out.println("You have won $"+award+" !");
			// asking the choice of the player if he wishes to play again
			System.out.println("Do you want to play this game one more time? y for 'Yes' or n for 'No'");
			ch = sc.next();
			// if the user wishes to quit then the game is over
			if(ch.equalsIgnoreCase("n"))
				System.out.println("Game over !");
		}

	}

}
