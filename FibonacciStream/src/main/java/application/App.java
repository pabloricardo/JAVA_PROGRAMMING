package application;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Stream<Integer> str = Stream.iterate(new Integer[] {0 , 1}, x -> new Integer[] {x[1], x[1] + x[0]}).map(x -> x[0]);

        System.out.println(Arrays.toString(str.limit(10).toArray()));

    }
}
