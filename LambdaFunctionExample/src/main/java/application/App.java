package application;

import Util.UpperCaseName;
import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App
{
    public static void main(String[] args) {
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(new Product("Bola", 900.00));
        listProducts.add(new Product("Mouse", 50.00));
        listProducts.add(new Product("Tablet", 350.00));
        listProducts.add(new Product("Pen Drive", 80.90));

        //List<String> listNamesUpperCase = listProducts.stream().map(new UpperCaseName()).collect(Collectors.toList());
        List<String> listNamesUpperCase = listProducts.stream().map(p -> p.getNome().toUpperCase()).collect(Collectors.toList());

        listNamesUpperCase.forEach(System.out::println);

    }



}
