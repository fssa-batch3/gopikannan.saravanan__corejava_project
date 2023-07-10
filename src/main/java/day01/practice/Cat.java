package day01.practice;

public class Cat {
	// Attributes

	private String color;
	private int age;

		

	// Getters and setters
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void speak() {
		System.out.print("Meow!");
	}

	// Main method to create cat objects
	public static void main(String[] args) {
        // Create two cat objects
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        
        cat1.setColor("Orange");
        cat1.setAge(3);

       
        cat2.setColor("Black");
        cat2.setAge(5);


        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
	   System.out.print("Speaks: ");
	   cat1.speak();
	   
	   System.out.println();

        System.out.println("Cat 2:");
        System.out.println("Age: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
        System.out.print("Speaks: ");
 	   cat2.speak();
//	 System.out.println("Speaks: " + cat1.speak());
    }

}
