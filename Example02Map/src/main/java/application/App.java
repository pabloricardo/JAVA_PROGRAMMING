package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        String dir = System.getProperty("user.dir");
        String path = dir+"\\in.txt";
        Map<String, Integer> votes = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                int countVotes = Integer.parseInt(fields[1]);
                if (votes.containsKey(name)) {
                    int totalVotes = countVotes + votes.get(name);
                    votes.put(name, totalVotes);
                } else {
                    votes.put(name, countVotes);
                }
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Total Votes: ");
        for (String candidates : votes.keySet())
        {
            System.out.println(candidates + " = " + votes.get(candidates));
        }

    }
}
