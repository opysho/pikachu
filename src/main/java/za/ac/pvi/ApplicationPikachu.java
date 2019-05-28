package za.ac.pvi.application;

import za.ac.pvi.people.Employee;
import za.ac.pvi.people.Customer;
import za.ac.pvi.stocks.Product;
import za.ac.pvi.userinterface.UserInterface;
import za.ac.pvi.people.Person;
import java.util.Scanner;

public class ApplicationPikachu{

	public static void main (String [] args){

		Employee employee = new Employee();
		Employee [] employees = new Employee[3];
		employees[0] = employee;

		Customer customer = new Customer();

		Product product = new Product();
		Product products = new Product[3];

		UserInterace user = new UserInterface();

		System.out.println("	WELCOME TO PRIVADA CLOTHING!!!	");
		System.out.println();

		System.out.println("	SIGN UP A NEW ACCOUNT	");
		System.out.println();

		System.out.println("*** Enter your Name.");
		String inputName = scanner.nextLine();

		System.out.println("*** Enter your Surname.");
		String inputSurname = scanner.nextLine();

		System.out.println("*** Enter your I.d Number.");
		String inputId = scanner.nextLine();

		System.out.println("*** Enter your Phone Number.");
		int inputPhoneNumber = scanner.nextInt();

		System.out.println("*** Enter your Employee Number.");
		String inputEmployeeNumber = scanner.nextLine();

		System.out.println("*** Enter your Username.");
		String inputUsername = scanner.nextLine();

		System.out.println("*** Enter your Password.");
		String inputPassword = scanner.nextLine();

		employees[0].setName(inputname);
		







}


}
