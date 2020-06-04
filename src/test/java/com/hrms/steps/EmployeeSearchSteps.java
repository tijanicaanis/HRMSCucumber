package com.hrms.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.SendKeysAction;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EmployeeSearchSteps extends CommonMethods {

	@Given("user is navigated to HRMS")
	public void user_is_navigated_to_HRMS() {
		System.out.println("user is nagivating to HRMS");
		setUp();

	}

	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		sendText(login.username, ConfigsReader.getPropery("username"));
		sendText(login.password, ConfigsReader.getPropery("password"));
		click(login.loginBtn);
	}

	@Given("user navigate to employee list page")
	public void user_navigate_to_employee_list_page() {
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}

	@When("user enters valid id")
	public void user_enters_valid_id() {
		sendText(viewEmp.EmpID, "6532");
	}

	@When("click on search button")
	public void click_on_search_button() {
	    jsClick(viewEmp.EmpID);
	}

	@Then("user see employee information is displayed")
	public void user_see_employee_information_is_displayed() {
	    boolean empIsDisplayed=driver.findElement(By.xpath("//table/tbody/tr/td/a")).isDisplayed();
	}

	@When("user enters valid name")
	public void user_enters_valid_name() {
		 sendText(viewEmp.EmpName,"Umit");
	}
}
