import java.io.*;
import java.util.*;
   class AddressB{
	   static Scanner sc = new Scanner(System.in);
	   public static void main(String[] args){
		   int answer;
		   answer = 0;
		   //Call constructor and set those variables as null
		   Address addressObject = new Address();
		   addressObject.first = "null";
		   addressObject.last = "null";
		   addressObject.homeadd = "null";
		   addressObject.City = "null";
		   addressObject.State = "null";
		   addressObject.Zip = "null";
		   addressObject.cellnum = "null";
		   //Menu print
		   System.out.println(" Select one option");
			System.out.println("1. Add a new person");
			System.out.println("2. Edit existing person");
			System.out.println("3. Print the address book.");
			System.out.println("4. Sort by last name");
		   //Get data member to navigate menu
			answer = sc.nextInt();
		   //Switch to navigate menu
		   switch (answer){
			   case 1: addressObject.getaddress();
			   addressObject.printMenu();
			   break;
			   case 2: addressObject.edit();
				break;
				case 3: addressObject.print(); 
				addressObject.printMenu();
				break;
				case 4: 
					addressObject.sortaddress();
					addressObject.printMenu();
				break;
				case 5: System.exit(0);
				break;
				default: System.out.println("Enter a number between 1 and 6.");
				addressObject.printMenu();
		   }
	   }
   }
