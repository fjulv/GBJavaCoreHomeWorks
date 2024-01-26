package lesson3;

import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private String address;
    private int EmployeesCount;
    private List<Department> listOfDepartments;
    private Employee head;


    public Company(String name, String address, int employeesCount, List<Department> listOfDepartments, Employee head) {
        this.name = name;
        this.address = address;
        EmployeesCount = employeesCount;
        this.listOfDepartments = listOfDepartments;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getEmployeesCount() {
        return EmployeesCount;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public Employee getHead() {
        return head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return EmployeesCount == company.EmployeesCount && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(listOfDepartments, company.listOfDepartments) && Objects.equals(head, company.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, EmployeesCount, listOfDepartments, head);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", EmployeesCount=" + EmployeesCount +
                ", listOfDepartments=" + listOfDepartments +
                ", head=" + head +
                '}';
    }
}
