package com.test;

import java.util.ArrayList;

public class CreateUsersResponse {

	public UserProfile userProfile;
	
} class UserProfile {
	 public ArrayList<User> user;
	}

 class User {

	public String userId;
	
	public String requestSequence;
	
	public Validations validations;
	
	public String overallProcessResult;
	
	public IndividualName individualName;
	
	public ArrayList<Locator> locators;
	
}

 class Validations {
	  private String orgnUnitIdExistsYesNo;
	}
