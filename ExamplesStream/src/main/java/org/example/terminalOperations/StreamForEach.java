package org.example.terminalOperations;

import org.example.entities.Pessoa;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamForEach {
    public static void main(String[] args) {
        List<Pessoa> p1 = new Pessoa().populaPessoas();
        List<Pessoa> p2 = new ArrayList<>();

        for (Pessoa p : p1) {
            p2.add(new Pessoa(p.getId(),p.getNome(),p.getNacionalidade(),p.getIdade()));
        }

        Stream<Pessoa> streamP2 = p2.stream();
        //pessoas.stream().forEach(p -> System.out.println(p));
        System.out.println("______________________________________________");
        System.out.println("Idade da pessoa adicionado 10 anos");
        streamP2.forEach(p -> p.setIdade(p.getIdade()+10));
        p1.forEach(System.out::println);
        p2.forEach(System.out::println);



    }
}
