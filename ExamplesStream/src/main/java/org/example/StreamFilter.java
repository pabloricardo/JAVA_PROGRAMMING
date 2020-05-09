package org.example;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        System.out.println("Todas as pessoas: ");
        pessoas.forEach(System.out::println);

        System.out.println("______________________________________");

        List<Pessoa> pessoasFilter01 = pessoas.stream().filter(p -> p.getNome().charAt(0) == 'M').collect(Collectors.toList());
        System.out.println("Pessoas que começam com letra M: ");
        pessoasFilter01.forEach(System.out::println);

        System.out.println("______________________________________");
        List<Pessoa> pessoasFilter02 = pessoas.stream().filter(p -> p.getNacionalidade().equalsIgnoreCase("Brasil")).collect(Collectors.toList());
        System.out.println("Pessoas com a nacionalidade Brasileira: ");
        pessoasFilter02.forEach(System.out::println);

        System.out.println("______________________________________");
        List<Pessoa> pessoasFilter03 = pessoas.stream().filter(p -> p.getIdade() > 22 && p.getNacionalidade().equalsIgnoreCase("Canada")).collect(Collectors.toList());
        System.out.println("Pessoas com a idade maior que 22 e nacionalidade igual a Canada: ");
        pessoasFilter03.forEach(System.out::println);
        
    }
}
