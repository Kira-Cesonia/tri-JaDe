package testDataObjects.city.persons;

public class Teacher extends Person {
	String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String subject, String name) {
		super(name);
		this.subject = subject;
	}
}
