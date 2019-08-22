package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle111;
import entities.Rectangle111;
import entities.Shape111;
import entities.enums.Color111;

public class Program111 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Shape111> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char rc = sc.next().charAt(0);
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			sc.nextLine();
			if (rc == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				shapes.add(new Rectangle111(Color111.valueOf(color), width, height));
			} else if (rc == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				shapes.add(new Circle111(Color111.valueOf(color), radius));			
			} else {
				System.out.println("Invalid option. Terminating.");
			}
			
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for (Shape111 shape:shapes) {
			System.out.println(shape.area());
		}
		
		
		
		sc.close();
		
	}

}
