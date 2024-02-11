package homework4;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OrdersFileWriter {

    public static void writeToFile(List<Order> orders) {
        try (FileWriter fw = new FileWriter("orders.txt", true)) {
            for (Order order : orders) {
                fw.write(order.toString());
                fw.write("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

