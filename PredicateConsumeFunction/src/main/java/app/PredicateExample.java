package app;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;

public class PredicateExample {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

        list.removeIf(new ProductPredicate());

        list.forEach(System.out::println);

    }


}
