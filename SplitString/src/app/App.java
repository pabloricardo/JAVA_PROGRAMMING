package app;

public class App {
	public static void main(String[] args) {
		String str = "Sorvete Pizza Lasanha";
		String[] strSplit = str.split(" ");
		
		for (String string : strSplit) {
			System.out.println(string);
		}
	}

}
