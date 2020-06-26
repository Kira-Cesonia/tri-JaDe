package testDataObjects.gameCharacter;

import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Ether")
public class Ether extends Item {
	
	private int mpRestoaration;
	
	public Ether() {
	}
	
	public Ether(String name, int amount, int mpRestoaration) {
		super(name, amount);
		this.setMpRestoaration(mpRestoaration);
	}

	public int getMpRestoaration() {
		return mpRestoaration;
	}

	public void setMpRestoaration(int mpRestoaration) {
		this.mpRestoaration = mpRestoaration;
	}
}
