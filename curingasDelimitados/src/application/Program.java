package application;

import java.util.List;

public class Program {
    public static void main(String[] args) {

    }

    public void copy(List<? extends Number> inputList, List<? super Number> outputList){
        for (Number element : inputList ) {
            outputList.add(element);
        }
    }





}
