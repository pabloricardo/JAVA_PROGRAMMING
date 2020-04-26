package entities;

import com.sun.javafx.binding.StringFormatter;

public class Product {

    private String nome;
    private Double price;

    public Product(String nome, Double price) {
        this.nome = nome;
        this.price = price;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Nome = " + nome + " Price = " + String.format("%.2f",price));
    }
}
