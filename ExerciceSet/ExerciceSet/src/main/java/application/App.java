package application;

import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class App 
{
    public static void main( String[] args )
    {

        String path = "C:\\Users\\pablo\\source\\repos\\JAVA_PROGRAMMING\\ExerciceSet\\ExerciceSet\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            Set<LogEntry> logs = new HashSet<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(" ");
                String userName = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));
                logs.add(new LogEntry(userName, moment));
                line = br.readLine();
            }
            System.out.println("Total users: " + logs.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
