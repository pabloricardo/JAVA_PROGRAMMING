package org.example.intermediateOperations;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.example.entities.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CopyList {
    public static void main(String[] args) {
        List<Pessoa> p1 = new Pessoa().populaPessoas();
        List<Pessoa> p2 = new ArrayList<>();

        for (Pessoa p : p1) {
            p2.add(new Pessoa(p.getId(),p.getNome(),p.getNacionalidade(),p.getIdade()));
        }

        Stream<Pessoa> streamP2 = p2.stream().filter(p -> p.getIdade() > 0);
        streamP2.forEach(p -> p.setIdade(p.getIdade()+10));


        p1.forEach(System.out::println);
        System.out.println("______________________________________________");
        p2.forEach(System.out::println);
    }
}
