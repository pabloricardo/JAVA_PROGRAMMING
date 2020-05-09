package org.example.intermediateOperations;

import org.example.entities.Pessoa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        Stream stream = pessoas.stream();
        List<Pessoa> list = pessoas.stream().distinct().collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
