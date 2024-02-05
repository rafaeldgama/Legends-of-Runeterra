package cards;

import users.Player;

public class DemaciaDeck extends Deck {

	public DemaciaDeck(Player p, Arena a) {
		player = p;
		arena = a;
		addCard(new Garen());
		addCard(new Judgement());
		addCard(new RedoubledValor());
		addCard(new RadiantStrike());
		addCard(new SingleCombat());
	}
	
	
}
