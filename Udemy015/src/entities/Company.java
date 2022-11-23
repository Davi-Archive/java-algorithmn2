package entities;

public class Company extends TaxPayer {

	private int employeeNumber;

	public Company(String name, double anualIncome, int employeeNumber) {
		super(name, anualIncome);
		this.employeeNumber = employeeNumber;
	}

	@Override
	public String taxesPaid() {
		return getName() + ": $ " + getTotalTaxesToPay();
	}

	public double getTotalTaxesToPay() {
		double taxesCompany;
		if (employeeNumber > 10) {
			taxesCompany = getAnualIncome() * 0.14;
		} else {
			taxesCompany = getAnualIncome() * 0.16;
		}
		return taxesCompany;
	}
	
	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

}
