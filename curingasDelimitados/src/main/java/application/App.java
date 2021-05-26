package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {
        List<Integer> myInts = Arrays.asList(1,2,3,4);
        List<Double> myDoubles = Arrays.asList(5.13,7.35,3.1);
        List<Object> myObjects = new ArrayList<Object>();

        copy(myInts, myObjects);
        printList(myObjects);
        copy(myDoubles,myObjects);
        printList(myObjects);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny){
        for (Number item : source) {
            destiny.add(item);
        }
    }

    public static void printList(List<?> list){
        if(list.isEmpty())
        {
            throw new IllegalArgumentException("Lista vazia");
        }else{
            System.out.print("[");
            System.out.print(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                System.out.print(", " + list.get(i));
            }
            System.out.print("]");
            System.out.println();
        }
    }
}
