package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order2;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus2;

public class Program3 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter client data: ");
		System.out.print("Name: ");
		String nome = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Birth date(DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(sc.next());
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		Client cliente = new Client(nome, email, dataNasc);
		
		Order2 order = new Order2(new Date(), OrderStatus2.valueOf(status), cliente);
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();	
		
		for (int i = 1; i<=n; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();		
						
			System.out.print("Product price: ");
			
			double precoProduto = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int qtProduto = sc.nextInt();
			
			System.out.println();
			
			Product produto = new Product (nomeProduto, precoProduto);
			OrderItem item = new OrderItem (qtProduto, produto);
			
			order.addItem(item);			
			
		}
		
		System.out.println(order);
		
		
		sc.close();
	}

}
