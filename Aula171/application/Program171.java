package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program171 {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract Value: ");
		double value = sc.nextDouble();
		
		System.out.println("Enter the number of installments: ");
		int install = sc.nextInt();
		
		Contract contract = new Contract(value, date, number);
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, install);
		
		System.out.println("Installments: ");
		for (Installment x:contract.getInstallments()) {
			System.out.println(x);
		}
		
		sc.close();
	}

}
