package BarristaJavaProblem;

import java.util.List;
import java.util.Scanner;

import ContactManagement.AddContact;
import ContactManagement.Contact;
import ContactManagement.DeleteContact;
import ContactManagement.SearchContactByName;
import ContactManagement.SearchContactByOrganisation;
import ContactManagement.UpdateContact;

public class BeverageDemo {
	static int counter =0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome To The Best coffee shop. We have!");
		System.out.println("1.Coffee");
		System.out.println("2.Tea");
//		System.out.println("3.Coffee With Cream");
//		System.out.println("4.Tea With Honey");
//		System.out.println("5.Coffee With Chocolate");
//		System.out.println("6.Coffee With Caramel");
		System.out.println("Enter your choice");
		int option= sc.nextInt();
	
		switch (option) {
		  
	    // Case
	    case 1:
			Beverage c1 = new Coffee(100);
			addOnInclude(c1);
	        break;

	    // Case
	    case 2:

			Beverage t1 = new Tea(40);
			addOnInclude(t1);
	        break;

	    // Default case
	    default:
	    	System.out.println("PLease enter a valid option in numbers mentioned");
	    }
	}

	private static void addOnInclude(Beverage c) {
		Scanner sca=new Scanner(System.in);
		System.out.println("Select any provided add-on for best experience");
		System.out.println("1.Cream");
		System.out.println("2.Honey");
		System.out.println("3.Chocolate");
		System.out.println("4.Caramel");
		System.out.println("5.Add-on not required");
		System.out.println("Enter your choice");
		int addOn= sca.nextInt();
		
		switch (addOn) {
	    // Case
	    case 1:
	    	c = new Cream(c, 40);
	        break;

	    // Case
	    case 2:
	    	c = new Honey(c, 30);
	        break;

	        // Case
	    case 3:
	    	c = new Chocolate(c, 50);
	        break;

	        // Case
	    case 4:
	    	c = new Caramel(c, 50);
	        break;

	    // Case
	    case 5:
	    	System.out.println("No add-on selected");
	        break;

	    // Default case
	    default:
	    	System.out.println("Please secelct from provided option");
	    	addOnInclude(c);
	    	break;
	    }
		if(counter <=0)
			printOrderDetails(c);
	}
	
	private static void printOrderDetails(Beverage c) {
		counter++;
		System.out.println("Cost: " + c.getCost() + ", Description: " + c.getDescription());
	}
	
}
