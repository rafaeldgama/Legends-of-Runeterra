package cards;

public abstract class Spell extends Card{

	public Spell(String name, int manaCost) {
		super(name, manaCost);
	}
	
	public String toString() {
		return getName() + " Card Type: Spell	Mana Cost: " + String.format("%d points %n", getManaCost());
	}
	
}
