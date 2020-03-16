package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> l1 = new ArrayList<>();
        l1.add("Chocolate");
        l1.add("Pizza");
        l1.add("Cenoura");
        l1.add("Bolo");
        l1.add(1, "Refrigerante");
        l1.add("Salgado");
        l1.add("Pipoca");

        for (String element : l1) {
            System.out.println(element);
        }

        System.out.println("________________________________________________________");
        l1.removeIf(x -> x.charAt(0) == 'C');
        for (String element : l1) {
            System.out.println(element);
        }
        System.out.println("________________________________________________________");
        System.out.println("Index of Bolo: " + l1.indexOf("Bolo"));
        System.out.println("Index of Bolo: " + l1.indexOf("Ovo"));
        System.out.println("________________________________________________________");
        List<String> l2 = l1.stream().filter(l -> l.charAt(0) == 'P').collect(Collectors.toList());
        for (String l : l2) {
            System.out.println(l);
        }
        System.out.println("________________________________________________________");
        String name = l1.stream().filter(l -> l.charAt(0) == 'P').findFirst().orElse(null);
        String name2 = l1.stream().filter(l -> l.charAt(0) == 'W').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(name2);
    }
}