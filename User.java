package com.yo;

public class User {

	private String name,Email,Mob,Dob,Password;
	
	public User() {
		super();
		
	}

	public User(String name, String email, String mob, String dob, String password) {
		super();
		this.name = name;
		Email = email;
		Mob = mob;
		Dob = dob;
		Password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMob() {
		return Mob;
	}

	public void setMob(String mob) {
		Mob = mob;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	
}
