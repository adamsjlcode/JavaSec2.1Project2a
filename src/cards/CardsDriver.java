/**
 * ---------------------------------------------------------------------------
 * File name: CardsDriver.java
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
 * Enter type purpose here
 *
 * <hr>
 * Date created: Feb 25, 2016
 * <hr>
 * @author Justin Adams
 */
public class CardsDriver
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Feb 25, 2016
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		Deck deck = new Deck();
		int iHand;
		int iPlayers;
		int iCount;
		Scanner kb = new Scanner(System.in);
		deck.shuffle ( );
		
		do
		{
			System.out.println ("How many cards are in one hand? ");
			try
			{
				iHand = kb.nextInt ( );
				
			}
			catch (Exception e)
			{
				System.out.println ("Try Again");
				iHand = -1;
			}
			System.out.println ("How many players are playing? ");
			iPlayers = kb.nextInt ( );
			if (iHand * iPlayers > 52)
			{
				System.out.println ("Try Again\n\n");
				iHand = -1;
				iPlayers = -1;
			} 
		}
		while (iHand < 1&&iPlayers < 1);
		iCount = iPlayers;
		for (int index = 0;index<iPlayers;index++)
		{
			System.out.println ("Player: " + iCount + deck.dealAHand (iHand));
			iCount--;
		}
		System.out.println (deck.cardsLeft ( ));
	}//End main(String)

}//End CardDriver
