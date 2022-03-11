package in.co.statements.oops.models;

public class TaxReporter {
	public void reportTax(TaxCalculator calculator) {
		System.out.println(calculator.getTotalTaxableIncome());
	}
	
}
