package entities;

public class OutsourceEmployee extends Employee {

	private Double addionalCharger;
	
	public OutsourceEmployee() {
		super();
	}

	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double addionalCharger) {
		super(name, hours, valuePerHour);
		this.addionalCharger = addionalCharger;
	}

	public Double getAddionalCharger() {
		return addionalCharger;
	}

	public void setAddionalCharger(Double addionalCharger) {
		this.addionalCharger = addionalCharger;
	}
	
	@Override
	public Double payment() {
		return super.payment() + addionalCharger * 1.1;
	}
}
