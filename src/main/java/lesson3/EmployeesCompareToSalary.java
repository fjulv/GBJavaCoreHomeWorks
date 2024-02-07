package lesson3;

public class EmployeesCompareToSalary {

    public int compareToSalary(Employee emp1, Employee emp2) {
        if (emp1.getSalary() == emp2.getSalary()) {
            System.out.println("Зарплаты сотрудников равны");
            return 0;
        } else if (emp1.getSalary() > emp2.getSalary()) {
            System.out.println("Зарплата сотрудника " + emp1.getFullName() + " больше зарплаты сотрудника " + emp2.getFullName());
            return 1;
        } else {
            System.out.println("Зарплата сотрудника " + emp1.getFullName() + " меньше зарплаты сотрудника " + emp2.getFullName());
            return -1;
        }
    }
}

