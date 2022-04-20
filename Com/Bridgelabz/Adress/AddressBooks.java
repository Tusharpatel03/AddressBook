package Com.Bridgelabz.Adress;

import java.util.Scanner;

public class AddressBooks {
	 ContactUC2 c;
	  Scanner sc =new Scanner(System.in);

	  public void addContact() {
		 c = new ContactUC2();
	  System.out.println("Enter the first name : ");
	  String firstName = sc.nextLine();	  
	  System.out.println("Enter the last name : ");
	  String lastName = sc.nextLine();
	  System.out.println("Enter the city : ");
	  String city = sc.nextLine();
	  System.out.println("Enter the state : ");
	  String state = sc.nextLine();
	  System.out.println("Enter the pincode : ");
	  String pincode = sc.nextLine();
	  System.out.println("Enter the mobile no : ");
	  String mobileNo = sc.nextLine();
	  System.out.println("Enter Email id : ");
	  String email = sc.nextLine();
		
	  c.setifirstName(firstName);
	  c.setilastName(lastName);
	  c.setCity(city);
	  c.setState(state);
	  c.setPinCode(pincode);
	  c.setMobileNo(mobileNo);
	  c.setEmail(email);
  
	  System.out.println(c);
		    }
	
}
