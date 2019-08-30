package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee202;

public class Program202 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ivand\\eclipse-workspace\\course\\Aula202\\in.txt"))){
			List<Employee202> list = new ArrayList<>();
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee202(fields[0],fields[1],Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary()>salary)
					.map(e -> e.getEmail())
					.sorted(comp)
					.collect(Collectors.toList());
			
			emails.forEach(System.out::println);
			
			double sum = list.stream()
					.filter(e -> e.getName().toUpperCase().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0., (x,y) -> x+y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': "+sum);										
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
