package testDataObjects.city.districts.buildings;

import java.util.List;

import testDataObjects.city.persons.Teacher;

public class School extends ResidentialBuilding {
	public List<Teacher> teachers;
	
	public School() {
		
	}
	
	public School(List<Teacher> teachers, String name, int inhabitantCount) {
		super(name, inhabitantCount);
		this.teachers = teachers;
	}
}
