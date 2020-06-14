package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;


public class PersonalDetailsPageElements {

	@FindBy(id="personal_cmbNation")
	public WebElement nationalityDD;
	
	@FindBy(xpath="//input[@name='personal[optGender]']") 
	public List<WebElement>genderRadioGroup;
	
	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement licenNo;

	@FindBy(id="personal_txtNICNo")
	public WebElement sscNo;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement sinNo;
	@FindBy(id="personal_txtLicExpDate")
	public WebElement calendar;
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> calDate;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	public WebElement calMonth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	public WebElement calYear;
	
	@FindBy(xpath="//select[@id='personal_cmbNation']/option")
	public List<WebElement> nation;
	
	@FindBy(id="personal_DOB")
	public WebElement calendarDob;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td")
	public List<WebElement> dobDay;
	
	@FindBy(xpath="//ul[@class='radio_list']/li")
	public List<WebElement> gender;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement maritalStat;
	
	@FindBy(id="profile-pic")
	public WebElement fullName;
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;
	
	@FindBy(id="personal_txtEmpNickName")
	public WebElement nickName;
	
	@FindBy(id="personal_txtMilitarySer")
	public WebElement military;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement smoke;
	
	@FindBy(id="btnAdd")
	public WebElement editBtn;
	
	@FindBy(id="btnSave")
	public WebElement edit_safeBtn;
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
}
