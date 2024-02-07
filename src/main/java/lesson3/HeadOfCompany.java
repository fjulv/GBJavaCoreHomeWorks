package lesson3;

public class HeadOfCompany extends Employee {
    public HeadOfCompany(String fullName, String jobTitle, String phoneNumber, int salary, int age) {
        super(fullName, jobTitle, phoneNumber, salary, age);
    }


    public static void staticIncreaseSalaryWithConditions(Employee[] employees, int age, int increaseSalary) {
        for (Employee employee : employees) {
            if (employee.getAge() >= age && !(employee instanceof HeadOfCompany)) {
                employee.setSalary(employee.getSalary() + increaseSalary);
            }
        }
    }
}
