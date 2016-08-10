/*Create a class to represent a standard playing card.  
 *It must have at least:  2 instance variables, 1 class (static) 
 *variable, 2 constructors, and 5 other methods (one must be static).  

Then write a "main" program that plays some sort of game with at least 2
 instances of your playing card class.  

Suggestions:  every card has a suit (hearts, diamonds, clubs, or spades) and 
a face value (1-10, jack, queen, king), so those would be great instance variables. 
 Your class variable could represent the number of cards dealt, or the sum of the 
 face values of the cards.  Depending on the game you are planning to use the cards 
 in, the face value could either be stored as an int (with jack = 11, queen = 12,
  and king = 13) or a String.  Some ideas for games:  war, 21, or a simplified version 
  of poker.
*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class CardGameCS2 {
	private double Cash;
	private double CashAdded;
	private int CardSuit;
	private int CardNumber;
	private String Card;
	private static String MyCards;
	private static int TotalCardsDelt;
	private static DecimalFormat df = new DecimalFormat("#.00");

	
	public CardGameCS2() {
		Cash = 0;
		CashAdded = 0;
		Card = "";
		CardSuit = 0;
		CardNumber = 0;
		TotalCardsDelt = 0;
		MyCards = "";
	}
	public CardGameCS2(double UCash, int UCashAdded, int UCardSuit, int UCardNumber, String UCard, String UMyCards, int UTotalCardsDelt) {
		Cash = UCash;
		CashAdded = UCashAdded;
		CardSuit = UCardSuit;
		CardNumber = UCardNumber;
		Card = UCard;
		MyCards = UMyCards;
		TotalCardsDelt = UTotalCardsDelt;
	}
	public void NewGame(int WhatToDo) {
		if (WhatToDo == 0) {
			CardSuit = 0;
			CardNumber = 0;
			Card = "";
			MyCards = "";
		} else if (WhatToDo == 1) {
			Cash = 0;
			CashAdded = 0;
			CardSuit = 0;
			CardNumber = 0;
			Card = "";
			MyCards = "";
			TotalCardsDelt = 0;
		}
	}
	public void Cash(double Amount) {
		Cash += Amount;
	}
	public double getCash() {
		return(Cash);
	}
	public void addCash(double Amount) {
		Cash += Amount;
		CashAdded += Amount;
	}
	public double getCashAdded() {
		return(CashAdded);
	}
	public int DealNumber() {
		CardNumber = (int) (Math.floor(Math.random() * 12 + 1));
		TotalCardsDelt++;
		return(CardNumber);
	}
	public int getCardNumber() {
		return(CardNumber);
	}
	public void DealSuit() {
		CardSuit = (int) (Math.floor(Math.random() * 3 + 1));
	}
	public int getCardSuit() {
		return(CardSuit);
	}
	public String State(int CardsNumber) {
		this.DealSuit();
		Card = "";
		if (CardsNumber == 1) {
			Card += "Ace of ";
		} else if (CardsNumber == 2) {
			Card += "Two of ";
		} else if (CardsNumber == 3) {
			Card += "Three of ";
		} else if (CardsNumber == 4) {
			Card += "Four of ";
		} else if (CardsNumber == 5) {
			Card += "Five of ";
		} else if (CardsNumber == 6) {
			Card += "Six of ";
		} else if (CardsNumber == 7) {
			Card += "Seven of ";
		} else if (CardsNumber == 8) {
			Card += "Eight of ";
		} else if (CardsNumber == 9) {
			Card += "Nine of ";
		} else if (CardsNumber == 10) {
			Card += "Ten of ";
		} else if (CardsNumber == 11) {
			Card += "Jack of ";
		} else if (CardsNumber == 12) {
			Card += "Queen of ";
		} else if (CardsNumber == 13) {
			Card += "King of ";
		}
		if (CardSuit == 1) {
			Card += "Diamonds.";
		} else if (CardSuit == 2) {
			Card += "Spades.";
		} else if (CardSuit == 3) {
			Card += "Hearts.";
		} else if (CardSuit == 4) {
			Card += "Clubs.";
		}
		return(Card);	
	}
	public static String getMyCards() {
		return(MyCards);
	} 
	public static int getTotalCardsDelt() {
		return(TotalCardsDelt);
	}
	public String toString() {
		return("You have a balance of $" + df.format(Cash) + "." + "\n" + "The total amount of cards delt in this game was " + TotalCardsDelt + ".");
	}
}