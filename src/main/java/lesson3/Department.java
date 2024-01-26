package lesson3;

import java.util.Objects;

public class Department {

    private String name;
    private int countOfEmployeesOfDepartment;

    public Department(String name, int countOfEmployeesOfDepartment) {
        this.name = name;
        this.countOfEmployeesOfDepartment = countOfEmployeesOfDepartment;
    }

    public String getName() {
        return name;
    }

    public int getCountOfEmployeesOfDepartment() {
        return countOfEmployeesOfDepartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return countOfEmployeesOfDepartment == that.countOfEmployeesOfDepartment && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countOfEmployeesOfDepartment);
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", countOfEmployeesOfDepartment=" + countOfEmployeesOfDepartment +
                '}';
    }
}
