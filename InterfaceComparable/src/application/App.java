package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class App {

	public static void main(String[] args) {

		String path = "C:\\Users\\pablo\\source\\repos\\JAVA_PROGRAMMING\\InterfaceComparable\\in.txt";
		List<Employee> employes = new ArrayList<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(","); 
				employes.add(new Employee(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Collections.sort(employes);
		
		for (Employee employee : employes) {
			System.out.println(employee);
		}
		
	}

}
