package org.exception.example;

import org.exception.test.exception.TestException;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Divisão de um número por outro");
            System.out.println("Digite o primeiro número");
            int a = sc.nextInt();
            System.out.println("Digite o segundo número");
            int b = sc.nextInt();
            int c = divisaoDeDoisNumerosInteirosNaoNegativos(a, b);
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Não é possível dividir por zero");
            e.printStackTrace();
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch (TestException e){
            System.out.println(e.getMessage());
        }
    }

    private static int divisaoDeDoisNumerosInteirosNaoNegativos(int a, int b) {
        if(a < 0 || b < 0){
            throw new IllegalArgumentException("Foi informado número negativo");
        }
        if(a < b){
            throw new TestException("O Primeiro número informado deve ser maior ou igual ao segundo número informado");
        }
                return a/b;
    }
}
