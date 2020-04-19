package application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        Map<String,String> map01 = new TreeMap<>();
        map01.put("Sobremesa","Chocolate");
        map01.put("Salada","Tomate");
        map01.put("Entrada","Pao Torrado");

        map01.remove("Entrada");

        map01.put("Bebida","Suco de laranja");

        for (String key : map01.keySet()){
            System.out.println("Key: " + key + " - Value: " + map01.get(key));
        }
        System.out.println("Size Map: " + map01.size());

    }
}
