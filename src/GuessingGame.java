

public class GuessingGame {
	
	//creating four private variable
	private int correctNumber;
	private int guessesRemaining;
	private boolean isWon;
	private boolean isOver;
	
	
	//created constructor taking one argument
	public GuessingGame(int correctNumber){
		this.correctNumber = correctNumber;
		guessesRemaining =10; //assigning guessRamaing to 10, by default
		isWon = false;
		isOver = false;
	}
	
	//created method for getting guess remaining
	public int getGuessRemaining() {
		return guessesRemaining;//returns the remaining number of guesses
	}
	
	//created method to finish the game
	public boolean isOver() {
		return isOver;//return boolean value game situation
	}
	
	//created method to win the game
	public boolean isWon() {
		return isWon;//returns boolean value based game situation
	}
	
	//created method to make guess & takes one argument as an input from the player
	public void makeGuess(int takeInput) {
		if (!isOver) { //checks if game is not over then,
			guessesRemaining--; //decreases the remaining no. of guess by 1
				if (correctNumber == takeInput) { // checks if input is correct
					isWon = true; //isWon and isOver becomes true & prints output as "correct!"
					isOver = true;
					System.out.println("Correct!");
				}
				else if (correctNumber < takeInput) { // and if number is greater then, it print output as "You are too High!"
					System.out.println("You are too High!");
				}
				else if (correctNumber > takeInput) {// and if number is lower then, it print output as "You are too Low!"
					System.out.println("You are too Low!");
				}
				if (guessesRemaining == 0) { //if no of remaining guess is 0, then game is over & isOver becomes true
					isOver =true;
				}
			}
		else {//else it print "Game Over!"
			System.out.println("Game Over!");
		}
	}
	
	//created method to get correct number after finishing game 
	public void printCorrectNumber() {
		if(isOver) { // it checks if game is over then, it print the correct number as output
		System.out.println("Correct number: " + correctNumber);
		}
	}
	
}

