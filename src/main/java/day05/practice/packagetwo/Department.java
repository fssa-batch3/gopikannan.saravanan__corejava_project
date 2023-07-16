package day05.practice.packagetwo;

class Department {
    String deptName;
    int deptId;
    public Department(String deptName, int deptId) {
        this.deptName = deptName;
        this.deptId = deptId;
    }
    @Override
    public String toString() {
        return "Department: " + deptName + ", ID: " + deptId;
    }
}