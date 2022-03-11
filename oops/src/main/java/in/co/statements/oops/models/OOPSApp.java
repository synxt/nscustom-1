package in.co.statements.oops.models;

import java.util.Scanner;

public class OOPSApp {
	public static void main(String[] args) {
		Bank axis = new Bank(1);
		Bank axisTwo = new Bank(1,"ICICI");
		axis.setBankName("Axis Bank");
		
		axis.registerCustomer(1, "Sushma");
		axis.registerCustomer(2, "Vamsi");
		axis.registerCustomer(3, "Krishna");
		axis.addAccount(40, 1000, 1);
		axis.addAccount(50, 1);
		axis.addAccount(20, 2000, 2);
		axis.addAccount(30, 3000, 3);
		
		System.out.println(axis);
		String type = new Scanner(System.in).nextLine();
		axis.transact(20, 40, 500,type);

		System.out.println(axis);
	}
}
