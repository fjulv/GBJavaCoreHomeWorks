package lesson3;

public class Employee {
    private String fullName;
    private String jobTitle;
    private String phoneNumber;
    private int salary;
    private int age;
    private Department departmentOfWork;

    public Employee(String fullName, String jobTitle, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.jobTitle = jobTitle;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Department getDepartmentOfWork() {
        return departmentOfWork;
    }

    public void setDepartmentOfWork(Department departmentOfWork) {
        this.departmentOfWork = departmentOfWork;
    }

    public void increaseSalaryAfter45(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee.getAge() > 45) {
                employee.setSalary(employee.getSalary() + 5000);
            }
        }
    }

    public void increaseSalaryWithConditions(Employee[] employees, int age, int increaseSalary) {
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                employee.setSalary(employee.getSalary() + increaseSalary);
            }
        }
    }

    public static void staticIncreaseSalaryWithConditions(Employee[] employees, int age, int increaseSalary) {
        for (Employee employee : employees) {
            if (employee.getAge() >= age) {
                employee.setSalary(employee.getSalary() + increaseSalary);
            }
        }
    }

    public void averageAge(Employee[] employees) {
        double ageOfAll = 0;
        for (Employee employee : employees) {
            ageOfAll += employee.getAge();
        }
        System.out.println(ageOfAll / employees.length);
    }

    public void averageSalary(Employee[] employees) {
        double salaryOfAll = 0;
        for (Employee employee : employees) {
            salaryOfAll += employee.getSalary();
        }
        System.out.println(salaryOfAll / employees.length);
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public void toStringWithFormat() {
        System.out.printf("Employee{ fullName= %s, jobTitle= %s, phoneNumber= %s, salary= %d, age= %d", fullName, jobTitle, phoneNumber, salary, age);
    }
}
