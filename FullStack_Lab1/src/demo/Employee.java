package demo;

import java.util.Scanner;

public class Employee {
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	final String firstName;
	final String lastName;

public static void main(String[] args) {
	
	CredentialService service = new CredentialService();
	
	Scanner in = new Scanner (System.in);
	
	boolean exit = false;
	
	
	System.out.println("Please enter your first name");
	String firstName = in.nextLine();
	
	
	System.out.println("Please enter your last name");
	String lastName = in.nextLine();
	
	
	Employee e = new Employee(firstName, lastName);
	
	System.out.println("Please choose your department name from the following\n"
			+ "1. Technical"
			+ "\n2. Admin"
			+ "\n3. Human Resource"
			+ "\n4. Legal"
			);
	
	int choice = in.nextInt();
	
	
	String department="";
	
	switch(choice) {
	case 1:{
		department = "@tech";
		break;
	}
	case 2:{
		department = "@admin";
		break;
	}
	case 3:{
		department = "@hr";
		break;
	}
	case 4:{
		department = "@legal";
		break;
	}
		
	
		
		default:
			System.out.println("Invalid input");
			
			
			
}
	
	
	service.generateEmailAddress(e, department);
	service.generatePassword();
	service.showCredentials();
	
	
	
}

}
