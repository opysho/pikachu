package za.ac.pvi.pointofsale.privadaclothing.people;


public class Employee extends Person{


        public Employee(){}


                public boolean authorize(String userName, String userPassword, String superUserCode){
                        if(userName.equals(getUserName()) && userPassword.equals(getUserPassword()) && superUserCode.equals(getSuperUserCode())){
                        return true;
                                }
				else {return false;}
}
}
