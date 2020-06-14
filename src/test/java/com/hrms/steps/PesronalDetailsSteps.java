package com.hrms.steps;

import java.util.List;
import java.util.Map;

import javax.print.attribute.standard.PDLOverrideSupported;

import org.junit.Assert;

import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class PesronalDetailsSteps extends CommonMethods {

	@Then("user click on edit button")
	public void user_click_on_edit_button() {
		click(pdetails.edit_safeBtn);
	}

	@Then("User modifiy information")
	public void user_modifiy_information(DataTable personalInf) {
		List<Map<String, String>> list = personalInf.asMaps();
		for (Map<String, String> map : list) {
			String driverLic = map.get("Driver License");
			click(pdetails.calendar);
			selectDdValue(pdetails.calMonth, map.get("ExpMonth"));
			selectDdValue(pdetails.calYear, map.get("ExpYear"));
			selectCalendarDate(pdetails.calDate, map.get("ExpDay"));
			String ssnNum = map.get("SSN Number");
			String sinNum = map.get("SIN Number");
			String gender = map.get("Gender");
			click(pdetails.calendarDob);
			selectDdValue(pdetails.calMonth, map.get("DobMonth"));
			selectDdValue(pdetails.calYear, map.get("DobYear"));
			selectCalendarDate(pdetails.calDate, map.get("DobDay"));
			String maritalStatus = map.get("Marital Status");
			String nationality = map.get("Nationality");
			String nickName = map.get("Nick Name");
			String militaryService = map.get("Military Service");

			sendText(pdetails.licenNo, driverLic);
			sendText(pdetails.sscNo, ssnNum);
			sendText(pdetails.sinNo, sinNum);
			
			clickRadioOrCheckBox(pdetails.genderRadioGroup, gender);
			selectDdValue(pdetails.maritalStat, maritalStatus);
			selectDdValue(pdetails.nationalityDD, nationality);
			sendText(pdetails.nickName, nickName);
			sendText(pdetails.military, militaryService);
			jsClick(pdetails.smoke);
			takeScreenshot("personalDetails");
		}
	}

	@Then("user click save button")
	public void user_click_save_button() {
		click(pdetails.edit_safeBtn);
	}

	@Then("personal details is added successfully")
	public void personal_details_is_added_successfully() {
		takeScreenshot("personalDetails");
	}
}