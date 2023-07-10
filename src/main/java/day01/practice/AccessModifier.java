package day01.practice;

public class AccessModifier {
	private  String a = "a";
	private static String b = "b";
	private static String c = "c";
	private static String d = "d";

	public static void main(String[] args) {
		AccessModifier num = new AccessModifier();

		System.out.println(num.a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
