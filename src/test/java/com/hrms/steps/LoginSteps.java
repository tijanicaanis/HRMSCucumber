package com.hrms.steps;

import com.hrms.utils.CommonMethods;

import com.hrms.utils.ConfigsReader;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.Credentials;

import org.junit.Assert;

public class LoginSteps extends CommonMethods {

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getPropery("username"));
		sendText(login.password, ConfigsReader.getPropery("password"));
		click(login.loginBtn);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		click(login.loginBtn);

	}

	@When("User enter valid username and invalid password")
	public void user_enter_valid_username_and_invalid_password() {
		sendText(login.username, "Elvira");
		sendText(login.password, "Syntax123.....");
	}

	@Then("User see Invalid Credentials text on login page")
	public void user_see_Invalid_Credentials_text_on_login_page() {
		String expected = "Invalid credentials";
		String actual = login.errorMsg.getText();
		Assert.assertEquals("Welcome text is NOT displayed correctly", expected, actual);
	}

	@When("User enter empty {string}  and invalid {string}")
	public void user_enter_valid_and_invalid(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);
	}

	@Then("User see {string} text on login page")
	public void user_see_text_on_login_page(String errText) {
		String expected = errText;
		String actual = login.errorMsg.getText();
		Assert.assertEquals("Welcome text is NOT displayed correctly", expected, actual);
	}

	@When("user enter valid ess {string} and {string}")
	public void user_enter_valid_ess_and(String username, String password) {
		sendText(login.username, username);
		sendText(login.password, password);
	}

	@Then("{string} is successfully logged in")
	public void is_successfully_logged_in(String firstname) {
		String expected = "Welcome " + firstname;
		String actual = dashboard.welcome.getText();
		Assert.assertEquals("Welcome text is NOT displayed correctly", expected, actual);

	}

	@When("i enter empty credentials and see error massage")
	public void i_enter_empty_credentials_and_valid_passwordand_see_error_massage(DataTable emptyCredentials) {
		List<Map<String, String>> emptyC = emptyCredentials.asMaps();

		for (Map<String, String> map : emptyC) {
			String username=map.get("UserName");
			String password=map.get("Password");
			String errorM=map.get("ErrorMessage");
			sendText(login.username, username);
			sendText(login.password, password);
			click(login.loginBtn);
			
			Assert.assertEquals(login.errorMsg.getText(),errorM);
		
		
		}
	}
}
