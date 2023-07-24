package day10.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import day10.practice.EmailValidator;
import day10.practice.InvalidEmailException;

public class EmailValidatorTest {

	@Test
	void test1() {
		EmailValidator mail = new EmailValidator();

		String email = "gopikannan2906@gmail.com";

		try {
			assertTrue(mail.isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}

	@Test
	void test2() {
		EmailValidator mail = new EmailValidator();

		String email = "gopikannangmail.com";

		try {
			assertFalse(mail.isValidEmail(email));
		} catch (InvalidEmailException e) {
			e.printStackTrace();
		}
	}
}
