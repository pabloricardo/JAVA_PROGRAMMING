package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
    private List<T> list = new ArrayList<>();


    public void adicionarValor(T valor) {
        list.add(valor);
    }

    public T PrimeiroValor() {
        if (list.isEmpty()){
            throw new IllegalArgumentException("Lista Vazia");
        }
        return list.get(0);
    }


    public void print() {
        if(list.isEmpty())
        {
            throw new IllegalArgumentException("Lista vazia");
        }else{
            System.out.print("[");
            System.out.print(list.get(0));
            for (int i = 1; i < list.size(); i++) {
                System.out.print(", " + list.get(i));
            }
            System.out.print("]");
        }
    }
}
