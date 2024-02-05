package cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import users.Player;

public abstract class Deck {
	
	protected Player player;
	protected Arena arena;
	protected List<Card> cards = new ArrayList<Card>();
/*	protected List<Champion> champions = new ArrayList<Champion>();
	protected List<Follower> followers = new ArrayList<Follower>();
	protected List<Spell> spells = new ArrayList<Spell>();
	protected List<Integer> indexList = new ArrayList<Integer>(); */
	private Integer deckSize = 0;

	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	private void increaseDeckSize() {
		deckSize++;
	}
	
	private void decreaseDeckSize() {
		deckSize--;
	}
	
	protected void addCard(Card c) {
		if(deckSize < 40) {
			cards.add(c);
			increaseDeckSize();
		}
		else {
			/* Throw exception */
		}
	}
	
	/*
	protected void addCard(Card c) {
		if(deckSize < 40) {
			if(c instanceof Champion) {
				Champion newCard = (Champion) c;
				champions.add(newCard);
			}
			else if(c instanceof Follower) {
				Follower newCard = (Follower) c;
				followers.add(newCard);
			}
			else if(c instanceof Spell) {
				Spell newCard = (Spell) c;
				spells.add(newCard);
			}
			else {
			}
			indexList.add(deckSize);
			increaseDeckSize();
		}
	}  */
	
	public Card drawCard() {
		decreaseDeckSize();
		return cards.remove(0);
	}
	
	


}
