package hiLo;
import java.util.Scanner;

public class HiLoGuessingGame {

	public static void main(String[] args) {
		//creates a scanner called scan
		Scanner scan = new Scanner(System.in);

		//string used to store users answer on if they want to play the game again
		String playAgain = "";

		//do while loop for the ability to play the game again
		do {
			//creates a random number between -1000000 and 1000000
			int theNumber = (int)(Math.random() * 2000000 - 1000000);
			
			//creates a variable "guess" to be used for users input
			int guess = 0;
			
			//creates a variable "count" that makes a count of how many guesses it took to guess the number
			int count = 0;

			//asks user to guess a number
			System.out.println("Guess a number between -1,000,000 and 1,000,000");

			//while loop to keep guessing until "theNumber" variable has been guessed
			while (guess != theNumber) {
				//assigns the users next input to "guess" variable
				guess = scan.nextInt();
				count+=1;

				//If statement to tell user that there number is (1)to low (2)Too high or (3)Just right 
				if(guess < theNumber) {
					System.out.println(guess + " is too low. Try again.");
				}
				else if(guess > theNumber) {
					System.out.println(guess + " is too high. Try again");
				}
				else {
					System.out.println(guess + " is the number.It took you " + count + " tries. Great job");
				}	
			}
			//asks user if they want to play again and if yes will loop back though
			System.out.println("Would you like to play again (y/n)?");
			playAgain = scan.next();	
		} while (playAgain.equalsIgnoreCase("y"));
		//if answer to playing again is no, it wont loop back
		System.out.println("Thank you for playing! Goodbye.");
		//closes the "scan" scanner
		scan.close();

	}

}
