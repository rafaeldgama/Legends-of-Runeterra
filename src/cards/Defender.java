package cards;

import enums.Trait;

public class Defender extends Follower {
	
	public Defender() {
		super("Defender", 2, 2, 2, Trait.FURY);
		baseHealthPoints++;
		healthPoints++;
	}
	
	protected void applyEffect() {
		
	}

}
