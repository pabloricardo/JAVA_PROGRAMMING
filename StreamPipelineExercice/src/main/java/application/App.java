package application;


import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class App
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        String dir = System.getProperty("user.dir");
        String fileName = "in.txt";
        File path = new File(dir, fileName);
        List<Product> listProducts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                listProducts.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            double avg = listProducts.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y)/listProducts.size();
            System.out.println(String.format("Average is: %.2f", avg));

            Comparator<String> comp = (p1, p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());

            List<String> names = listProducts.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getNome())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            System.out.println("Products less than avg is: ");
            names.forEach(System.out::println);

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
