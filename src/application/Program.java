package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.print("Enter department's name:  ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter woker data:  ");
		System.out.print("Name : ");
		String workerName = sc.nextLine();
		System.out.print("Level : ");
		String workerLevel = sc.nextLine();
		System.out.print("Salary : ");
		double workerSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName,WorkerLevel.valueOf(workerLevel),workerSalary,new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int qtContracts = sc.nextInt();
		for (int i = 0; i < qtContracts; i++) {
			System.out.println("Enter the contract #"+(i+1)+" data :");
			System.out.print("Date (DD/MM/YYYY): ");
			String dateContract = sc.nextLine();
			System.out.print("\nValue per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("\nDuration (hours):");
			int duration = sc.nextInt();
			
			
		}
		
		
		
		sc.close();
		
	}

}
