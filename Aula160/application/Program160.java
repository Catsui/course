package application;

import java.io.File;
import java.util.Scanner;

public class Program160 {
	
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		for (File folder:folders) {
			System.out.println(folder);

		}
		
		File[] files = path.listFiles(File::isFile);
		
		for (File file:files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created succesfully: "+success);
		
		sc.close();
	}
}