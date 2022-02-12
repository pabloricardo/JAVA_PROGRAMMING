package org.example;

import org.Utils.PrintService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        PrintService<Integer> psInteger = new PrintService<>();
        PrintService<String> psString = new PrintService<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que deseja informar");
        int qtdValores = sc.nextInt();

        for (int i = 0; i < qtdValores; i++) {
            psInteger.addValue(sc.nextInt());
        }

        psInteger.printList();

        sc.close();
    }
}
