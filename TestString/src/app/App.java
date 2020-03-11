package app;

public class App {
    public static void main(String[] args) throws Exception {
        // String file = "Test.png";
        // System.out.println(file.indexOf("."));
        // file = file.substring(0 , file.indexOf("."));
        // System.out.println(file);

        String aux = "TeSt StRinG FoR TestS %s           ";
        String str01 = aux.toUpperCase();
        String str02 = aux.toLowerCase();
        String str03 = aux.trim();
        String str04 = aux.replace('T', 'B');
        String str05 = aux.replaceAll("TeSt", "Alter");
        int str06 = aux.indexOf("F");
        String str07 = aux.substring(2, 12);
        System.out.println("ToUpperCase -"+str01+"-");
        System.out.println("ToLowerCase -"+str02+"-");
        System.out.println("Trim -"+str03+"-");
        System.out.println("Replace -"+str04+"-");
        System.out.println("Replace -"+str05+"-");
        System.out.println("IndexOf -"+str06+"-");
        System.out.println("Substring -"+str07+"-");
    }
}