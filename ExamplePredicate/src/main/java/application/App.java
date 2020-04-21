package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Predicate with the Implemented interface
        //list.removeIf(new ProductPredicate());

        //Predicated with the static method
        //list.removeIf(Product::staticProductPredicate);

        double min = 100;
        //Inline lambda expression with variable
        list.removeIf(p -> p.getPrice() >= 100);

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
