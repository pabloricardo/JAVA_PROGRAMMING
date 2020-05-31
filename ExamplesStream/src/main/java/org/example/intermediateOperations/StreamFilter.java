package org.example.intermediateOperations;

import org.example.entities.Pessoa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        List<Pessoa> personList = new Pessoa().populaPessoas();
        Stream<Pessoa> ps = personList.stream();
        System.out.println("Todas as pessoas: ");
        personList.forEach(System.out::println);

        System.out.println("______________________________________");

        List<Pessoa> personsFilter01 = ps.filter(p -> p.getNome().charAt(0) == 'M').collect(Collectors.toList());
        System.out.println("Pessoas que começam com letra M: ");
        personsFilter01.forEach(System.out::println);

        System.out.println("______________________________________");
        List<Pessoa> personsFilter02 = personList.stream().filter(p -> p.getNacionalidade().equalsIgnoreCase("Brasil")).collect(Collectors.toList());
        System.out.println("Pessoas com a nacionalidade Brasileira: ");
        personsFilter02.forEach(System.out::println);

        System.out.println("______________________________________");
        List<Pessoa> personsFilter03 = personList.stream().filter(p -> p.getIdade() > 22 && p.getNacionalidade().equalsIgnoreCase("Canada")).collect(Collectors.toList());
        System.out.println("Pessoas com a idade maior que 22 e nacionalidade igual a Canada: ");
        personsFilter03.forEach(System.out::println);

    }
}
