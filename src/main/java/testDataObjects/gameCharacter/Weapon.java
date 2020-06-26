package testDataObjects.gameCharacter;

import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Weapon")
public class Weapon {
	private String name;
	private int attack;
	
	public Weapon() {
		
	}
	
	public Weapon(String name, int attack) {
		this.setName(name);
		this.setAttack(attack);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
}
