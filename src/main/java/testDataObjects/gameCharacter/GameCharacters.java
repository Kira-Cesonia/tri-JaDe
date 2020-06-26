package testDataObjects.gameCharacter;

import java.util.ArrayList;
import java.util.List;

public class GameCharacters {
	
	public static GameCharacter sylvia() {
		
		String characterName = "Sylvia the Hero";
		
		String weaponName = "Gryphclaw";
		int attack = 255;
		Weapon weapon = new Weapon(weaponName, attack);
		
		String armorName = "Starscale Armor";
		int defense = 231;
		Armor armor = new Armor(armorName, defense);
		
		String _id = "sylv01";
		
		List<Item> inventory = new ArrayList<Item>();
		Potion potion = new Potion("Hi-Potion", 3);
		inventory.add(potion);
		Ether ether = new Ether("Mega Ether", 5, 200);
		inventory.add(ether);
		
		GameCharacter sylvia = new GameCharacter(characterName, weapon, armor, _id, inventory);
		return sylvia;
	}
	
	public static GameCharacter sylviaEdited() {
		
		String characterName = "Sylvia Zerin";
		
		String weaponName = "Luberjack's Axe";
		int attack = 7;
		Weapon weapon = new Weapon(weaponName, attack);
		
		String armorName = "Crude Mazoiscale Armor";
		int defense = 13;
		Armor armor = new Armor(armorName, defense);
		
		String _id = "sylv01";
		
		List<Item> inventory = new ArrayList<Item>();
		Potion potion = new Potion("Hi-Potion", 2);
		inventory.add(potion);
		Tonic tonic = new Tonic("Full Tonic", 2, 100);
		inventory.add(tonic);
		
		GameCharacter sylvia = new GameCharacter(characterName, weapon, armor, _id, inventory);
		return sylvia;
	}
	
	public static GameCharacter bokay() {
		
		String characterName = "Bokay Zerin";
		
		String weaponName = "Self-Made Bow";
		int attack = 5;
		Weapon weapon = new Weapon(weaponName, attack);
		
		String armorName = "Handcrafted Leather Armor";
		int defense = 10;
		Armor armor = new Armor(armorName, defense);
		
		String _id = "bokay01";
		
		List<Item> inventory = new ArrayList<Item>();
		Potion potion = new Potion("Potion", 2);
		inventory.add(potion);
		Ether ether = new Ether("Hi-Ether", 1, 50);
		inventory.add(ether);
		
		GameCharacter sylvia = new GameCharacter(characterName, weapon, armor, _id, inventory);
		return sylvia;
	}
	
	public static GameCharacter cyrus() {
		
		String characterName = "Cyrus Kyerafa";
		
		String weaponName = "Iron Bardiche";
		int attack = 25;
		Weapon weapon = new Weapon(weaponName, attack);
		
		String armorName = "Tattered Thyla Leather Armor";
		int defense = 21;
		Armor armor = new Armor(armorName, defense);
		
		String _id = "cyrus01";
		
		List<Item> inventory = new ArrayList<Item>();
		Potion potion = new Potion("X-Potion", 4);
		inventory.add(potion);
		Ether ether = new Ether("Ether", 2, 15);
		inventory.add(ether);
		
		GameCharacter sylvia = new GameCharacter(characterName, weapon, armor, _id, inventory);
		return sylvia;
	}
}
