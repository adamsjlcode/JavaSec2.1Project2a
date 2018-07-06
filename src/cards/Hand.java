/**
 * ---------------------------------------------------------------------------
 * File name: Hand.java
 * Project name: cards
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 25, 2016
 * ---------------------------------------------------------------------------
 */

package cards;


/**
 * Holds a Hand Of Cards
 * 
 * <hr>
 * Date created: Feb 25, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Hand
{
	
	/** The hand. */
	private Card hand[];	
	
	/** The hand size. */
	private int handSize;
	
	/** The cards in hand. */
	private int cardsInHand;

	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 25, 2016 .
	 */
	public Hand ( )
	{
		handSize = 5;
		cardsInHand = handSize;
		hand = new Card[handSize];
		
	}//End Hand ( )
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 25, 2016 .
	 *
	 * @param handSize the hand size
	 */
	public Hand (int handSize)
	{
		super ( );
		this.handSize = handSize;
		cardsInHand = handSize;
		hand = new Card[this.handSize];
	}//End Hand (int)
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 25, 2016 .
	 *
	 * @param handIn the hand in
	 */
	public Hand (Hand handIn)
	{
		super ( );
		for(int index = 0;index< hand.length;index++)
		{
			this.hand[index] = hand[index];
		}
	}//End Hand (Hand)
	
	/**
	 * Adds the card.
	 *
	 * @param card the card
	 */
	public void addCard(Card card)
	{
		if(cardsInHand!=0)
		{
			this.hand[cardsInHand-1]=card;
			cardsInHand--;
		}
			
	}//End addCard(Card)

	/**
	 * toString Method         
	 * 
	 * <hr>
	 * Date created: Feb 26, 2016 
	 * 
	 * <hr>.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		String strHand = "";
		for(int index = 0;index<hand.length;index++)
		{
			strHand += "\n"+hand[index].toString ( );
		}
		return strHand;
	}//End toSting()
	
}//End Hand
