import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Product> productList = new ArrayList<>();

        System.out.println("Hi my friend, complete the shopping list");
        System.out.println("");


        while (true){
            System.out.println("1. Add a product?");
            System.out.println("2. Calculate the amount all products?");
            System.out.println("3. Exit");
            int command = scanner.nextInt();

            switch (command) {
                case 1: addToList(productList);
                break;

                case 2:
                    System.out.println("Amount all products: "+sumList(productList));
                break;

                case 3:
                    return;
            }
        }
    }

    private static void addToList(List<Product> productList){
        Scanner scanProduct = new Scanner(System.in);

        System.out.println("Enter name product");
        String nameProduct = scanProduct.next();

        System.out.println("Enter price product (int)");
        int priceProduct = scanProduct.nextInt();

        System.out.println("Enter quantity product (int)");
        int quantityProduct = scanProduct.nextInt();

        Product prod = new Product(nameProduct, priceProduct, quantityProduct);

        productList.add(prod);
    }

    private static int sumList(List<Product> productList){
        int sum = 0;

        for (Product productItem:productList) {
            sum += productItem.getSum();
        }

        return sum;
    }

}
