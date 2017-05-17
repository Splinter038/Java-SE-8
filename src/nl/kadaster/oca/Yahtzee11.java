package nl.kadaster.oca;

import java.util.Scanner;

public class Yahtzee11 {										// Yahtzee 1.1
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
		Scanner sc2 = new Scanner(System.in);										
		int input3 = sc2.nextInt();
		int matches = 0;
		
		for (int i=0 ; i<5 ; i++){
			if (dices[i] == input3){
				matches++;
			}
		}
		System.out.println("Jouw score: " + matches + " x " + input3 + " = " + (matches*input3) + "!");
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
//System.out.print(Character.toChars(2680));
//System.out.print("" + '\u2680' + '\u2681' + '\u2682' + '\u2683' + '\u2684' + '\u2685'); 2680 maar dan hexadecimaal
