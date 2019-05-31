package za.ac.pvi.pointofsale.privadaclothing.systemApplication;

import za.ac.pvi.pointofsale.privadaclothing.stock.Product;
import za.ac.pvi.pointofsale.privadaclothing.people.Employee;
import za.ac.pvi.pointofsale.privadaclothing.people.Person;
import java.util.Scanner;

public class Application{

        public static void main (String [] args){

                Scanner scanner = new Scanner(System.in);

                Employee employee = new Employee();

		Product product = new Product();

                boolean loggedIn = false;

                System.out.println();
                System.out.println("****        WELCOME TO PRIVADA CLOTHING!!!      *****");
                System.out.println();

                System.out.println("    -- REGISTER YOUR DETAILS --     ");
                System.out.println();

                System.out.println("*** Enter your Name.");
                String inputName = scanner.nextLine();
                employee.setName(inputName);

                System.out.println("*** Enter your Surname.");
                String inputSurname = scanner.nextLine();
                employee.setSurname(inputSurname);

                System.out.println("*** Enter your I.d Number.");
                long inputId = scanner.nextLong();
                employee.setId(inputId);

                System.out.println("*** Enter your Phone Number.");
                int inputPhoneNumber = scanner.nextInt();
                employee.setPhoneNumber(inputPhoneNumber);

		System.out.println("*** Enter your Employee Number.");
                scanner.nextLine();
                String inputEmployeeNumber = scanner.nextLine();
                employee.setEmployeeNumber(inputEmployeeNumber);

                System.out.println("*** Enter your Username.");
                String inputUserName = scanner.nextLine();
                employee.setUserName(inputUserName);

                System.out.println("*** Enter your Password.");
                String inputUserPassword = scanner.nextLine();
                employee.setUserPassword(inputUserPassword);

                employee.register(inputName, inputSurname, inputId, inputPhoneNumber, inputEmployeeNumber, inputUserName, inputUserPassword);

                System.out.println();
                System.out.println("Registration Completed .....        ");
                System.out.println();

                for(int a=0; a<3; a++){
                System.out.println("    SIGN IN    ");
                System.out.println();

		System.out.println("*** Enter your Username.");
                String loginUserName = scanner.nextLine();

                System.out.println("*** Enter your Password.");
                String loginUserPassword = scanner.nextLine();

                loggedIn = employee.login(loginUserName, loginUserPassword);
                if(loggedIn == false){

                System.out.println("*** Wrong Username and Password, Try again!!! ***   ");
                System.out.println();
                        }
                else if(loggedIn == true)
                        a=4;
                                }
                if(loggedIn == true){
                System.out.println("    Login Successfully!!!");
			         }
                else{
                System.out.println("    Invalid login credentials       ");
                System.exit(1);
                        }

		System.out.println(" DELIVERY ");
		System.out.println();

		System.out.println("*** Item Name. ");
		String itemName = scanner.nextLine();
		product.setName(itemName);

		System.out.println(" Size ");
		String itemSize = scanner.nextLine();
		product.setSize(itemSize);

		System.out.println(" Color ");
		String itemColor = scanner.nextLine();
		product.setColor(itemColor);

		System.out.println(" Type ");
		String itemType = scanner.nextLine();
		product.setType(itemType);

		System.out.println(" Barcode ");
                String itemBarcode = scanner.nextLine();
                product.setBarcode(itemBarcode);

		System.out.println(" Stock Number ");
                String itemNumber = scanner.nextLine();
                product.setProductNumber(itemNumber);

		System.out.println(" Delivery Date ");
                String itemDeliveryDate = scanner.nextLine();
                product.setDeliveryDate(itemDeliveryDate);

		System.out.println(" Quantity ");
                int itemQuantityReceived = scanner.nextInt();
                product.setQuantityReceived(itemQuantityReceived);

		employee.delivery(product);

		for(int a=0; a<3; a++){
		System.out.println();
                System.out.println("    AUTHORIZE!!!    ");
                System.out.println();

                System.out.println("*** Enter your Username.");
		scanner.nextLine();
                String loginUserName = scanner.nextLine();

                System.out.println("*** Enter your Password.");
                String loginUserPassword = scanner.nextLine();

		System.out.println("*** Enter your Super Usercode");
		String loginSuperUserCode = scanner.nextLine();

		employee.setSuperUserCode("rs123");
                loggedIn = employee.authorize(loginUserName, loginUserPassword, loginSuperUserCode);
                if(loggedIn == false){

                System.out.println("*** Wrong Username, Password and Usercode, Try again!!! ***   ");
                System.out.println();
                         }
                else if(loggedIn == true)
                         a=4;
                                 }
                if(loggedIn == true){
                System.out.println("    Authorize Successfully!!!");
                                  }
                 else{
                 System.out.println("    Invalid login credentials       ");
                   System.exit(1);
                         }


}


}
