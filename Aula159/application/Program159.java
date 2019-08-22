package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program159 {
	
	public static void main (String[] args) {
	
		/*String path = "C:\\Users\\ivand\\eclipse-workspace\\arquivos\\aula157\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}	
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}	*/
		
		String[] lines = new String[] {
				"Good morning",
				"Good afternoon",
				"Good night"
		};
		
		String path = "C:\\Users\\ivand\\eclipse-workspace\\arquivos\\aula160\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for (String line: lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}