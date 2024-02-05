package cards;

public class RadiantStrike extends Spell {

	public RadiantStrike() {
		super("Radiant Strike", 1);
	}
	
	public void applyEffect(Follower ally) {
		ally.attackPower++;
		ally.healthPoints++;
	}
	
}
