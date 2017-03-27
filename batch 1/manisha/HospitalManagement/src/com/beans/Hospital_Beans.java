package com.beans;

public class Hospital_Beans {
			private int reference_id;
			private String name;
			private int  age;
			private String gender;
			private String marital_status;
			private long phone_number;
			private String disease_type;
			private String username;
			private String password;
			public Hospital_Beans(int reference_id, String name, int age,
					String gender, String marital_status, long phone_number,
					String disease_type,String username,String password) {
				super();
				this.reference_id = reference_id;
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.marital_status = marital_status;
				this.phone_number = phone_number;
				this.disease_type = disease_type;
				this.username=username;
				this.password=password;
			}
			public Hospital_Beans(int reference_id, String name, int age,
					String gender, String marital_status, long phone_number,
					String disease_type) {
				super();
				this.reference_id = reference_id;
				this.name = name;
				this.age = age;
				this.gender = gender;
				this.marital_status = marital_status;
				this.phone_number = phone_number;
				this.disease_type = disease_type;
				
			}
			
			public int getReference_id() {
				return reference_id;
			}
			public void setReference_id(int reference_id) {
				this.reference_id = reference_id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getGender() {
				return gender;
			}
			public void setGender(String gender) {
				this.gender = gender;
			}
			public String getMarital_status() {
				return marital_status;
			}
			public void setMarital_status(String marital_status) {
				this.marital_status = marital_status;
			}
			public long getPhone_number() {
				return phone_number;
			}
			public void setPhone_number(long phone_number) {
				this.phone_number = phone_number;
			}
			public String getDisease_type() {
				return disease_type;
			}
			public void setDisease_type(String disease_type) {
				this.disease_type = disease_type;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			public String getPassword() {
				return password;
			}
			public void setPassword(String password) {
				this.password = password;
			}
}
