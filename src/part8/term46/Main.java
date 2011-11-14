package part8.term46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Main {
	
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
		
		for (Iterator<Suit> i = suits.iterator(); i.hasNext();)
			for (Iterator<Rank> j = ranks.iterator(); j.hasNext();)
				deck.add(new Card(i.next(), j.next()));
		
		for (Iterator<Card> i = deck.iterator(); i.hasNext();)
			System.out.println(i.next().toString());
	}

}
