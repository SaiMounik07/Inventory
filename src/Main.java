import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> listOfProducts = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("1. add product");
            System.out.println("2. remove product");
            System.out.println("3. update product");
            System.out.println("4. search product");
            System.out.println("5. list products");
            System.out.println("6. exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("product name: ");
                    String name = scanner.next();
                    System.out.println("product price: ");
                    int price = scanner.nextInt();
                    System.out.println("product description: ");
                    String description = scanner.next();
                    System.out.println("product quantity: ");
                    int quantity = scanner.nextInt();
                    add(name,price,description,quantity);
                    break;

                case 5:
                    printList();
                    break;
                case 6:
                    return;
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        }

    }


    private static void printList() {
        for (Product product : listOfProducts) {
            System.out.println(product.getProductId());
            System.out.println(product.getProductName());
            System.out.println(product.getProductPrice());
            System.out.println(product.getProductDescription());
            System.out.println(product.getProductQuantity());
        }
    }

    public static void add(String name, int price, String description, int quantity) {
        Product product=new Product();
        product.setProductName(name);
        product.setProductPrice(price);
        product.setProductDescription(description);
        product.setProductQuantity(quantity);
        product.setProductId(listOfProducts.size()+1);
        listOfProducts.add(product);
    }
    public static void remove() {

    }
    public static void update() {

    }
}