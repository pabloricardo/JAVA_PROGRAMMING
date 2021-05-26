package application;

import services.PrintService;

import java.util.Scanner;

public class Program
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintService ps = new PrintService();

        System.out.println("Quantos valores");
        int valores = sc.nextInt();

        for (int i = 0; i < valores; i++) {
            String valor = sc.next();
            ps.adicionarValor(valor);
        }

        ps.print();
        System.out.println("Primeiro valor é: " + ps.PrimeiroValor());
        sc.close();
    }
}
