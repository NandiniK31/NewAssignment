package ContactManagement;

import java.util.List;
import java.util.Scanner;

public class UserRequest {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("1.Add contact");
	System.out.println("2.Update contact");
	System.out.println("3.Delete contact");
	System.out.println("4.Search contact By Name");
	System.out.println("5.Search contact By Organisation");
	System.out.println("Enter your choice");
	int option= sc.nextInt();
	
	switch (option) {
	  
    // Case
    case 1:
    	AddContact ac =new AddContact();
    	Scanner sca=new Scanner(System.in);
    	System.out.println("Enter name");
    	String name= sca.nextLine();
    	System.out.println("Enter organisation");
    	String organisation= sca.nextLine();
    	System.out.println("Enter Phone number");
    	String phoneNumber= sca.nextLine();	
    	System.out.println("Enter address");
    	String address= sca.nextLine();
    	ac.addContact(name, organisation, phoneNumber, address);
        break;

    // Case
    case 2:
    	UpdateContact uc = new UpdateContact();
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter name");
    	String name1= scan.nextLine();
    	System.out.println("Enter organisation");
    	String organisation1= scan.nextLine();
    	System.out.println("Enter Phone number");
    	String phoneNumber1= scan.nextLine();	
    	System.out.println("Enter address");
    	String address1= scan.nextLine();
    	uc.updateContact(name1, organisation1, phoneNumber1, address1);
        break;

        // Case
    case 3:
    	DeleteContact dc = new DeleteContact();
    	Scanner scann=new Scanner(System.in);
    	System.out.println("Enter name");
    	String name2= scann.nextLine();
    	dc.deleteContact(name2);
        break;

        // Case
    case 4:
    	SearchContactByName scbn =new SearchContactByName();
    	Scanner scanne=new Scanner(System.in);
    	System.out.println("Enter Prefix");
    	String prefix= scanne.nextLine();
    	List<Contact> contactList = scbn.searchContactByName(prefix);
    	for (Contact i : contactList) {
    		System.out.print("Name: " + i.getName());
            System.out.print(", Organisation: " + i.getOrganisation());
            System.out.print(", Phone: " + i.getPhoneNumber());
            System.out.println(", Addess: " + i.getAddress());
        }
        break;

    // Case
    case 5:
    	SearchContactByOrganisation scbo = new SearchContactByOrganisation();
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter Prefix");
    	String prefix1= scanner.nextLine();
    	List<Contact> contactListFrOrganisation = scbo.searchContactByOrganisation(prefix1);
    	for (Contact i : contactListFrOrganisation) {
    		System.out.print("Name: " + i.getName());
            System.out.print(", Organisation: " + i.getOrganisation());
            System.out.print(", Phone: " + i.getPhoneNumber());
            System.out.println(", Addess: " + i.getAddress());
        }
        break;

    // Default case
    default:
    	System.out.println("PLease enter a valid option in numbers mentioned");
    }
	}

}
