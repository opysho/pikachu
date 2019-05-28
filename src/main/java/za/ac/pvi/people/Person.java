package za.ac.pvi.people;

public abstract class Person{

		private String name;
		private String surname;
		private long id;
		private int phoneNumber;
		private String userName;
		private String userPassword;

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
			return this,surname;
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
			return userName;
				}

		public void setUserPassword(String userPassword){
			this.userPassword = userPassword;
				}

		public String getUserPassword(){
			return userPassword;
				}

		public void register(){

		}


		public void logIn(){


		}
