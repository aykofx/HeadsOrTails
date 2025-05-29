import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables to count points
		int playerPoints = 0;
		int computerPoints = 0;
		
		// Scanner for user input
		Scanner scanner = new Scanner(System.in);
		
		// Random object for the computer Turn
		Random random = new Random();
		
		// Array of the 2 choices
		String[] choices = new String[] {"Heads","Tails"};
		
		// Loop for 5 rounds
		for (int i = 0; i < 5; i++) {
		
			// Computer gets random String from the choice array
			int compTurn = random.nextInt(choices.length);
			String compChoice = choices[compTurn].toString().toLowerCase();
			
			// Ask for user input
			System.out.println("What do you want to choose? (Heads/Tails)");
			String playerChoice = scanner.nextLine().toLowerCase();
			
			// If input is invalid, repeat this round without counting it
			if (!playerChoice.equals("heads")  && !playerChoice.equals("tails")) {
				System.out.println("Please only enter Heads or Tails!");
				i--;
				continue;
			}
			
			// Player gets a point if the guess matches
			if (playerChoice.equals(compChoice)) {
				System.out.println("You: "+playerChoice +" || Computer: "+compChoice);
				playerPoints++;
				System.out.println("Player: "+playerPoints+ " || Computer: "+computerPoints);
				System.out.println("Round "+ (i + 1) + "/5");
				System.out.println();
			} else {
				System.out.println("You: "+playerChoice +" || Computer: "+compChoice);
				computerPoints++;
				System.out.println("Player: "+playerPoints+ " || Computer: "+computerPoints);
				System.out.println("Round "+ (i + 1) + "/5");
				System.out.println();
			}
			
		}
		
		// Print final score
		if (playerPoints > computerPoints) {
			System.out.println("Your points: "+playerPoints+" || Computer: "+computerPoints);
			System.out.println("You win!");
		} else {
			System.out.println("Your points: "+playerPoints+" || Computer: "+computerPoints);
			System.out.println("The computer wins!");
		}
		
		// Close scanner to prevent memory leak
		scanner.close();
		
	}

}
