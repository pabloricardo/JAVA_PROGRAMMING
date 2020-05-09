package org.example.intermediateOperations;

import org.example.entities.Pessoa;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();

        Stream<Integer> stream = pessoas.stream().map(Pessoa::getIdade);
        //List<Integer> idades = stream.collect(Collectors.toList());
        IntStream streamInteger = pessoas.stream().mapToInt(Pessoa::getIdade);
        List<Integer> idades = streamInteger.boxed().collect(Collectors.toList());
        idades.forEach(System.out::println);

    }
}
