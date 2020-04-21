package application;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("TV", 900.00));
        listProducts.add(new Product("Notebook", 1200.00));
        listProducts.add(new Product("Tablet", 400.00));

        //Example using created class comparator
        listProducts.sort(new MyComparator());

        for (Product product : listProducts) {
            System.out.println(product);
        }
    }
}
