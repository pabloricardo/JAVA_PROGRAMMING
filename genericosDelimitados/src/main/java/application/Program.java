package application;

import entities.Product;
import services.CalculationService;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        String dir = System.getProperty("user.dir");
        String arquivo = "in.txt";
        File path = new File(dir, arquivo);
        //String path = String.format(dir+"\\%s",arquivo);

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }
            Product x = CalculationService.max(list);
            System.out.println("Max:");
            System.out.println(x);
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
