package testDataObjects.gameCharacter;

import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Armor")
public class Armor {
	private String name;
	private int defense;
	
	public Armor() {
		
	}
	
	public Armor(String name, int defense) {
		this.setName(name);
		this.setDefense(defense);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}
}
