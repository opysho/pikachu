package za.ac.pvi.pointofsale.privadaclothing.systemApplication;

import za.ac.pvi.pointofsale.privadaclothing.people.Employee;
import za.ac.pvi.pointofsale.privadaclothing.people.Person;
import java.util.Scanner;

public class Application{

        public static void main (String [] args){

                Scanner scanner = new Scanner(System.in);

                Employee employee = new Employee();

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

		for(int a=0; a<3; a++){
		System.out.println();
                System.out.println("    AUTHORIZE!!!    ");
                System.out.println();

                System.out.println("*** Enter your Username.");
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
