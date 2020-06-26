package testDataObjects.gameCharacter;

import java.util.List;

import org.javers.core.metamodel.annotation.Id;
import org.javers.core.metamodel.annotation.TypeName;

@TypeName("GameCharacter")
public class GameCharacter {
	@Id
	private String _id;
	private String name;
	private Weapon weapon;
	private Armor armor;
	private List<Item> inventory;
	
	public GameCharacter() {
		
	}
	
	public GameCharacter(String name, Weapon weapon, Armor armor, String _id, List<Item> inventory) {
		this.set_id(_id);
		this.setName(name);
		this.setWeapon(weapon);
		this.setArmor(armor);
		this.setInventory(inventory);
	}
	
	public String toString() {
		String returnString = "";
		returnString += "ID: " + get_id() + " ";
		returnString += "Name: " + getName()+ " ";
		returnString += "Weapon: " + getWeapon().getName()
			+ " (" + getWeapon().getAttack() + " attack) ";
		returnString += "Armor: " + getArmor().getName()
				+ " (" + getArmor().getDefense() + " defense) ";
		return returnString;
	}
	
	public void copyValuesFrom(GameCharacter otherCharacter) {
		set_id(otherCharacter.get_id());
		setName(otherCharacter.getName());
		setWeapon(otherCharacter.getWeapon());
		setArmor(otherCharacter.getArmor());
		setInventory(otherCharacter.getInventory());
	}

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Armor getArmor() {
		return armor;
	}

	public void setArmor(Armor armor) {
		this.armor = armor;
	}

	public List<Item> getInventory() {
		return inventory;
	}

	public void setInventory(List<Item> inventory) {
		this.inventory = inventory;
	}
}
