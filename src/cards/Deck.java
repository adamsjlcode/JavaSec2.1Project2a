/**
 * ---------------------------------------------------------------------------
 * File name: Deck.java
 * Project name: cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 25, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

import java.util.Random;

/**
 * Simulate A Deck Of Cars
 * 
 * <hr>
 * Date created: Feb 25, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Deck
{
	
	/** The deck. */
	private Card deck[];
	
	/** The next card. */
	private int nextCard;
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 25, 2016 .
	 */
	public Deck ( )
	{
		deck = new Card[52];
		nextCard = 0;
		for(int index = 0;index < 52;index++)
		{
			deck[index]= new Card(index);
		}
	}//End Deck ( )
	
	/**
	 * Instantiates a new deck.
	 *
	 * @param existingDeck the existing deck
	 */
	
	public Deck (Deck existingDeck)
	{
		for(int index = 0;index < 52;index++)
		{
			this.deck[index] = existingDeck.deck[index];
		}
	}//End Deck (Deck)
	
	/**
	 * Gets the next card.
	 *
	 * @return nextCard
	 */
	public int getNextCard ( )
	{
		return nextCard;
	}//End etNextCard ( )
	
	/**
	 * Shuffle.
	 */
	public void shuffle()
	{
		Random ran = new Random();
		Card shuffle = new Card();
		for (int index = 0;index<52;index++)
		{
			nextCard = ran.nextInt (52);
			shuffle = this.deck[nextCard];
			this.deck[nextCard]=this.deck[index];
			this.deck[index]=shuffle;
		}
		nextCard = 0;
	}//End shuffle()
	
	/**
	 * Deal a card.
	 *
	 * @return the card
	 */
	public Card dealACard()
	{
		if (nextCard<52)
			{
			nextCard++;
			}
		return this.deck[nextCard-1];
	}//End dealACard()

	
	/**
	 * Deal a hand.
	 *
	 * @return the string
	 */
	public String dealAHand()
	{
		String strHand = ""; //Holds The Players Hand
		for(int index = 0;index<7;index++)
		{
			strHand +="\n"+dealACard().toString ( );
		}
		return strHand;
	}//End dealAHand()

	/**
	 * toString Method         
	 * 
	 * <hr>
	 * Date created: Feb 25, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String cards = "";	//Holds The Players Card
		for(int index = 0;index < 52;index++)
		{
			cards += "\n"+deck[index].toString ( );
			
		}
		return cards;
	}//End toString ()
	
}//End Deck
