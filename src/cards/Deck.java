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

// TODO: Auto-generated Javadoc
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
		deck = new Card[52]; //Create a Deck Of Cards
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
	}//End getNextCard ( )
	
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
	 * @param n the n
	 * @return the string
	 */
	public Hand dealAHand(int n)
	{
		Hand hand = new Hand(n);//Create A Hand
		for(int index = 0;index<n;index++)
		{
			 hand.addCard (dealACard());
		}
		
		return hand;
	}//End dealAHand(int)
	
	/**
	 * Cards left.
	 *
	 * @return the int
	 */
	public int cardsLeft()
	{
		int iLeft; 	//Cards Left In Deck
		iLeft = 52 - nextCard;
		return iLeft;
	}
	
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
