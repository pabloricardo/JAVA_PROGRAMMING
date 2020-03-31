package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		List<Shape> shapes = new ArrayList<>();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of shapes: ");
		int numberShapes = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= numberShapes; i++) {
			
			System.out.println("Enter type of Shape Rectangle or Circle (r/c)");
			char typeShape = sc.next().charAt(0);
			System.out.println("Enter color of Shape (BLACK/BLUE/RED)");
			Color color = Color.valueOf(sc.next());
			
			if(typeShape == 'r') {
				System.out.println("Enter the Width of Rectangle");
				double width = sc.nextDouble();
				sc.nextLine();
				System.out.println("Enter the Height of Rectangle");
				double height =  sc.nextDouble();
				sc.nextLine();
				shapes.add(new Rectangle(color, width, height));
			}
			else {
				System.out.println("Enter the radius of Circle");
				double radius = sc.nextDouble();
				sc.nextLine();
				shapes.add(new Circle(color, radius));
			}			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS");
		
		for (Shape shape : shapes) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		sc.close();
	}

}
