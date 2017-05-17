package nl.kadaster.oca;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Yahtzee13 {													// Yahtzee 1.3
	static ArrayList<YahtzeePlayer> players = new ArrayList();				// with gameFlow
	static int[] dices = {0,0,0,0,0};										// with i players
	static int numberOfPlayers = 0;											// with winner
	
	public static void main (String... iets){	
		System.out.println("Welcome at Mark's Yahtzee! ");
		inputPlayers();
		gameFlow();
	}

	private static void inputPlayers() {
		Scanner sc = new Scanner(System.in);
		boolean inputPhase = true;

		while(inputPhase){
			System.out.print("Insert name of player:");						
			String input1 = sc.nextLine();
			if (input1.equals("")){											//startgame
				inputPhase = false;
				break;
			}
			else{
				players.add(new YahtzeePlayer());							// add players
				int positie = players.size() - 1;
				players.get(positie).name = input1;
				numberOfPlayers++;
			}
		}
	}

	private static void gameFlow() {
		for (int h = 0 ; h <= 6 ; h++){
			for (int i = 0 ; i < numberOfPlayers ; i++){
				players.get(i).throwDice();
				players.get(i).printDice(players.get(i));
				players.get(i).freezeDice();
				players.get(i).printDice(players.get(i));
				players.get(i).freezeDice();
				players.get(i).printDice(players.get(i)	);
				players.get(i).chooseDestiny(players.get(i));
			}
		}
		System.out.println(checkWinner());
	}

	static void throwDice() {
		for (int i=0 ; i<5 ; i++){
			int diceEyes = (int) Math.round((Math.random()*6));
			if(diceEyes == 0)diceEyes=6;
			dices[i] = diceEyes;			
		}
	}

	static void printDice(YahtzeePlayer player) {
		
		System.out.print(player.name + " gooide:"); 
		for (int i=0 ; i<5 ; i++){ 
			System.out.print( " " + dices[i]);
		}
		System.out.print(". ");
	}

	static void freezeDice() {
		System.out.print("Getal bewaren: (0 als je alle dobbelstenen nog eens wil gooien)");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	

		if(input==0){
			System.out.println("Je hebt alle dobbelstenen nog eens gegooid");
			throwDice();														//no input - no freeze
		}
		else{
			try{
				int inputInteger = Integer.valueOf(input);
				for (int i=0 ; i<5 ; i++){
					if (dices[i] != inputInteger){
						int diceEyes = (int) Math.round((Math.random()*6));
						if(diceEyes == 0)diceEyes=6;
						dices[i] = diceEyes;			
					}
				}
			}catch(NumberFormatException ex){
				System.err.println("Typ een getal. ");							// error en:
				freezeDice();													// insert again
			}
		}
	}

	static void chooseDestiny(YahtzeePlayer player) {
		System.out.print("Waar wil je deze uitkomst opslaan?  (0 als je alle ogen in 'rest' wil opslaan)");

		Scanner sc2 = new Scanner(System.in);										
		int inputDestiny = sc2.nextInt();
		int score = 0;
		int matches = 0;

		for (int i=0 ; i<5 ; i++){if (dices[i] == inputDestiny){matches++;}}	// count matches

		if(inputDestiny==0){
			player.scoreCard2[0] = dices[0]+dices[1]+dices[2]+dices[3]+dices[4];
		}
		else{
			player.scoreCard2[inputDestiny] = matches;							// insert in scoreCard
		}

		for (int i=0 ; i<7 ; i++){
			score += player.scoreCard2[i]*i;
			if (i == 0){
				System.out.println("Rest  = " + player.scoreCard2[0]);
			}
			else{
				System.out.println(player.scoreCard2[i] + " x " + i + " = " + (player.scoreCard2[i]*i));
			}
		}
		player.score = score;
		System.out.println(player.name + "'s score: " + score + ".");			// show score
		System.out.println();
	}
	
	static String checkWinner () {
		int winnerIndex = 0;
		int tempValue = 0;
		String enDeWinnaarIs = "";

		for (YahtzeePlayer player : players){									// print scores
			System.out.println(player.name + "'s totaalscore is: " + player.score + ".");
		}

		for(int i = 0 ; i < players.size() -1 ; i++){							//loop layers
			System.out.println("loopB");
			if (players.get(i).score > players.get(i+1).score){					//compare scores
				winnerIndex = i;
			}else{
			winnerIndex = i+1;
			}
			enDeWinnaarIs = players.get(winnerIndex).name + " heeft gewonnen met " + players.get(winnerIndex).score + " punten !";
		}
		return enDeWinnaarIs;
	}
}

class YahtzeePlayer {
	String name;
	int[] scoreCard2 = {0,0,0,0,0,0,0};
	int score = 0;

	public void throwDice() {
		Yahtzee13.throwDice();
	}
	public void chooseDestiny(YahtzeePlayer YahtzeePlayer) {
		Yahtzee13.chooseDestiny(YahtzeePlayer);
	}
	public void printDice(YahtzeePlayer YahtzeePlayer) {
		Yahtzee13.printDice(YahtzeePlayer);
	}
	
	public void freezeDice() {
		Yahtzee13.freezeDice();
	}
}