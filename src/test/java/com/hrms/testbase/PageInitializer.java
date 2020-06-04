package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElement;
import com.hrms.pages.AddReportPageElement;
import com.hrms.pages.DashboardPageElement;
import com.hrms.pages.LoginPageElement;
import com.hrms.pages.PersonalDetailsPageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PageInitializer extends BaseClass{

		public static LoginPageElement login;
		public static AddEmployeePageElement addEmp;
		public static DashboardPageElement dashboard;
		public static PersonalDetailsPageElements pdetails;
		public static AddReportPageElement report;
		public static ViewEmployeePageElements viewEmp;
		public static void initialize() {
			
			login=new LoginPageElement();
			dashboard=new DashboardPageElement();
			addEmp=new AddEmployeePageElement();
			pdetails=new PersonalDetailsPageElements();
			report=new AddReportPageElement();
			viewEmp=new ViewEmployeePageElements();
		}
	}

