package in.co.statements.oops.models;

public abstract class NewTaxCalculator implements TaxCalculator{
	public int getTotalTaxableIncome() {
		return 52000;
	}
	abstract int[] getTaxRanges();
}
