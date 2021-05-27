package application;

import entities.Product;
import service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("Bola", 900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("Pen Drive", 80.90));

        ProductService ps = new ProductService();
        double sum = ps.filterSum(listProducts, p -> p.getPrice() < 100);

        System.out.println(String.format("%.2f", sum));


    }
}
