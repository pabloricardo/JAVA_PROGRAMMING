package application;

import Util.PriceUpdate;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("Bola", 900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("Pen Drive", 80.90));

        //listProducts.forEach(new PriceUpdate());
        //listProducts.forEach(Product::staticProductConsumer);
        //listProducts.forEach(Product::nonStaticProductConsumer);

        /*Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.1);
        listProducts.forEach(cons);*/

        listProducts.forEach(p -> p.setPrice(p.getPrice() * 1.1));


        listProducts.forEach(System.out::println);


    }
}
