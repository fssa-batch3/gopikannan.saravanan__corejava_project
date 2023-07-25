package day10.test;

import day10.practice.*;
import org.junit.jupiter.api.Test;

public class Regitration {

	@Test

	void Register(User[] arr) {
		RegisterUser registerUser = new RegisterUser();

		User user1 = new User(1, "gopi", "gopi@gmail.com");
		User user2 = new User(2, "kannan", "kannan@gmail.com");
		User user3 = new User(3, "soffan", "soffan@gmail.com");

		try {
			registerUser.register(user1);
			registerUser.register(user2);
			registerUser.register(user3);

			for (User user : arr) {

				System.out.println("Id:" + user.getId() + " Name:" + user.getName() + " Email Id:" + user.getEmailId());

			}

		} catch (UserAlreadyException e) {
			e.printStackTrace();
		}
	}

}