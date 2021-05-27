package service;

import entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filterSum(List<Product> listProdut, Predicate<Product> condition){
        double sum = 0;
        for (Product p :  listProdut) {
            if(condition.test(p)){
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
