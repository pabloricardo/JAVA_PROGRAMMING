package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();

		System.out.println("Enter the number of products");
		int numberProducts = sc.nextInt();
		
		for (int i = 1; i <= numberProducts; i++) {
			System.out.println("Enter data product #" + i);
			System.out.println("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			sc.nextLine();			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.println("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();			

			if(type == 'c') {
				list.add(new Product(name, price));
			}
			else if(type == 'i') {
				System.out.println("Customs fee: ");
				Double customsFee = sc.nextDouble();
				sc.nextLine();			
				list.add(new ImportedProduct(name, price, customsFee));
			}
			else if(type == 'u') {
				System.out.println("Manufacture date (DD/MM/YYYY)");
				String manufactureDate = sc.nextLine();
				list.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));
			}
		}
		
		System.out.println("PRICE TAGS:");
		for (Product product : list) {
			System.out.println(product.priceTag());
		}
	}
}
