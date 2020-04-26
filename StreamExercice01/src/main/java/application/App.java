package application;

import com.sun.javafx.binding.StringFormatter;
import entities.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException {
        String file = System.getProperty("user.dir")+"\\in.txt";
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(file))) {
            String line = bf.readLine();
            while (line != null){
                String[] fields = line.split(",");
                products.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = bf.readLine();
            }

            double avg = products.stream().map(Product::getPrice).reduce(0.0, (x, y) -> x+y)/products.size();
            System.out.println("Average price: " + String.format("%.2f",avg));

            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            List<String> names = products.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            /*List<String> names2 = products.stream()
                    .map(p -> p.getNome())
                    .filter(p -> p.equals("Tv"))
                    .collect(Collectors.toList());
             */

            names.forEach(System.out::println);
            //names2.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
