package lesson3;

/*
1. Создать класс ”Сотрудник” с полями: ФИО, должность, телефон,
зарплата, возраст
2. Написать функцию выводящую всю доступную информацию об
объекте
3. Написать функцию выводящую всю доступную информацию об объекте с использованием форматирования
строк.
4.  Создать массив из 5 сотрудников
5. Создать метод, повышающий зарплату всем сотрудникам старше
45 лет на 5000. Метод должен принимать в качестве параметра массив
сотрудников.
6.Написать тот же метод, но возраст и размер повышения должны быть параметрами метода
7. Написать тот же метод в качестве статического в классе сотрудника
8. Написать методы (принимающие на вход массив сотрудников),
вычисляющие средний возраст и среднюю зарплату сотрудников, вывести
результаты работы в консоль.

ДЗ:

1. Написать компаратор - метод внутри класса сотрудника, сравнивающий сотрудников по произвольному параметру.
(Код пишется на основе задачек из презентации.)
2. Опишите класс руководителя, наследник от сотрудника.
Перенесите статический метод повышения зарплаты в класс руководителя, модифицируйте метод таким образом,
чтобы он мог поднять заработную плату всем, кроме руководителей (использовать instanceof).
В основной программе создайте руководителя и поместите его в общий массив сотрудников.
Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        Branch branch1 = new Branch("Branch1", 20, company);
        Branch branch2 = new Branch("Branch2", 5, company);

        company.setName("TomskCompany");


        Department department1 = new Department("Economic");
        Department department2 = new Department("Sales");
        Employee employee1 = new Employee("Petr Petrov", "manager", "+79999999999", 30000, 35);
        Employee employee2 = new Employee("Ivan Ivanon", "director", "+19999999999", 100000, 59);
        Employee employee3 = new Employee("Sidor Sidorov", "manager", "+3729999999999", 40000, 26);
        Employee employee4 = new Employee("Katya Katina", "cashier", "+78888888888", 20000, 45);
        Employee employee5 = new Employee("Pola Polomoevna", "cleaner", "+78899994444", 10000, 68);
        Employee head = new HeadOfCompany("Начальник всех начальников", "chief", "+19928457854", 1000000, 50);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5, head};

        branch1.addDepartment(department1);

        employee1.setDepartmentOfWork(department1);
        employee2.setDepartmentOfWork(department1);
        employee3.setDepartmentOfWork(department2);
        employee4.setDepartmentOfWork(department1);
        employee5.setDepartmentOfWork(department2);


        branch1.getListOfBranchEmployees().add(employee1);
        branch1.getListOfBranchEmployees().add(employee2);

        int countEmployeeOfDepartment = 0;
        for (Employee e : branch1.getListOfBranchEmployees()) {
            if (e.getDepartmentOfWork().equals(department1)) {
                countEmployeeOfDepartment++;
            }
        }
        System.out.println(countEmployeeOfDepartment);

        EmployeesCompareToSalary employeesCompareToSalary = new EmployeesCompareToSalary();
        employeesCompareToSalary.compareToSalary(employee1, employee4);

        HeadOfCompany.staticIncreaseSalaryWithConditions(employees, 20, 5000);

        for (Employee e : employees) {
            System.out.println(e.getFullName() + " " + e.getSalary());
        }
    }
}
