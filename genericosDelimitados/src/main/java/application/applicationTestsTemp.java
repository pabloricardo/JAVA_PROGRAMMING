package application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationTestsTemp {
    public static void main(String[] args) {

        Integer num = 6;
        List<Integer> listInt = new ArrayList<>();
        listInt.add(5);
        listInt.add(6);
        listInt.add(7);

        for (Integer item: listInt) {
            System.out.println(num.compareTo(item));
        }
    }
}
