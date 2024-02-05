package cards;

import enums.Trait;

public abstract class Follower extends Card {
	
	protected Integer attackPower;
	protected Integer healthPoints;
	protected Integer baseAttackPower;
	protected Integer baseHealthPoints;
	protected Integer amountOfAttacks;
	protected Trait trait;
	
	public Follower(String name, int manaCost, int power, int hp, Trait trait) {
		super(name, manaCost);
		attackPower = power;
		baseAttackPower = power;
		healthPoints = hp;
		baseHealthPoints = hp;
		this.trait = trait;
	}
	
	public void Attack(Arena a, Follower c) {
		c.healthPoints -= attackPower;
		healthPoints -= c.attackPower;
		/* se hp < 0 de qualquer uma das cartas, chama método da arena para remover as cartas */
	}
	
	protected abstract void applyEffect();

	@Override
	public String toString() {
		return getName() + " Card Type: Follower	Mana Cost: " + String.format("%d points %n", getManaCost())
		+ String.format("Power: %d HP: %d", attackPower, healthPoints);
	}
	
}
