package application;

import java.io.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String path = "C:\\Users\\pablo\\source\\repos\\JAVA_PROGRAMMING\\ReadFile\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
