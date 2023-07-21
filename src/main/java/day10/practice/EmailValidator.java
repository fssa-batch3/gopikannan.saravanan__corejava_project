package day10.practice;

import java.util.regex.*;

class EmailValidator {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		Pattern pattern = Pattern.compile(emailRegex);
		Matcher matcher = pattern.matcher(emailId);

		if (matcher.matches()) {
			return true;
		}

		throw new InvalidEmailException("Invalid email format: " + emailId);
	}

	public static void main(String[] args) {
		String email1 = "gopikannan2906@gmail.com";
		

		try {
			boolean isValid1 = isValidEmail(email1);
			System.out.println(email1 + " is valid: " + isValid1);

			
		} catch (InvalidEmailException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
