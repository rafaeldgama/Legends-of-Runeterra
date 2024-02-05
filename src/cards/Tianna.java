package cards;

public class Tianna extends Follower {
	
	public Tianna() {
		super("Tianna Crownguard", 8, 7, 7, null);
	}
	
	@Override
	public void invokeCard(Arena a) {
		arena = a;
		
	}
	
	protected void applyEffect() {
		
	}

}
