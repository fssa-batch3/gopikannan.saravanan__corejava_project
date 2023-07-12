package day03.test;

import day03.practice.User_class;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class TestClass {
	@Test
	void Test1() {
		User_class student1 = new User_class("Gopikannan","gopikannan2902@gmail.com","Redvelvet2002");
		System.out.println("Student 1 Name : "+student1.name);
		System.out.println("Student 1 Email : "+student1.email);
		System.out.println("Student 1 Password : "+student1.password);
		
		assertEquals("Gopikannan",student1.name);
		assertEquals("gopikannan2902@gmail.com",student1.email);
		assertEquals("Redvelvet2002",student1.password);
		
		
	}
	
	@Test
	void Test2() {
		User_class student1 = new User_class("Arun","arun@gmail.com","June@2002");
		System.out.println("Student 1 Name : "+student1.name);
		System.out.println("Student 1 Email : "+student1.email);
		System.out.println("Student 1 Password : "+student1.password);
		
		assertNotEquals("Gopikannan",student1.name);
		assertNotEquals("gopikannan2902@gmail.com",student1.email);
		assertNotEquals("August@2002",student1.password);
		
		
	}
	
	

}
