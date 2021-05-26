package application;

import entities.Product;
import util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class App
{
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("Bola", 900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("Pen Drive", 80.90));


        //listProducts.removeIf(new ProductPredicate());
        //listProducts.removeIf(Product::staticProductPredicate);
        //listProducts.removeIf(Product::nonStaticProductPredicate);

        /*Predicate<Product> predicateProduct = p -> p.getPrice() >= 100;
        listProducts.removeIf(predicateProduct);*/

        listProducts.removeIf(p -> p.getPrice() >= 100);



        for (Product p : listProducts) {
            System.out.println(p);
        }
    }



}
