package application;

import entities.Client;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client c1 = new Client("Pedro", "pedro@gmail.com");
        Client c2 = new Client("Pedro", "bruna@gmail.com");
        Client c3 = new Client("Pedro", "pedro@gmail.com");


        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));

        System.out.println("__________");
        System.out.println("Equal compare content");
        System.out.println(c1.equals(c3));
        System.out.println("== compare memory reference");
        System.out.println(c1 == c3);

        System.out.println("__________");
        String s1 = "teste";
        String s2 = "teste";
        String s3 = new String("teste");
        String s4 = new String("teste");
        System.out.println("Literals have special treatment, so == returns true");
        System.out.println(s1 == s2);
        System.out.println("Objects don't have special treatment, so == returns false");
        System.out.println(s3 == s4);


    }
}
