package in.co.statements.oops.demo;

public class FinancialYearClosure implements BasicYearClosure,InvestmentClosure{
	public int totalTaxCalculator() {
		System.out.println("Total Tax Calculator");
		return 0;
	}
	public String collateAllTransacationsByAccount() {
		System.out.println("Transaction Collator");
		return "";
	}
	public int totalGainBySecurities() {
		System.out.println("Total Securities Gain");
		return 0;
	}
}
