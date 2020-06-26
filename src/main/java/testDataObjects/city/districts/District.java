package testDataObjects.city.districts;

import org.bson.codecs.pojo.annotations.BsonDiscriminator;

@BsonDiscriminator
public abstract class District {
	public String districtName;
	
	public District() {
		
	}
	
	public District(String districtName) {
		this.districtName = districtName;
	}
}
