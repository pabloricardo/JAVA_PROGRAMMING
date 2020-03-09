package app;

public class App {
    public static void main(String[] args) throws Exception {
        String file = "SiggaImage.png";
        System.out.println(file.indexOf("."));
        file = file.substring(0 , file.indexOf("."));
        System.out.println(file);
    }
}