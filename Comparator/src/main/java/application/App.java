package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
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

        //Example using the created class comparator
        //listProducts.sort(new MyComparator());

        //Example using the anonymous class
        /*Comparator<Product> comp = new Comparator<Product>(){
            public int compare(Product p1, Product p2){
                return p1.getNome().toUpperCase().compareTo(p2.getNome());
            }
        };
        listProducts.sort(comp);*/

        //Comparator example using the expression lambda without keys
        /*Comparator<Product> comp = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
        listProducts.sort(comp);*/

        //Comprator usando a expressão lambda
        listProducts.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));

        for (Product product : listProducts) {
            System.out.println(product);
        }
    }
}
