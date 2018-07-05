/**
 * ---------------------------------------------------------------------------
 * File name: Card.java
 * Project name: CSCI_1260
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, Adamsjl3@goldmail@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: Feb 23, 2016
 * ---------------------------------------------------------------------------
 */

package cards;

/**
 * Card Class
 * 
 * <hr>
 * Date created: Feb 23, 2016
 * <hr>.
 *
 * @author Justin Adams
 */
public class Card
{
	
	/** The face. */
	private Face face;
	
	/** The suit. */
	private Suit suit;
	
	/**
	 * Default Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2016 .
	 */
	public Card ( )
	{
		face = Face.Ace;
		suit = Suit.Spades;
	}//End Card()
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Feb 23, 2016 .
	 *
	 * @param face the face
	 * @param suit the suit
	 */
	public Card (Face face, Suit suit)
	{
		super ( );
		this.face = face;
		this.suit = suit;
	}//End Card(Face,Suit)
	
	/**
	 * Instantiates a new card.
	 *
	 * @param n the n
	 */
	public Card (int n)
	{
		super ( );
		this.face = Face.values ( )[n % 13];
		this.suit = Suit.values ( )[n % 4];
	}//End Card (int)

	/**
	 * toString Method        
	 *
	 * <hr>
	 * Date created: Feb 23, 2016 
	 *
	 * <hr>
	 * @return
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString ( )
	{
		return String.format ("The %s of %s", face, suit);
	}//End toString()
	
}//End Card
