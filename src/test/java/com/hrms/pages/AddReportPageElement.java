package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class AddReportPageElement {
	
	@FindBy(id= "report_report_name")
	public WebElement reportName;
	
	@FindBy(id= "report_criteria_list")
	public WebElement criteriaDD;
	
	@FindBy(id= "report_include_comparision")
	public WebElement comparisionDD;
	
	@FindBy(id= "employee_name_empName")
	public WebElement empName;
	
	@FindBy(id= "report_pay_grade")
	public WebElement payGrade;
	
	@FindBy(id= "report_education")
	public WebElement education;
	
	@FindBy(id= "report_display_groups")
	public WebElement displayGroup;
	
	@FindBy(id= "report_display_field_list")
	public WebElement displayField;
	
	@FindBy(id= "btnAddDisplayField")
	public WebElement btnAddDisplay;
	
	@FindBy(id= "display_group_1")
	public WebElement displayChBox;
	
		@FindBy(id= "btnSave")
	public WebElement saveBtn;
	
	@FindBy(id= "search-results")
	public WebElement reportVisibility; 
	
	public AddReportPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
