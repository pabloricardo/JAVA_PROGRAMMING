package app;

import enums.Foods;

public class App {
	public static void main(String[] args) {
		Foods f1 = Foods.MEAT;
		System.out.println(f1);
		System.out.println(f1.getFood());
		
		for (Foods f : Foods.values()) {
			System.out.println(String.format("Name: %s   -  Value: %s", f.name(), f.getFood()));
		}
	}
}
