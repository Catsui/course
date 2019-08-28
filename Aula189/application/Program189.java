package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program189 {

	public static void main(String[] args) {

		String path = "C:\\Users\\ivand\\eclipse-workspace\\course\\Aula189\\in.txt";
		
		Map<String,Integer> votos = new HashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				if(votos.containsKey(fields[0])) {
					int totalVotos = votos.get(fields[0]) + Integer.parseInt(fields[1]);
					votos.put(fields[0],totalVotos);
				} else {
					votos.put(fields[0],Integer.parseInt(fields[1]));
				}
				line = br.readLine();	
			}
			System.out.println("Apuração de votos");
			for (String key:votos.keySet()) {
				System.out.println(key + ": " + votos.get(key));
			}
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
