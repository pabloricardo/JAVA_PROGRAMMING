package org.example.intermediateOperations;

import org.example.entities.Pessoa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLimit {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream<Pessoa> stream = pessoas.stream();
        List<Pessoa> pessoasLimit = stream.filter(p -> p.getNome().charAt(0) == 'M').limit(2).collect(Collectors.toList());
        pessoasLimit.forEach(System.out::println);
    }
}
