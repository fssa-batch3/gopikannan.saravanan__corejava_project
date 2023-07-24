package day03.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;
import day03.practice.Employee;

class TestEmployee {

    @Test
    void Test1() {
        Employee e1 = new Employee(1, "naresh");
        assertEquals(1, e1.getId());
        assertEquals("naresh", e1.getName());
    }

    @Test
    void Test2() {
        Employee e2 = new Employee(2, "suresh");
        assertNotEquals(1, e2.getId());
        assertNotEquals("naresh", e2.getName());
    }
}
