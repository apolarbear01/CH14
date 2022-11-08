package cardgame;

public class Card implements Comparable <Card> {
	
	private String suit;
	private String card;
	
	public Card() {
		suit = "Spades";
		card = "Ace";
	}
	
	public Card(String suit, String card) {
		this.suit = suit;
		this.card = card;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}

	@Override
	public String toString() {
		return "Suit: " + suit + " Card: " + card;
	}

	public int toInt() {
		
			if(this.card.equals("Ace"))
				return 11;
			else if(this.card.equals("King") || this.card.equals("Queen")  || this.card.equals("Jack")) 
				return 10;
			else 
				return Integer.valueOf(card);
				
	
		
	}
	

	@Override
	public int compareTo(Card o) {
	
		
		if(this.getSuit().compareTo(o.getSuit()) == 0) {
			
			if(this.card.equals("Ace"))
				return "1".compareTo(o.getCard());
			else if(this.card.equals("10"))
				return "A".compareTo(o.getCard());
			else if(this.card.equals("King"))
				return "Z".compareTo(o.getCard());

			return this.getCard().compareTo(o.getCard());

		}

		return this.getSuit().compareTo(o.getSuit());
	}
	

}
