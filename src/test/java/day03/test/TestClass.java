package day03.test;

import day03.practice.User_class;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

    @Test
    public void Test1() {
        User_class student1 = new User_class("Gopikannan", "gopikannan2902@gmail.com", "Redvelvet2002");
        System.out.println("Student 1 Name : " + student1.getName());
        System.out.println("Student 1 Email : " + student1.getEmail());
        System.out.println("Student 1 Password : " + student1.getPassword());

        assertEquals("Gopikannan", student1.getName());
        assertEquals("gopikannan2902@gmail.com", student1.getEmail());
        assertEquals("Redvelvet2002", student1.getPassword());
    }

    @Test
    public void Test2() {
        User_class student1 = new User_class("Arun", "arun@gmail.com", "June@2002");
        System.out.println("Student 1 Name : " + student1.getName());
        System.out.println("Student 1 Email : " + student1.getEmail());
        System.out.println("Student 1 Password : " + student1.getPassword());

        assertNotEquals("Gopikannan", student1.getName());
        assertNotEquals("gopikannan2902@gmail.com", student1.getEmail());
        assertNotEquals("August@2002", student1.getPassword());
    }
}
