package day03.practice;

public class Employee {
	public int id;
	public String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Employee(String name) {

		this.name=name;
	}
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "naresh");
		Employee e2 = new Employee(2, "suresh");
		Employee e3 = new Employee("gopikannan");
		System.out.println("id = " + e1.id + "," + "name = " + e1.name);
		System.out.println("id = " + e2.id + "," + "name = " + e2.name);
		System.out.println("id = " + e3.id + "," + "name = " + e3.name);
	}

}
