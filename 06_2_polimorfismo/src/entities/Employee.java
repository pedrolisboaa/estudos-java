package entities;

public class Employee {
	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	public Employee() {
	}
	
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	public String getName() {
		return name;
	}
	
	public void getName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return  hours;
	}
	
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double getValuePerHours() {
		return valuePerHour;
	}
	
	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHour = valuePerHours;
	}
	
	public Double payment() {
		return valuePerHour * hours;
	}

}
