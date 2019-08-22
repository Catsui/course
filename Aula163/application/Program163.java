package application;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program163 {
	
	public static void main (String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
				
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File source = new File(strPath);
		String sourcePath = source.getParent();
		
		boolean success
		
		File path = new File(strPath);
		
		String name = sc.nextLine();
		double price = sc.nextDouble();
		int quantity = sc.nextInt();
		
		
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		
		sc.close();
	}
}