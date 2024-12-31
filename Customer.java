package codeAlpha;

public class Customer {
	
		// Private Attributes to provide encapsulation
		private String name = "";
		private int age = 0;
		private String gender = "";
		private String id = "";
		private String phoneNumber = "";
		private String email = "";

		// Setter methods to set the private attributes values
		public void setName(String name) {
			this.name = name;
		}

		public void setAge(int age) {
			this.age = age;
		}
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		public void setId(String id) {
			this.id = id;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		
		public void setEmail(String email) {
			this.email = email;
		}
		
		
		// Getter methods to get the private attributes values
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}
		
		public String getGender() {
			return gender;
		}
		
		public String getId() {
			return id;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}
		
		public String getEmail() {
			return email;
		}
}