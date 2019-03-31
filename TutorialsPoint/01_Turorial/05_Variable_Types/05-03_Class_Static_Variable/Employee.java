public class Employee {
    // Salary varaiable is a private static variable
    private static double salary;

    // DEPARTMEMT is a constant
    public static final String DEPARTMENT = "Development ";

    public static void main(String[] args) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}
