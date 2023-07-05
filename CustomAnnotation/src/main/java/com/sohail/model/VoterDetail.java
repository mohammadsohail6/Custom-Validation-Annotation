package com.sohail.model;

import com.sohail.validation.DOBValidation;

public class VoterDetail {

	@DOBValidation(message = "Age must be greater than 18 & less than 60")
	private String dob;
	private String name;

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
