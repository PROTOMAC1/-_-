package packages;

// import java.util.Random;
import java.util.Scanner;

class Numberguess {

	public static void main(String[] args) {
			
			Random rand = new Random();
			
			Scanner scanner = new Scanner(System.in);
			
			int randomNumber = rand.nextInt(100) + 1;
			
			//System.out.println(randomNumber);
			
			int tryCount = 0;
			
			while(true) {
				
				System.out.println("Enter your guess between 1 to 100 :");
				
				int playerGuess = scanner.nextInt();
				
				tryCount++;
				
				if (playerGuess == randomNumber) {
					System.out.println("You Guess the Correct Number! You win the Game!");
					System.out.println("It tooks you " + tryCount + " Tries to Guess the Number!");
					break;
				}
				else if (playerGuess > randomNumber) {
					System.out.println("You Guess the Wrong Number! The Number is Lower! Guess again!");
				}
				else {
					System.out.println("You Guess the Wrong Number! The Number is Higher! Guess again!");
				}
			}
			
			scanner.close();
			
	}

}
