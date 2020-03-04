package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel level;
	private Double baseSalary;
	private Department department;
	private List <HourContract> contracts =  new ArrayList<>();;

	public Worker() {
	}

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Department department) {
		this.name = name;
		this.level = workerLevel;
		this.baseSalary = baseSalary;
		this.department = department;
		
	}
	
	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	public Double income(int year,int month) {
		double sum = this.baseSalary;
		Calendar cal = Calendar.getInstance();
		for (HourContract contract : contracts) {
			cal.setTime(contract.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH) + 1;
			if(c_year == year && c_month == month) {
				sum += contract.totalValue();
			}
		}
		
		return sum;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getWorkerLevel() {
		return level;
	}
	public void setWorkerLevel(WorkerLevel workerLevel) {
		this.level = workerLevel;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
}
