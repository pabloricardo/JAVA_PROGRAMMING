package org.example.intermediateOperations;

import org.example.entities.Pessoa;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSorted {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new Pessoa().populaPessoas();
        //List<Pessoa> list = pessoas.stream().sorted(Comparator.comparing(Pessoa::getNome)).collect(Collectors.toList());
        List<String> pessoasOrdemAlfabetic = pessoas.stream().sorted(Comparator.comparing(Pessoa::getNome)).map(Pessoa::getNome).collect(Collectors.toList());

        System.out.println("Lista de pessoas: ");
        pessoas.forEach(System.out::println);
        System.out.println("____________________________________________________");
        System.out.println("Nome das pessoas em ordem alfabética");
        pessoasOrdemAlfabetic.forEach(System.out::println);

    }
}
