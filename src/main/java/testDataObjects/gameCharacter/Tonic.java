package testDataObjects.gameCharacter;

import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Tonic")
public class Tonic extends Item {
	
	public int revivalPercent = 50;
	
	public Tonic() {
	}
	
	public Tonic(String name, int amount, int revivalPercent) {
		super(name, amount);
		this.revivalPercent = revivalPercent;
	}
}
