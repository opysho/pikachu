package za.ac.pvi.people;

import za.ac.pvi.stocks.Product;

public class Employee extends Person{

		private String superUserCode;
		private String employeeNumber;

	public Employee(){}

		public void setSuperUserCode(String superUserCode){
			this.superUserCode = superUserCode;
				}

		public String getSuperUserCode(){
			return this.superUserCode;
				}

		public void setEmployeeNumber(String employeeNumber){
			this.employeeNumber = employeeNumber;
				}

		public String getEmployeeNumber(){
			return this.employeeNumber;
				}

		public void delivery(Product [] products){

				}

		public void sell(Product [] products){

				}

		public void stockInventory(Product [] products){

				}

		public boolean authorize(){

				}

		public printReceipt(){

				}

		public void cancelSale(){

				}

		public void reporting(){

				}


}
