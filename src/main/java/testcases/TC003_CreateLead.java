package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC003_End to End CreatLead";
		testDescription="End to End CreatLead";
		testNodes="Leads";
		category="Smoke";
		authors="Karthick";
		browserName="chrome";
		dataSheetName="TC003";
	}	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String Fname, String Lname, String CName) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickCrmsfa()
		.clickLead()
		.clickcreateLeadFirst()
		.typeFirstName(Fname)
		.typeLastName(Lname)
		.typeCompName(CName)
		.clickCreateLead()
		.verifyFirstname();
		
	}
}
