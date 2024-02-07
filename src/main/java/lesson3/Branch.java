package lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Branch extends Company {

    private Company company;
    private List<Employee> listOfBranchEmployees;

    public Branch(String branchName, int empCount, Company company) {
        listOfBranchEmployees = new ArrayList<Employee>();
        this.company = company;
        setName(branchName);
        setEmployeesCount(empCount);

    }

    public Company getCompany() {
        return company;
    }


    public List<Employee> getListOfBranchEmployees() {
        return listOfBranchEmployees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Branch branch = (Branch) o;
        return Objects.equals(company, branch.company) && Objects.equals(listOfBranchEmployees, branch.listOfBranchEmployees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), company, listOfBranchEmployees);
    }

    @Override
    public String toString() {
        return "Branch{" +
                "company=" + company +
                ", listOfBranchEmployees=" + listOfBranchEmployees +
                '}';
    }
}

