package cards;

import enums.Level;
import enums.Trait;

public abstract class Champion extends Follower {

	protected Level championLevel;
	
	public Champion(String name, int manaCost, int power, int hp, Trait trait) {
		super(name, manaCost, power, hp, trait);
		championLevel = Level.NORMAL;
	}
	
	protected abstract void levelUp();
	
	@Override
	public String toString() {
		return getName() + " Card Type: Champion	Mana Cost: " + String.format("%d points %n", getManaCost())
		+ String.format("Power: %d HP: %d", attackPower, healthPoints);
	}
	
}
