package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account123;
import model.exceptions.OperationException;

public class Program123 {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o número da conta bancária a ser criada: ");
		int number = sc.nextInt();
		System.out.print("Informe o nome do titular: ");
		String name = sc.nextLine();
		sc.next();
		System.out.print("Informe o saldo inicial: ");
		double balance = sc.nextDouble();
		System.out.print("Informe o limite de saque: ");
		double withdrawLimit = sc.nextDouble();
		Account123 account = new Account123(number, name, balance, withdrawLimit);
		
		try {
			System.out.print("Informe um valor para o saque: ");
			double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			System.out.println(account);
		}
		catch (OperationException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}

}
