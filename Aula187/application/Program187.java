package application;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Program187 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> set = new HashSet<>();
		
		List<Integer> alunos = new ArrayList<>();
		int aluno;
		
		System.out.println("How many students for course A?");
		int n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			aluno = sc.nextInt();
			alunos.add(aluno);
		}
		
		System.out.println("How many students for course B?");
		n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			aluno = sc.nextInt();
			alunos.add(aluno);
		}
		
		System.out.println("How many students for course C?");
		n = sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			aluno = sc.nextInt();
			alunos.add(aluno);
		}
		
		for (int a:alunos) {
			set.add(a);
		}
		
		System.out.println("Total students: " + set.size());
		
		sc.close();
	}

}
