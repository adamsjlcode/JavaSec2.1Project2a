/**
 * ---------------------------------------------------------------------------
 * File name: Driver.java
 * Project name: CSCI_1260
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.Scanner;


/**
 * Driver Program For Card Class
 * 
 * <hr>
 * Date created: Feb 23, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Driver
{


	/**
	 * Main Method         
	 * 
	 * <hr>
	 * Date created: Feb 23, 2016
	 * 
	 * <hr>.
	 *
	 * @param args the arguments
	 */
	public static void main (String [ ] args)
	{
		
		/** The card. */
		Card card = new Card();
		
		/** The i user input. */
		int iUserInput = 1;		
		
		Scanner kb = new Scanner(System.in);
		System.out.println ("Default (" + card + ")");
		do
		{
			System.out.println ("Please Enter A Non-Negitive Number" +
								"\n Unless you wish to exit");
			iUserInput = kb.nextInt();
			if (iUserInput <0)
			{
				break;
			}
			System.out.println (card = new Card(iUserInput));
			kb.nextLine ( );
		}while (iUserInput>-1);
		showDeck();
	}//End Main(String)
	
	/**
	 * Show deck.
	 */
	private static void showDeck()
	{
		/** The card. */
		Card card;
		for (int index = 0;index<52;index++)
		{
			System.out.println (card = new Card(index));
		}
	}//End showDeck()
}//End Driver
