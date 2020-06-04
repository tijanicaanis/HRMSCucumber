package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogginValidCred extends CommonMethods {
	@Then("user see employee Bashboard page")
	public void user_see_employee_Bashboard_page() {
		if (dashboard.welcome.isDisplayed()) {
			System.out.println("User logged in");
		} else {
			System.out.println("User did Not logged in");
		}
	}

	@When("user is logged with valid Employee credentials")
	public void user_is_logged_with_valid_Employee_credentials() {
		sendText(login.username, ConfigsReader.getPropery("empUsername"));
		sendText(login.password, ConfigsReader.getPropery("empPassword"));
		click(login.loginBtn);
	}
}
