package homework4;

public class Main {

    public static void main(String[] args) {


        Buyer buyer1 = new Buyer("Elena", Gender.FEMALE);
        Buyer buyer2 = new Buyer("Mike", Gender.MALE);

        Shop.getBuyerList().add(buyer1);
        Shop.getBuyerList().add(buyer2);

        Product product1 = new Product("Teddy bear");
        Product product2 = new Product("Micky Mouse");

        Shop.getProductList().add(product1);
        Shop.getProductList().add(product2);


        Order order1 = Shop.makePurchase("Elena", "Teddy bear", 2);
        Order order2 = Shop.makePurchase("Mike", "Micky Mouse", 5);
//        Order order3 = Shop.makePurchase("Julia", "book", 5);

        OrdersFileWriter.writeToFile(Shop.getOrderList());
    }
}
