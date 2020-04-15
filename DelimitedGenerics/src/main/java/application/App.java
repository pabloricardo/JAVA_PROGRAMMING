package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<Integer> listInt = Arrays.asList(1,3,5,6);
        List<Double> listDb = Arrays.asList(1.3, 2.5, 6.4, 7.6);
        List<Object> listObj = new ArrayList<>();

        copy(listInt, listObj);
        copy(listDb, listObj);

        for (Object element: listObj) {
            System.out.print(element + " ");
        }
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number element : source) {
            destiny.add(element);
        }
    }

}
