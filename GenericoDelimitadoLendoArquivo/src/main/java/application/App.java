package application;

import entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static services.CalculationService.max;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String dir = System.getProperty("user.dir");
        File file = new File(dir, "/src/files/file.txt");

        List<Product> products = new ArrayList<>();

        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = br.readLine();
            String[] fields = new String[2];
            while (line != null){
                fields = line.split(",");
                products.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Product productMax = max(products);
        System.out.println(productMax);




    }
}
