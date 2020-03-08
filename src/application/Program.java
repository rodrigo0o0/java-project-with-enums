package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("MM/yyyy");
		
		
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
			sc.nextLine();
			String date = sc.nextLine();
			Date dateContract = sdf.parse(date);
			System.out.print("\nValue per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("\nDuration (hours):");
			int duration = sc.nextInt();
			worker.addContract( new HourContract(dateContract, valuePerHour, duration));
			
			
		}
		
		System.out.print("Enter month and year to calculate income (MM/YYYY)" );
		sc.nextLine();
		String date = sc.nextLine();
		
		Date dateFormated = sdf2.parse(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateFormated);
		int month = cal.get(Calendar.MONTH);
		System.out.println("mes para resgatar no month "+month);
		int year = cal.get(Calendar.YEAR);
		double sum = worker.income(year, month);
		
		
		/*
		for (HourContract hc : hourContract) {
			cal.setTime(hc.getDate());
			int monthHC = cal.get(Calendar.MONTH);
			int yearHC = cal.get(Calendar.YEAR);
			
			if(year == yearHC && month == monthHC) {
				sum += hc.totalValue();
			}
		}
		
		*/
		System.out.println("Name : " + worker.getName());
		System.out.println("Department : "+ worker.getDepartment().getName());
		System.out.println("Income for " + sdf2.format(dateFormated) + " : $" + sum );
		
		
		sc.close();
		
	}

}
