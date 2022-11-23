package entities;

public class OutsourcedEmployee extends Employee {
	private double additionalCharge;
	private double totalValue;

	public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public double totalValue() {
		return super.totalValue() + getAdditionalCharge();
	}

	public double getAdditionalCharge() {
		return additionalCharge + (additionalCharge / 100 * 10);
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public String toString() {
		return name + " - $ " + totalValue();
	}

}
