package application;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<String> list01 = Arrays.asList("Maria", "Joãozinho", "Ana", "Beto");
        List<Integer> list02 = Arrays.asList(11, 31, 13, 22, 32, 53, 44);
        List<String> list03 = new ArrayList<>();
        list03.add("Bola");
        list03.add("Futebol");
        list03.add("Gol");

        printList(list01);
        printList(list02);
        printList(list03);

    }

    public static void printList(List<?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
