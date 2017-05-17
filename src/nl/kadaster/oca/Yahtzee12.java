package nl.kadaster.oca;

import java.util.Scanner;

public class Yahtzee12 {										// Yahtzee 1.1
	public static void main (String... iets){					// with gameFlow
		int[] dices = {0,0,0,0,0};

		gameFlow(dices);
	}

	private static void gameFlow(int[] dices) {
		throwDice(dices);
		printDice(dices);
		freezeDice(dices);
		printDice(dices);
		freezeDice(dices);
		printDice(dices);
		chooseDestiny(dices);
	}

	private static void throwDice(int[] dices) {
		for (int i=0 ; i<5 ; i++){
			int diceEyes = (int) Math.round((Math.random()*6));
			if(diceEyes == 0)diceEyes=6;
			dices[i] = diceEyes;			
		}
	}

	private static void printDice(int[] dices) {
		System.out.print("Je gooide:"); 
		for (int i=0 ; i<5 ; i++){ 
			System.out.print( " " + dices[i]);
		}
		System.out.print(". ");
	}

	private static void freezeDice(int[] dices) {
		System.out.print("Getal bewaren: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();	
		
		if(input==0){
			System.out.println("Je hebt alle dobbelstenen nog eens gegooid");
			throwDice(dices);								//no input - no freeze
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
				System.err.println("Typ een getal. ");		// foutmelding en:
				freezeDice(dices);							// opnieuw invoer
			}
		}
	}
	
	private static void chooseDestiny(int[] dices) {
		System.out.println("Waar wil je deze uitkomst opslaan?");
		
		Scanner sc2 = new Scanner(System.in);										
		int inputDestiny = sc2.nextInt();
		int[] scoreCard = {0,0,0,0,0,0,0};
		int score = 0;
		int matches = 0;
		
		for (int i=0 ; i<5 ; i++){if (dices[i] == inputDestiny){matches++;}}	// count matches
		
		if(inputDestiny==0){
			scoreCard[0] = dices[0]+dices[1]+dices[2]+dices[3]+dices[4];
		}
		else{
			scoreCard[inputDestiny] = matches;									// insert in scoreCard
		}
		
		score += scoreCard[0];													// show scoreCard
		for (int i=0 ; i<7 ; i++){
			score += scoreCard[i]*i;
			if (i == 0){
				System.out.println("Restwaarde = " + scoreCard[0]);
			}
			else{
				System.out.println(scoreCard[i] + " x " + i + " = " + (scoreCard[i]*i) + ".");
			}
		}

		System.out.println("Jouw totaalscore: " + score + "!");					// show score
	}
}



//bepaal aantal spelers
//	speler1 - 6 x:
//		gooit
//		kiest stenen
//		gooit
//		kiest stenen
//		gooit
//		kiest de plek voor de uitkomst
//	uitkomst per speler
//vergelijk uitkomsten > winnaar

//leuk voor later:
//System.out.print("" + '\u2680' + '\u2681' + '\u2682' + '\u2683' + '\u2684' + '\u2685'); 2680 maar dan hexadecimaal
