package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct109;
import entities.Product109;
import entities.UsedProduct109;

public class Program109 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product109> products = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char cui = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (cui == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				Date manufactureDate = sdf.parse(sc.nextLine());			
				products.add(new UsedProduct109(name, price, manufactureDate));			
			} else if (cui == 'i') {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				products.add(new ImportedProduct109(name, price, customsFee));
			} else {
				products.add(new Product109(name, price));
			}
			
		}
		
		for (Product109 p:products) {
			System.out.println(p.priceTag());
		}
		
		
		sc.close();
	}

}
