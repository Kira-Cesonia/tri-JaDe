package testDataObjects.city.persons;

public class PlaceOwner extends Person {
	int placesOwnedCount;
	
	public PlaceOwner() {
		
	}
	
	public PlaceOwner(int placesOwnedCount, String name) {
		super(name);
		this.placesOwnedCount = placesOwnedCount;
	}
}
