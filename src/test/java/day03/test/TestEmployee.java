package day03.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

import day03.practice.Employee;
import day03.practice.User_class;

class TestEmployee {
	@Test
	void Test1() {

		Employee e1 = new Employee(1, "naresh");

		assertEquals(1, e1.id);
		assertEquals("naresh", e1.name);
		
		
	}
	@Test
	void Test2() {

		Employee e2 = new Employee(2, "suresh");

		assertNotEquals(1, e2.id);
		assertNotEquals("naresh", e2.name);
		
		
	}


}
