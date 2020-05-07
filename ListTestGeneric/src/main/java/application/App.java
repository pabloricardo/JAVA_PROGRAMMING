package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> listInt = Arrays.asList(1,3,5,7,9);
        List<Double> listDoub = Arrays.asList(1.6, 2.7, 3.9);
        List<Object> listGeneric = new ArrayList<>();
        
        copy(listInt, listGeneric);
        printList(listGeneric);
        copy(listDoub, listGeneric);
        printList(listGeneric);
        
    }
    
    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
    	for (Number obj : source) {
			destiny.add(obj);
		}
    }
    
    public static void printList(List<?> list) {
    	for (Object object : list) {
			System.out.print(object + " ");
		}
    	System.out.println();
    }
    
}
