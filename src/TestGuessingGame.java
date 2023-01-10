
//imported scanner library to get input from user
import java.util.Scanner;
//imported random library to get generate random number
import java.util.Random;

public class TestGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		//created new variable to store generated random number from 1 to 100
		Random rand = new Random();
		int intRand = rand.nextInt(101);
		
		//print random number
		System.out.println(intRand);
		
		//created new object for GuessingGame constructor
		GuessingGame g = new GuessingGame(intRand); 
		
		//created new variable to store user input
		Scanner userInput = new Scanner(System.in);
		// this do while loop will iterate under 2 condition
		//if game is Won/Over and until the no. of remaining guesses are 0
	   do {
		   		//print a message to ask for input
				System.out.println("Guess a number: ");
				
				//prompt user to input a integer
				int user = userInput.nextInt(); 
				
				//called a method to make guess
				g.makeGuess(user);
				
				//print the number of remaining guesses
				System.out.println("Remaining Guess: "+ g.getGuessRemaining());
			  } while(!g.isOver());  //this will check every time it iterates, if game is Over
				  
			if(g.isWon()) { //it checks if game is Won
				System.out.println("Won!"); // prints winning message
				userInput.close(); //user input is closed
			} 
			else { // otherwise
				System.out.println("Lost"); //prints losing message
				userInput.close(); // user input is closed
			}
		} 

	}


