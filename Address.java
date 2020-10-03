package book;

import java.io.*;
import java.util.HashMap;
import java.util.*;

  public class Address{
      //Declare variables
	  String first, last, homeadd, City, State;
	  String Zip;
	String cellnum;
      
		Scanner sc =  new Scanner(System.in);
	  public Address(String firstName, String lastName, String homeAddress, String city, String state, String zip, String cellNumber){
	  	first=firstName;
	  	last=lastName;
	  	homeadd=homeAddress;
	  	City=city;
	  	State=state;
	  	Zip=zip;
	  	cellnum=cellNumber;
	  	
	  }
	  public void printMenu(){
		System.out.println(" Select one option");
		System.out.println("1. Add a new person");
		System.out.println("2. Edit existing person");
		System.out.println("3. Print the address book.");
		System.out.println("4. Sort by last name");
		System.out.println("4. exit");
	//	System.out.println("5. Sort by first zip code");
		int answer = sc.nextInt();
	//Switch to navigate menu
	switch (answer){
		case 1: getaddress();
		printMenu();
		break;
		case 2: edit();
		break;
		case 3: print(); 
		printMenu();
		break;
		case 4: 
			sortaddress();
			printMenu();
		break;
		case 5: System.exit(0);
		break;
		default: System.out.println("Enter a number between 1 and 6.");
		printMenu();
	}
}
      Address(){
      }
		
      //Get address
      public void getaddress(){
		
    	  
		  for( int i = 1; i<=1; i++){
		  System.out.println();
		  System.out.println("Enter first name:");
		  first = sc.next();
		  //outFile.print(first);
		  System.out.println("Enter  last name:");
		  last = sc.next();
		  //outFile.print(last);
		  System.out.println("Enter address.");
		  homeadd = sc.next();
		  //outFile.print(homeadd);
		  System.out.println("Enter City");
		  City = sc.next();
		  //outFile.print(City);
		  System.out.println("Enter  State");
		  State = sc.next();
		  //outFile.print(State);
		  System.out.println("Enter Zip");
		  Zip = sc.next();
		  //outFile.print(Zip);
		  System.out.println("Enter contact phone");
		  cellnum = sc.next();
		  //outFile.print(cellnum);
	  }}
      public void sortaddress() {
    	  public static void getaddress(Map<String, AddressB> HashMapObject, String name) {
    	        System.out.println("Enter the First Name:");
    	        final String First = s.nextLine();
    	        HashMapObject.get(name).setFirst(First);
    	        System.out.println("Enter the Last Name:");
    	        final String Last = s.nextLine();
    	        HashMapObject.get(name).setLast(Last);
    	        System.out.println("Enter the Address :");
    	        String homeadd = s.nextLine();
    	        HashMapObject.get(name).setAddress(homeadd);
    	        System.out.println("Enter the City:");
    	        String City = s.nextLine();
    	        HashMapObject.get(name).setCity(City);
    	        System.out.println("Enter the State:");
    	        String State = s.nextLine();
    	        HashMapObject.get(name).setState(State);
    	        System.out.println("Enter the Postal Code:");
    	        int Zip = s.nextInt();
    	        HashMapObject.get(name).setZip(Zip);
    	        System.out.println("Enter the Contact Number:");
    	        long celnum = s.nextLong();
    	        HashMapObject.get(cellnum).setPhoneNumber(cellnum);
    	    }

    	    private static void sortByName(Map<String, AddressB> HashMapObject) {
    	        TreeMap<String, AddressBook> treemap = new TreeMap<>(HashMapObject);
    	        Set<Map.Entry<String, AddressBook>> sortedOrder=treemap.entrySet();
    	        System.out.println("KEY       FNAME   LNAME   ADDRESS     CITY    STATE   PIN     PHNUMBR");
    	        for(Map.Entry<String, AddressBook> sortOrder : sortedOrder){
    	            System.out.println(sortOrder.getKey() + "   ==>   " + sortOrder.getValue().getFirst()+"     "+sortOrder.getValue().getLast()+"     "+sortOrder.getValue().getAddress()+"     "+sortOrder.getValue().getCity()+"     "+sortOrder.getValue().getState()+"     "+sortOrder.getValue().getZip()+"     "+sortOrder.getValue().getcellnum());
    	        }
    	    }
      }
      public void edit() {
    	  private static void editDetails(Map<String, AddressB> HashMapObject) {
    	        System.out.print("Wanna Edit? If YES, Press Y for edit : ");
    	        char edit = scan.next().charAt(0);
    	        if (edit == 'Y' || edit == 'y') {
    	            System.out.println("Enter the first name you need to edit :");
    	            String name = scan.nextLine();
    	            editContact(HashMapObject, name);
    	        }
    	    }

    	    private static void editContact(Map<String, AddressB> HashMapObject, String name) {
    	        System.out.println("1.Address  2.City  3.State  4.ZIP Code  5.PhNumber");
    	        System.out.println("What You need to Edit ? Enter Your Choice : ");

    	        int choice = s.nextInt();
    	        scan.nextLine();
    	        switch (choice) {
    	            case 1:
    	                System.out.println("Enter the New Address : ");
    	                String newAddress = s.nextLine();
    	                HashMapObject.get(name).setAddress(newAddress);
    	                System.out.println("NEW : " + HashMapObject.get(name).getAddress());
    	                System.out.println("Address is Updated..");
    	                break;
    	            case 2:
    	                System.out.println("Enter the New city : ");
    	                String newcity = s.nextLine();
    	                HashMapObject.get(name).setAddress(newcity);
    	                System.out.println("NEW : " + HashMapObject.get(name).getCity());
    	                System.out.println("city is Updated..");
    	                break;
    	            case 3:
    	                System.out.println("Enter the New State : ");
    	                String newState = s.nextLine();
    	                HashMapObject.get(name).setAddress(newState);
    	                System.out.println("NEW : " + HashMapObject.get(name).getState());
    	                System.out.println("state is Updated..");
    	                break;
    	            case 4:
    	                System.out.println("Enter the New PIN Code : ");
    	                String newPinCode = s.nextLine();
    	                HashMapObject.get(name).setAddress(newPinCode);
    	                System.out.println("NEW : " + HashMapObject.get(name).getZip());
    	                System.out.println("PIN code is Updated..");
    	                break;
    	            case 5:
    	                System.out.println("Enter the New Number : ");
    	                String newPhNumber = s.nextLine();
    	                HashMapObject.get(name).setAddress(newPhNumber);
    	                System.out.println("NEW : " + HashMapObject.get(name).getPhoneNumber());
    	                System.out.println("Contact Number is Updated..");
    	                break;
    	        }
    	    }
      }
	 
	  public void print(){
		  System.out.println("FNAME   LNAME   ADDRESS     CITY    STATE   PIN     PHNUMBR");
	        addressBookHolder.forEach((k, v) -> System.out.println(k + ":" + v.getFirstName() + "    " + v.getLastName() + "     " + v.getAddress() + "     " + v.getCity() + "     " + v.getState() + "    " + v.getZip() + "      " + v.getPhoneNumber()));
	        editDetails(address);
		  }
	  }
