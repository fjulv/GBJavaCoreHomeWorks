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
 */
public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Petr Petrov", "manager", "+79999999999", 30000, 35);
        Employee employee2 = new Employee("Ivan Ivanon", "director", "+19999999999", 100000, 59);
        Employee employee3 = new Employee("Sidor Sidorov", "manager", "+3729999999999", 40000, 26);
        Employee employee4 = new Employee("Katya Katina", "cashier", "+78888888888", 20000, 45);
        Employee employee5 = new Employee("Pola Polomoevna", "cleaner", "+78899994444", 10000, 68);

        Employee[] employees = new Employee[]{employee1, employee2, employee3, employee4, employee5};

        for (Employee employee : employees) {
            employee.averageAge(employees);
        }

        for (Employee employee : employees) {
            employee.averageSalary(employees);
        }

        Employee.staticIncreaseSalaryWithConditions(employees, 36, 10000);

        for (Employee employee : employees) {
            employee.averageSalary(employees);
        }
    }
}
