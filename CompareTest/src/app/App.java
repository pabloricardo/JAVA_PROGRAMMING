package app;

public class App {
    public static void main(String[] args) throws Exception {
        String a = new String("Teste");
        String b = new String("Teste");

        boolean t1 =  a == b; //False
        boolean t2 = a.equals(b); //True
        
        System.out.println(t1);
        System.out.println(t2);


    }
}