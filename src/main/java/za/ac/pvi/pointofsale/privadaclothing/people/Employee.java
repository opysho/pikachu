package za.ac.pvi.pointofsale.privadaclothing.people;

import za.ac.pvi.pointofsale.privadaclothing.stock.Product;

public class Employee extends Person{


        public Employee(){}

		public void delivery(Product product){
			return;
		}


                public boolean authorize(String userName, String userPassword, String superUserCode){
                        if(userName.equals(getUserName()) && userPassword.equals(getUserPassword()) && superUserCode.equals(getSuperUserCode())){
                        return true;
                                }
				else {return false;}
}
}
