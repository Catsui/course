package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entities.Employee174;

public class Program174 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee174> list = new ArrayList<>();
		String path = "C:\\users\\ivand\\Desktop\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String employeeCsv = br.readLine();
			while (employeeCsv != null) {
				String[] fields = employeeCsv.split(",");
				list.add(new Employee174(fields[0], Double.parseDouble(fields[1])));
				employeeCsv = br.readLine();
			}
			
			Collections.sort(list);
			for (Employee174 e:list) {
				System.out.println(e.getName() + ", " + e.getSalary());
			}
			
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
