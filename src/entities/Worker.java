package entities;

import entities.enums.WorkerLevel;

public class Worker {
	
	private String name;
	private WorkerLevel workerLevel;
	private Double baseSalary;
	

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary) {
		this.name = name;
		this.workerLevel = workerLevel;
		this.baseSalary = baseSalary;
	}
	
	public Worker() {
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getWorkerLevel() {
		return workerLevel;
	}
	public void setWorkerLevel(WorkerLevel workerLevel) {
		this.workerLevel = workerLevel;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	
	
}
