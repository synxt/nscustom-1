package in.co.statements.oops.models;

public class MainClass {
	public static void main(String[] args) {
		TaxCalculator calculator = new LegacyTaxCalculator();
		TaxReporter report = new TaxReporter();
		report.reportTax(calculator);
	}
}	
