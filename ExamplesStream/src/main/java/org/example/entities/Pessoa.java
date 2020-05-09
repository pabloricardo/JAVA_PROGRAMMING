package org.example.entities;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    String id;
    String nome;
    String nacionalidade;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<Pessoa> populaPessoas() {
        Pessoa pessoa1 = new Pessoa("p1", "Matheus Henrique", "Brasil", 18);
        Pessoa pessoa2 = new Pessoa("p2", "Hernandez Roja", "Mexico", 21);
        Pessoa pessoa3 = new Pessoa("p3", "Mario Fernandes", "Canada", 22);
        Pessoa pessoa4 = new Pessoa("p4", "Neyde Alves", "Brasil", 22);
        Pessoa pessoa5 = new Pessoa("p5", "Marcio Junior", "Brasil", 21);
        Pessoa pessoa6 = new Pessoa("p6", "Haton Rosa", "Mexico", 23);
        Pessoa pessoa7 = new Pessoa("p7", "Felipe Junior", "Canada", 25);
        Pessoa pessoa8 = new Pessoa("p8", "Amanda Abreu", "Canada", 23);
        Pessoa pessoa9 = new Pessoa("p9", "Nayara Vaz", "Mexico", 21);

        List<Pessoa> list = new ArrayList<Pessoa>();
        list.add(pessoa1);
        list.add(pessoa2);
        list.add(pessoa3);
        list.add(pessoa4);
        list.add(pessoa5);
        list.add(pessoa6);
        list.add(pessoa7);
        list.add(pessoa8);
        list.add(pessoa9);

        return list;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }
}
