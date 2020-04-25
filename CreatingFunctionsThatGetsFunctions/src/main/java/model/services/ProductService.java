package model.services;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public static double filteredSum(List<Product> products, Predicate<Product> criteria){
        double sum = 0;
        for (Product p : products) {
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
