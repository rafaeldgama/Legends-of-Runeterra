package cards;

public class RedoubledValor extends Spell {
	
	public RedoubledValor() {
		super("Redoubled Valor", 6);
	}
	
	private void effect(Follower ally) {
		ally.healthPoints = ally.baseHealthPoints;
		ally.attackPower *= 2;
		ally.healthPoints *= 2;
	}
	
	public void applyEffect() {
		effect(null);
	}

}
