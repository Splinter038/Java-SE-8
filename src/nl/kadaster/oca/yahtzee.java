package nl.kadaster.oca;

import java.util.Scanner;

public class yahtzee {
	
	public static void main(String[] args){
		int guesses = 2;
		int whosTurn = 1;

		System.out.println(",.-- Yahtzee! --., 2 spelers: naam 1e persoon: ");
		Scanner sc0 = new Scanner(System.in);										
		Player player1 = new Player();
		player1.name = sc0.nextLine();	
		System.out.println("Naam 2e persoon: ");
		Player player2 = new Player();
		player2.name = sc0.nextLine();	
		
		System.out.println(",.-- Yahtzee! --., " + player1.name + " is aan de beurt. Eerste worp (enter)");

		Scanner sc1 = new Scanner(System.in);										
		String input1 = sc1.nextLine();	

		int[] dice = new int[5];
		dice[0] = diceEyes();
		dice[1] = diceEyes();
		dice[2] = diceEyes();
		dice[3] = diceEyes();
		dice[4] = diceEyes();

		throwDice(0, dice, guesses, whosTurn);
	}	

	static void throwDice(int input, int dice[], int guesses, int whosTurn){
		if(guesses>0){
			if (input == 0){ 						// first throw or no saving number
				for (int i=0 ; i<5 ; i++){
					dice[i] = diceEyes();			// all new numbers
				}
			}
			if (input < 10){						// input = one digit
				for (int i=0 ; i<5 ; i++){
					if (dice[i] != input){
						dice[i] = diceEyes();
					}
				}
			}
			else{									// input = more digits ... nice to have
				for (int i=0 ; i<5 ; i++){
					if (dice[i] != input){
						dice[i] = diceEyes();
					}
				}
			}
			
			firstAndSecondThrow(dice, guesses, whosTurn);
			
		}

		else{
			thirdThrow(dice, guesses, whosTurn);
			System.out.println("volgende speler");
		}
	}

	static void firstAndSecondThrow(int dice[], int guesses, int whosTurn){
//		System.out.print(playerAanZet.name);
		System.out.print(" gooide: " + dice[0] + ", " + dice[1] + ", " + dice[2] + ", " + dice[3] + ", " + dice[4] + ". ");
		System.out.print("Je mag nog " + guesses + " proberen. ");
		System.out.print("Welk getal wil je bewaren? (typ 0 als je geen getal wil bewaren)");//, of getallen bewaren?");

		Scanner sc2 = new Scanner(System.in);										
		int input3 = sc2.nextInt();
		guesses--;
		throwDice(input3, dice, guesses, whosTurn);
	}
	
	static void thirdThrow(int dice[], int guesses, int whosTurn){
		System.out.print("Je gooide: " + dice[0] + ", " + dice[1] + ", " + dice[2] + ", " + dice[3] + ", " + dice[4] + ". ");
		System.out.print("Welk getal wil je bewaren?");

		Scanner sc2 = new Scanner(System.in);										
		int input3 = sc2.nextInt();
		int matches = 0;
		
		for (int i=0 ; i<5 ; i++){
			if (dice[i] == input3){
				matches++;
			}
		}
		System.out.println("Jouw score: " + matches + " x " + input3 + " = " + (matches*input3) + "!");
		guesses--; 

		if(whosTurn == 1)whosTurn = 2;
		else whosTurn = 1;
	}
	
	static int diceEyes(){
		double randomNo = (Math.random()*6);
		int diceEyes = (int) Math.round(randomNo);
		// int die = (int)(Math.random()*6)=1
		if(diceEyes == 0)diceEyes=6;
		return diceEyes;
	}
}
	class Player {
//		public Object player1;
//		public Object player2;
		public String name;
		public int[] score = {0, 0, 0, 0, 0, 0};
	}

