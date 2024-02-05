package cards;

import enums.Trait;

public class Garen extends Champion {

	public Garen() {
		super("Garen", 5, 5, 5, null);
		amountOfAttacks = 0;
	}
	
	public void applyEffect() {
		healthPoints = baseHealthPoints;
	}
	
	@Override
	public void Attack(Arena a, Follower c) {
		amountOfAttacks++;
		levelUp();
		c.healthPoints -= attackPower;
		healthPoints -= c.attackPower;
		/* se hp < 0 de qualquer uma das cartas, chama método da arena para remover as cartas */
	}
	
	protected void levelUp() {
		if(amountOfAttacks == 2) {
			trait = Trait.ELUSIVE;
			attackPower++;
			healthPoints++;
			baseAttackPower++;
			baseHealthPoints++;
		}
	}
	
}
