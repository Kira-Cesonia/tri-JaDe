package testDataObjects.gameCharacter;

import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Ether")
public class Ether extends Item {
	
	public int mpRestoaration;
	
	public Ether() {
	}
	
	public Ether(String name, int amount, int mpRestoaration) {
		super(name, amount);
		this.mpRestoaration = mpRestoaration;
	}
}
