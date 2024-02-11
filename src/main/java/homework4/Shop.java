package homework4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private static List<Buyer> buyerList = new ArrayList<>();
    private static List<Order> orderList = new ArrayList<>();
    private static List<Product> productList = new ArrayList<>();

    public static Order makePurchase(String buyerName, String productName, int quantity) {
        Buyer buyer1 = buyerList.stream()
                .filter(e -> e.getName().equals(buyerName))
                .findFirst()
                .orElse(null);
        Product product1 = productList.stream()
                .filter(e -> e.getNameOfProduct()
                        .equals(productName))
                .findFirst()
                .orElse(null);

        if (buyer1 == null) {
            try {
                throw new ErrorPurchaseException("Buyer " + buyerName + " does not exist");
            } catch (ErrorPurchaseException e) {
                throw new RuntimeException(e);
            }
        }
        if (product1 == null) {
            try {
                throw new ErrorPurchaseException("Product " + productName + " does not exist");
            } catch (ErrorPurchaseException e) {
                throw new RuntimeException(e);
            }
        }
        if (quantity < 1) {
            try {
                throw new ErrorPurchaseException("Number of product must be greater then 0");
            } catch (ErrorPurchaseException e) {
                throw new RuntimeException(e);
            }
        }

        Order order = new Order(buyer1, product1, quantity);
        orderList.add(order);

        return order;
    }

    public static List<Buyer> getBuyerList() {
        return buyerList;
    }

    public static void setBuyerList(List<Buyer> buyerList) {
        Shop.buyerList = buyerList;
    }

    public static List<Order> getOrderList() {
        return orderList;
    }

    public static void setOrderList(List<Order> orderList) {
        Shop.orderList = orderList;
    }

    public static List<Product> getProductList() {
        return productList;
    }

    public static void setProductList(List<Product> productList) {
        Shop.productList = productList;
    }
}



