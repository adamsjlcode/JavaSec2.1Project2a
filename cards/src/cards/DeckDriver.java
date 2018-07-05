/**
 * ---------------------------------------------------------------------------
 * File name: DeckDriver.java
 * Project name: cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 25, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.Scanner;

/**
 * Simulate A Deck Of Cards
 * Shuffle The Deck
 * Deal A Card
 * Deal A Deck
 *
 * <hr>
 * Date created: Feb 25, 2016
 * <hr>
 * @author Justin Adams
 */
public class DeckDriver
{

	/**
	 * Main Method        
	 *
	 * <hr>
	 * Date created: Feb 25, 2016
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Deck deckOfCards = new Deck();
		
		System.out.println (deckOfCards.toString ( ));
		Scanner kb = new Scanner(System.in);
		System.out.println("\nPress Enter To Continue Going To Shuffle");
		kb.nextLine();
		deckOfCards.shuffle();
		System.out.println (deckOfCards.toString ( ));
		System.out.println ("\n\nNextCard Counter: " + deckOfCards.getNextCard());
		System.out.println (deckOfCards.dealACard ( ));
		System.out.println ("\nNextCard Counter: " + deckOfCards.getNextCard());
		System.out.println (deckOfCards.dealACard ( ));
		System.out.println("\nPress Enter To Continue Going To Shuffle Again");
		kb.nextLine();		
		deckOfCards.shuffle();
		System.out.println (deckOfCards.toString ( ));
		System.out.println("\nDeal A Hand");
		System.out.println (deckOfCards.dealAHand ( ));
		
	}//End Main

}//End DeckDriver
