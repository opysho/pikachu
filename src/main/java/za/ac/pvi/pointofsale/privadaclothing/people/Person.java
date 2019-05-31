package za.ac.pvi.pointofsale.privadaclothing.people;


public abstract class Person{

                private String name;
                private String surname;
                private long id;
                private int phoneNumber;
                private String userName;
                private String userPassword;
                private String employeeNumber;
                private String superUserCode;


        public Person(){}


                public void setName(String name){
                        this.name = name;
                                }

                public String getName(){
                        return this.name;
                                }

		public void setSurname(String surname){
                        this.surname = surname;
                                }

                public String getSurname(){
                        return this.surname;
                                }

                public void setId(long id){
                        this.id = id;
                                }

                public long getId(){
                        return this.id;
                                }

                public void setPhoneNumber(int phoneNumber){
                        this.phoneNumber = phoneNumber;
                                }

                public int getPhoneNumber(){
                        return this.phoneNumber;
                                }

                public void setUserName(String userName){
                        this.userName = userName;
				}
		 public String getUserName(){
                        return this.userName;
                                }

                public void setUserPassword(String userPassword){
                        this.userPassword = userPassword;
                                }

                public String getUserPassword(){
                        return this.userPassword;
                                }

                public void setEmployeeNumber(String employeeNumber){
                        this.employeeNumber = employeeNumber;
                                }

                public String getEmployeeNumber(){
                        return this.employeeNumber;
                                }

                public void setSuperUserCode(String superUserCode){
                        this.superUserCode = superUserCode;
                                }
		 public String getSuperUserCode(){
                        return this.superUserCode;
                                }

                public void register(String name, String surname, long id, int phoneNumber, String employeeNumber, String userName, String userPassword){
                this.name = name;
                this.surname = surname;
                this.id = id;
                this.phoneNumber = phoneNumber;
                this.employeeNumber = employeeNumber;
                this.userName = userName;
                this.userPassword = userPassword;
                        return;
                                }

                public boolean login(String userName, String userPassword){
                        if(userName.equals(getUserName()) && userPassword.equals(getUserPassword())){
                                return true;
                                        }
                                        else{
                                                return false;
                                                }
                                }

}



