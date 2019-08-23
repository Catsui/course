package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Product163;

public class Program163 {
	
	public static void main (String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product163> products = new ArrayList<>();
				
		System.out.print("Enter a file path: ");
		String sourceStr = sc.nextLine();
		
		File source = new File(sourceStr);
		String sourcePath = source.getParent();
		
		boolean success = new File(sourcePath + "\\out").mkdir();
		
		String targetStr = sourcePath + "\\out\\summary.csv";
		
		try (BufferedReader br = new BufferedReader(new FileReader(source))) {
			
			String itemCsv = br.readLine();
			while (itemCsv != null) {
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				products.add(new Product163(name, price, quantity));
				itemCsv = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetStr))){
				for (Product163 product:products) {
					bw.write(product.getName() + "," + String.format("%.2f", product.totalValue()));
					bw.newLine();
				}
				System.out.println(targetStr + " created.");
			}
			catch (IOException e) {
				e.printStackTrace();		
			} 	
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		if (success) System.out.println();				
	
		sc.close();
	}
}