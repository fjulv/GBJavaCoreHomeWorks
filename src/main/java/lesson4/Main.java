package lesson4;
/*
Задача: Проверка логина и пароля
Создать статический метод который принимает на вход три параметра: login, password и confirmPassword.
Длина login должна быть меньше 20 символов. Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
Длина password должна быть меньше 20 символов. Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException.
WrongPasswordException и WrongLoginException - пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
В основном классе программы необходимо по-разному обработать исключения.
Метод возвращает true, если значения верны или false в другом случае.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println(PasswordFileReader.checkInputData("password"));
    }
}
