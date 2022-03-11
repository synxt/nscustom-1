package in.co.statements.oops;

import java.util.Arrays;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter No Of Customers");
    	int size  = Integer.parseInt(sc.nextLine());
    	int[] custIds = new int[size];
    	String[] custNames = new String[size];
    	int[] accountIds = new int[size];
    	int[] accountBalances = new int[size];
    	
    	
    	
    	for(int i=0;i<size;i++) {
			System.out.printf("Enter customer %d id",(i+1));
			custIds[i] = Integer.parseInt(sc.nextLine());
			System.out.printf("Enter customer %d Name",(i+1));
			custNames[i] = sc.nextLine();    	        
    	}
        

    	for(int i=0;i<size;i++) {
    		System.out.printf("Enter account %d id",(i+1));
	        accountIds[i] = Integer.parseInt(sc.nextLine());
	        System.out.printf("Enter account %d balance",(i+1));
	        accountBalances[i] = Integer.parseInt(sc.nextLine());
    	}
      
        System.out.println("Enter Customer Name");
        
        String custName= sc.nextLine();        
        int relaventIndex =  Arrays.asList(custNames).indexOf(custName);
        System.out.println(custIds[relaventIndex]);
        System.out.println(accountIds[relaventIndex]);
        System.out.println(accountBalances[relaventIndex]);
        
    	
        
    }
}
