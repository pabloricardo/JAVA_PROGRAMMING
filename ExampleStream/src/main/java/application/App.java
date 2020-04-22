package application;

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
        Stream<Integer> str = Stream.of(2,3,5,6,7);

        System.out.println(Arrays.toString(str.toArray()));

    }
}
