package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good Morning", "Good Evening!", "Good Night!"};
        String path = "C:\\Users\\pablo\\source\\repos\\JAVA_PROGRAMMING\\WriterFile\\WriterFile\\out.txt";


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String l : lines) {
                bw.write(l);
                bw.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
