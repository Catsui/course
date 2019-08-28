package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product179;
import services.CalculationService;

public class Program179 {

	public static void main(String[] args) {
		
		List<Product179> list = new ArrayList<>();
		
		String path = "C:\\Users\\ivand\\eclipse-workspace\\course\\Aula179\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product179(fields[0],Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product179 x = CalculationService.max(list);
			System.out.println("Mais caro: " + x);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
