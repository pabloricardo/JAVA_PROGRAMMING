package application;

import entities.LogEntry;

import javax.xml.xpath.XPath;
import java.io.*;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");
        String arquivo = "in.txt";
        File path = new File(dir, arquivo);

        Set<LogEntry> logs = new HashSet<>();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                logs.add(new LogEntry(fields[0], Date.from(Instant.parse(fields[1]))));
                line = br.readLine();
            }
            System.out.println("Total de usuários: " + logs.size());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException("Arquivo não encontrado");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
