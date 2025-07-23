package assignment2;
import java.util.Scanner;

public class Commission {
	
	    // Data members
	    String name, address, phone;
	    double sales_amount;

	    // Method to accept employee details
	    public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter name: ");
	        name = sc.nextLine();

	        System.out.print("Enter address: ");
	        address = sc.nextLine();

	        System.out.print("Enter phone number: ");
	        phone = sc.nextLine();

	        System.out.print("Enter sales amount: ");
	        sales_amount = sc.nextDouble();
	    }

	    // Method to calculate commission
	    public void calculateCommission() {
	        double commission;

	        if (sales_amount >= 100000) {
	            commission = sales_amount * 0.10;
	        } else if (sales_amount >= 50000) {
	            commission = sales_amount * 0.05;
	        } else if (sales_amount >= 30000) {
	            commission = sales_amount * 0.03;
	        } else {
	            commission = 0;
	        }

	        System.out.println("Commission earned: ₹" + commission);
	    }
	}



