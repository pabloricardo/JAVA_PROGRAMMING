package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Integer> list = Arrays.asList(3,4,5,10,7);
        Stream<Integer> listStream = list.stream();
        System.out.println(Arrays.toString(listStream.toArray()));

        Stream<Integer> str1 = Stream.of(2,3,5,6,7).map(x -> x * 10);
        System.out.println(Arrays.toString(str1.toArray()));

        Stream<String> st2 = Stream.of("Bruna", "Pedro", "Carlos");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

    }
}
