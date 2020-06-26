package testDataObjects.gameCharacter;

import java.util.List;

import org.javers.core.metamodel.annotation.Id;
import org.javers.core.metamodel.annotation.TypeName;

@TypeName("GameCharacter")
public class GameCharacter {
	@Id
	public String _id;
	public String name;
	public Weapon weapon;
	public Armor armor;
	public List<Item> inventory;
	
public GameCharacter() {
		
	}
	
	public GameCharacter(String name, Weapon weapon, Armor armor, String _id, List<Item> inventory) {
		this._id = _id;
		this.name = name;
		this.weapon = weapon;
		this.armor = armor;
		this.inventory = inventory;
	}
	
	public String toString() {
		String returnString = "";
		returnString += "ID: " + _id + " ";
		returnString += "Name: " + name+ " ";
		returnString += "Weapon: " + weapon.name
			+ " (" + weapon.attack + " attack) ";
		returnString += "Armor: " + armor.name
				+ " (" + armor.defense + " defense) ";
		return returnString;
	}
	
	public void copyValuesFrom(GameCharacter otherCharacter) {
		_id = otherCharacter._id;
		name = otherCharacter.name;
		weapon = otherCharacter.weapon;
		armor = otherCharacter.armor;
		inventory = otherCharacter.inventory;
	}
}
