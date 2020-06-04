package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidLoggIn extends CommonMethods {
	
	@When("user logged with valid username and invalid password")
	public void user_logged_with_valid_username_and_invalid_password() {
		sendText(login.username, ConfigsReader.getPropery("username"));
		sendText(login.password, "fijjk");
		click(login.loginBtn);
		
	}

	@Then("user see Error message Invalid credentials")
	public void user_see_Error_message_Invalid_credentials() {
		if(login.errorMsg.getText().equals("Invalid credentials")) {
			System.out.println("Invalid credentials");	
		}
	}

	@When("user is logged with empty username and valid password")
	public void user_is_logged_with_empty_username_and_valid_password() {
		sendText(login.password, ConfigsReader.getPropery("password"));
		click(login.loginBtn);
		
	}

	@Then("user see Error message Username cannot be empty")
	public void user_see_Error_message_Username_cannot_be_empty() {
		if(login.errorMsg.getText().equals("Username cannot be empty")) {
			System.out.println("Username cannot be empty");	
		}
		
	}

	@When("user is logged with valid username and empty password")
	public void user_is_logged_with_valid_username_and_empty_password() {
		sendText(login.username, ConfigsReader.getPropery("username"));
		click(login.loginBtn);
		
	}

	@Then("user see Error message Password cannot be empty")
	public void user_see_Error_message_Password_cannot_be_empty() {
		if(login.errorMsg.getText().equals("Password cannot be empty")) {
			System.out.println("Password cannot be empty");	
		}
	}
}
	



	
