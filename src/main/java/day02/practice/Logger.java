package day02.practice;

public class Logger {
	public String  debug (String msg) {
		System.out.println("DEBUG: " + msg);
		return msg;
	}
	public String info (String msg) {
		System.out.println("INFO: " + msg);
		return msg;
	}
	
	public String error (String msg) {
		System.out.println("ERROR: " + msg);
		return msg;
	}
	
	public int debug (int num) {
		System.out.println("DEBUG: " + num);
		return num;
		
	}
	public int info (int num) {
		System.out.println("INFO: " + num);
		return num;
	}
	
	public int error (int num) {
		System.out.println("ERROR: " + num);
		return num;
	}
	
	

}
