package testDataObjects.city;

import java.util.List;

import testDataObjects.city.districts.District;

public class City {
	public List<District> districts;
	public String name;
	public String _id;
	
	public City() {
		
	}
	
	public City(List<District> districts, String name, String _id) {
		this.districts = districts;
		this.name = name;
		this._id = _id;
	}
}
