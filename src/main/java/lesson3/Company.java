package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private String name;
    private String address;
    private int employeesCount;
    private List<Department> listOfDepartments;
    private Employee head;


    public Company(String name, String address, int employeesCount, Employee head) {
        this.name = name;
        this.address = address;
        this.employeesCount = employeesCount;
        this.head = head;
        listOfDepartments = new ArrayList<Department>();
    }

    public Company() {
        listOfDepartments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        listOfDepartments.add(department);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Department> getListOfDepartments() {
        return listOfDepartments;
    }

    public Employee getHead() {
        return head;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHead(Employee head) {
        this.head = head;
    }

    public void setEmployeesCount(int employeesCount) {
        this.employeesCount = employeesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeesCount == company.employeesCount && Objects.equals(name, company.name) && Objects.equals(address, company.address) && Objects.equals(listOfDepartments, company.listOfDepartments) && Objects.equals(head, company.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, employeesCount, listOfDepartments, head);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", employeesCount=" + employeesCount +
                ", listOfDepartments=" + listOfDepartments +
                ", head=" + head +
                '}';
    }
}
