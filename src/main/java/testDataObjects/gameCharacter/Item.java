package testDataObjects.gameCharacter;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;
import org.javers.core.metamodel.annotation.TypeName;

@TypeName("Item")
@BsonDiscriminator
public abstract class Item {
	private String name;
	private int amount;
	
	public Item() {
		
	}
	
	public Item(String name, int amount) {
		this.setName(name);
		this.setAmount(amount);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
}
