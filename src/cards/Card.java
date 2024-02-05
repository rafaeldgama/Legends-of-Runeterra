package cards;

public abstract class Card {

	private String name;
	private Integer manaCost;
	protected Arena arena;
	
	public Card(String name, int manaCost) {
		this.name = name;
		this.manaCost = manaCost;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getManaCost() {
		return manaCost;
	}
	
	public void invokeCard(Arena a) {
		arena = a;
	}
	
	@Override
	public String toString() {
		return name + " Mana Cost: " + String.format("%d points ", manaCost);
	}
	
}
