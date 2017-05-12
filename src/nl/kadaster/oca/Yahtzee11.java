package nl.kadaster.oca;

public class Yahtzee11 {										// Yahtzee 1.1
	public static void main (String... iets){
		int[] arrayOfDices = {0,0,0,0,0};
		
		gameFlow(arrayOfDices);
	}
	
	private static void gameFlow(int[] arrayOfDices) {
		throwDice(arrayOfDices);
		
		System.out.print("Je gooide: ");
		for (int i=0 ; i<5 ; i++){
			System.out.print(arrayOfDices[i] + " ");
		}
	}

	private static int[] throwDice(int[] arrayOfDices) {
		for (int i=0 ; i<5 ; i++){
			int diceEyes = (int) Math.round((Math.random()*6));
			if(diceEyes == 0)diceEyes=6;
			arrayOfDices[i] = diceEyes;			// all new numbers
		}
		return arrayOfDices;
	}
}



//bepaal aantal spelers
//	speler1 - 6 x:
//		gooit
//		kiest stenen
//		gooit
//		kiest stenen
//		gooit
//		kiest stenen
//		kiest de plek voor de uitkomst
//	uitkomst per speler
//vergelijk uitkomsten > winnaar