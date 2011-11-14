package part8.term46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainCorrect {
	
	enum Suit { CLUB, DIAMOND, HEART, SPADE };
	enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING};

	
	
	/**
	 * 従来のFor文で間違えてしまう例
	 * @param args
	 */
	public static void main(String[] args) {
		
		Collection<Suit> suits = Arrays.asList(Suit.values());
		Collection<Rank> ranks = Arrays.asList(Rank.values());
		
		class Card {
			private Suit suit;
			private Rank rank;
			public Card(Suit suit,Rank rank) {
				this.suit = suit;
				this.rank = rank;
			}
			
			public String toString() {
				return suit.toString() + ":" + rank.toString();
			}
		}
		
		List<Card> deck = new ArrayList<Card>();
		
		for (Suit suit : suits)
			for (Rank rank : ranks)
				deck.add(new Card(suit, rank));
		
		for (Card card : deck)
			System.out.println(card.toString());
	}

}
