package day05.practice.packagetwo;



public class Details {
    public static void main(String[] args) {
        Department department = new Department("Computer Science", 143);
        Student student = new Student("Gopikannan", 76, department);
        System.out.println(student.toString());
    }
}
