package cardgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

	private ArrayList<Card> cards;
	
	public Deck() {
		
		cards = new ArrayList<Card>(52);
		
			
			cards.add(new Card("Hearts","Ace"));
			cards.add(new Card("Hearts","2"));
			cards.add(new Card("Hearts","3"));
			cards.add(new Card("Hearts","4"));
			cards.add(new Card("Hearts","5"));
			cards.add(new Card("Hearts","6"));
			cards.add(new Card("Hearts","7"));
			cards.add(new Card("Hearts","8"));
			cards.add(new Card("Hearts","9"));
			cards.add(new Card("Hearts","10"));
			cards.add(new Card("Hearts","Jack"));
			cards.add(new Card("Hearts","Queen"));
			cards.add(new Card("Hearts","King"));
		
			cards.add(new Card("Spades","Ace"));
			cards.add(new Card("Spades","2"));
			cards.add(new Card("Spades","3"));
			cards.add(new Card("Spades","4"));
			cards.add(new Card("Spades","5"));
			cards.add(new Card("Spades","6"));
			cards.add(new Card("Spades","7"));
			cards.add(new Card("Spades","8"));
			cards.add(new Card("Spades","9"));
			cards.add(new Card("Spades","10"));
			cards.add(new Card("Spades","Jack"));
			cards.add(new Card("Spades","Queen"));
			cards.add(new Card("Spades","King"));
		
		
			cards.add(new Card("Diamonds","Ace"));
			cards.add(new Card("Diamonds","2"));
			cards.add(new Card("Diamonds","3"));
			cards.add(new Card("Diamonds","4"));
			cards.add(new Card("Diamonds","5"));
			cards.add(new Card("Diamonds","6"));
			cards.add(new Card("Diamonds","7"));
			cards.add(new Card("Diamonds","8"));
			cards.add(new Card("Diamonds","9"));
			cards.add(new Card("Diamonds","10"));
			cards.add(new Card("Diamonds","Jack"));
			cards.add(new Card("Diamonds","Queen"));
			cards.add(new Card("Diamonds","King"));
		
		
			cards.add(new Card("Clubs","Ace"));
			cards.add(new Card("Clubs","2"));
			cards.add(new Card("Clubs","3"));
			cards.add(new Card("Clubs","4"));
			cards.add(new Card("Clubs","5"));
			cards.add(new Card("Clubs","6"));
			cards.add(new Card("Clubs","7"));
			cards.add(new Card("Clubs","8"));
			cards.add(new Card("Clubs","9"));
			cards.add(new Card("Clubs","10"));
			cards.add(new Card("Clubs","Jack"));
			cards.add(new Card("Clubs","Queen"));
			cards.add(new Card("Clubs","King"));
		
	
			
	}
	
	public Deck(int size) {
		this.cards = new ArrayList<>(size);
	}
	
	
	public void printDeck() {
		
			for (int i = 0; i < cards.size(); i++) {
					System.out.println(this.cards.get(i));
			}
		
	}
	
	
	public void shuffleDeck() {
		
		Random randomNumber = new Random();
		
		
				for (int i = 0; i < this.cards.size(); i++) {
						
					int index = randomNumber.nextInt(52);

					Card temp = this.cards.get(index);
					this.cards.set(index, this.cards.get(i));
					this.cards.set(i, temp);
				
				}
		
	}
	
	
	public void addToDeck(Card object) {
		this.cards.add(object);
	}
	
	
	public Card removeFirstCard() {
		return this.cards.remove(0);
	}

	
	public Card removeRandom() {
		
		Random randomNumber = new Random();
		
		int index = randomNumber.nextInt(this.cards.size());
		
		return this.cards.remove(index);
	}
	
	
	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}

	public void sortDeck() {
		
			Collections.sort(cards);
	}
	
}
