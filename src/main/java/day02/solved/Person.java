package day02.solved;

public class Person {
	private String name; 

	public String getName() { 
		return name;
	}

	public void setName(String name) { 
		
		this.name = name; // this Keyword used for referring current instance
	}

	public static void main(String[] args) {

// Usage
		Person person = new Person();
		person.setName("John"); // Setting the name using the setter method
		String name = person.getName(); // Accessing the name using the getter method
		System.out.println(name); // Output: John
	}

}
