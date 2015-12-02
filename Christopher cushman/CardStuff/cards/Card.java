package cards;

public class Card implements Comparable<Card> {

	// clubs diamonds hearts spades
	
	private Suit suit;
	private int value;
	
	public Card(int suit, int value){
		switch(suit) {
		case 1:
			this.suit = Suit.CLUBS;
			break;
		case 2:
			this.suit = Suit.DIAMONDS;
			break;
		case 3:
			this.suit = Suit.HEARTS;
			break;
		case 4:
			this.suit = Suit.SPADES;
			break;
		}
		this.value = value;
				
	}
	public int compareTo(Card arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(suit.toString().toLowerCase())
	}

}
