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
        return "Product{" +
                "nome='" + nome + '\'' +
                ", price=" + price +
                '}';
    }

    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    public boolean nonStaticProductPredicate(){
        return price >= 100;
    }
}
