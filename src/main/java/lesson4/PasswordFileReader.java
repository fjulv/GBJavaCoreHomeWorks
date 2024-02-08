package lesson4;

import java.io.*;
import java.time.LocalDate;
import java.util.Calendar;

public class PasswordFileReader {

    static boolean checkInputData(String file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
            while (reader.ready()) {
                String line = reader.readLine();

                String[] strings = line.split(" ");
                if (strings[0].length() > 20)
                    throw new WrongLoginException("Incorrect login, must be less then 20 characters");
                if (strings[1].length() > 20)
                    throw new WrongPasswordException("Incorrect password, must be less then 20 characters");
                if (!(strings[1].equals(strings[2])))
                    throw new WrongPasswordException("Password mismatch");
            }
        } catch (IOException | WrongLoginException | WrongPasswordException e) {
            logging(e.getMessage());
            return false;
        }
        logging("Login is successful");
        return true;
    }

    public static void logging(String message) {
        try (FileWriter fw = new FileWriter("fileLogging", true)) {
            fw.write(LocalDate.now() + " " + message);
            fw.write("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}













