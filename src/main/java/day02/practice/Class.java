package day02.practice;

public class Class {
	
	private int id;
	private String name;
	private String password;
	private String email;
	
	public int getId() {
		
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getname() {
		
		return name;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	
	public String getpassword() {
		
		return password;
	}
	
	public void setpassword(String password) {
		this.password=password;
	}
	
	public String getEmail() {
		
		return email;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public static void main(String []args) {
		
		Class student = new Class();
		student.setId(20);
		student.setname("GopiKannan");
		student.setpassword("Chocolate@2002");
		student.setEmail("gopikannan2906@gmail.com");
		
		System.out.println("Student 1 id : " + student.getId());
		System.out.println("Student 1 name : " + student.getname());
		System.out.println("Student 1 password : " + student.getpassword());
		System.out.println("Student 1 Email : " + student.getEmail());		
		
		
		
	}
	
	
	
	
	
	
	

}
