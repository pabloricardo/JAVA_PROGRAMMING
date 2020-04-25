package application;

import entities.Product;
import model.services.ProductService;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        list.add(new Product("Monitor", 200.00));

        double sum = ProductService.filteredSum(list,  product -> product.getNome().charAt(0) == 'M');

        System.out.println(sum);

    }
}
