package cardgame;

import java.util.Scanner;

public class CardGameDemo {

	public static void main(String[] args) {
		
		
		//CardGameDemo.handOut();
		CardGameDemo.handOutBlackJack();
		
	}
	
	
	private static void handOutBlackJack() {

		Deck deckBlackJack = new Deck();
		
		deckBlackJack.shuffleDeck();
		
		Hand player1 = new Hand(2);
		
			player1.addToDeck(deckBlackJack.removeRandom());
			player1.addToDeck(deckBlackJack.removeRandom());
		
		
			System.out.println("Player holds the cards: ");
			player1.printDeck();
			
			
		Integer sum = player1.getCards().get(0).toInt() + player1.getCards().get(1).toInt();
		int index = 2;
		boolean isGameOver = false;
		
		Scanner keyboard = new Scanner(System.in);
		char hit = ' ';
					while(!isGameOver) {
			
					
								if(sum < 21) {
									
										System.out.println("Do you want to hit? ");
										System.out.println("1-Hit ");
										hit = keyboard.next().charAt(0);
										
										
											if(hit == '1') {	
												Card temp = deckBlackJack.removeRandom();
												player1.addToDeck(temp);
												System.out.println("Player gets card from deck: " + temp);
												sum += player1.getCards().get(index).toInt();
												index++;
											}
										
										
								}
								else if(sum == 21) {
										System.out.println("Congrats. You have blackjack");
										isGameOver = true;
								}
								else {
										System.out.println("You are out of game.");
										isGameOver = true;
								}
						
								

					}
					
					keyboard.close();
		
	}


	public static void handOut() {
		
		
		Deck deck1 = new Deck();
		
		deck1.printDeck();
		deck1.shuffleDeck();
		deck1.printDeck();
		deck1.sortDeck();
		deck1.printDeck();
		
		
		Hand hand1 = new Hand(5);
		Hand hand2 = new Hand(5);
		
		hand1.addToDeck(deck1.removeRandom());
		hand1.addToDeck(deck1.removeRandom());
		hand1.addToDeck(deck1.removeRandom());
		hand1.addToDeck(deck1.removeRandom());
		hand1.addToDeck(deck1.removeRandom());

		
		hand2.addToDeck(deck1.removeRandom());
		hand2.addToDeck(deck1.removeRandom());
		hand2.addToDeck(deck1.removeRandom());
		hand2.addToDeck(deck1.removeRandom());
		hand2.addToDeck(deck1.removeRandom());
		
		System.out.println();
		
		hand1.printDeck();
		
		hand2.printDeck();
		System.out.println();

		
		deck1.printDeck();
		
	}
	
}
