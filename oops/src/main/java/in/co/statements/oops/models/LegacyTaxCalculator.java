package in.co.statements.oops.models;

public class LegacyTaxCalculator implements TaxCalculator{
	public int getTotalTaxableIncome() {
		return 100000;
	}

	public int[] getTaxRanges() {
		return null;
	}
	
}
