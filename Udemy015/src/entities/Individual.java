package entities;

public class Individual extends TaxPayer {

	private double healthExpenses;

	public Individual(String name, double anualIncome, double healthExpenses) {
		super(name, anualIncome);
		this.healthExpenses = healthExpenses;
	}

	@Override
	public String taxesPaid() {
		return getName() + ": $ " + getTotalTaxesToPay();
	}

	public double getTotalTaxesToPay() {
		double taxesIndividual;
		double finalTaxesAfterCalc;
		if (getAnualIncome() < 20000) {
			taxesIndividual = getAnualIncome() * 0.15;
		} else {
			taxesIndividual = getAnualIncome() * 0.25;
		}

		finalTaxesAfterCalc = taxesIndividual - (healthExpenses * 0.50);
		return finalTaxesAfterCalc;
	}

	public double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}

}
