package lesson3;

import java.util.List;
import java.util.Objects;

public class Branch extends Company{

    private Company company;
    private String nameOfBranch;
    private Employee headOfBranch;

    private List<Employee> listOfBranchEmployees;

    public Branch(String name, String address, int employeesCount, List<Department> listOfDepartments, Employee head, Company company, String nameOfBranch, Employee headOfBranch) {
        super(name, address, employeesCount, listOfDepartments, head);
        this.company = company;
        this.nameOfBranch = nameOfBranch;
        this.headOfBranch = headOfBranch;
    }

    public Company getCompany() {
        return company;
    }

    public String getNameOfBranch() {
        return nameOfBranch;
    }

    public Employee getHeadOfBranch() {
        return headOfBranch;
    }

    public List<Employee> getListOfBranchEmployees() {
        return listOfBranchEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Branch branch = (Branch) o;
        return Objects.equals(company, branch.company) && Objects.equals(nameOfBranch, branch.nameOfBranch) && Objects.equals(headOfBranch, branch.headOfBranch) && Objects.equals(listOfBranchEmployees, branch.listOfBranchEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, nameOfBranch, headOfBranch, listOfBranchEmployees);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "company=" + company +
                ", nameOfBranch='" + nameOfBranch + '\'' +
                ", headOfBranch=" + headOfBranch +
                ", listOfBranchEmployees=" + listOfBranchEmployees +
                '}';
    }
}
