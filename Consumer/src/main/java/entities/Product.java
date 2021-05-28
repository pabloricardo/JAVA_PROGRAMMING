package entities;

public class Product {
    String nome;
    Double price;

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
        return String.format("Procduct [Nome:%s  Price:%.2f ]",nome,price);
    }

    public static void staticProductConsumer(Product p){
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticProductConsumer(){
        setPrice(price * 1.1);
    }
}
