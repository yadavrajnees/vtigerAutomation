package com.rk_softwear_services.vtigerAutomation.TestScripts;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rk_softwear_services.vtigerAutomation.Marketing.Accounts.MarketingAccountDuplicatingPage;
import com.rk_softwear_services.vtigerAutomation.Marketing.Accounts.MarketingAccountEditingPage;
import com.rk_softwear_services.vtigerAutomation.Marketing.Accounts.MarketingAccountInformationPage;
import com.rk_softwear_services.vtigerAutomation.Marketing.Accounts.MarketingAccountLeandingPage;
import com.rk_softwear_services.vtigerAutomation.Marketing.Accounts.MarketingCreatingNewAccountPage;



public class MarketingAccountsTestScript extends BaseClass{
	private MarketingAccountLeandingPage marketingAccountLeandingPage;
	private MarketingCreatingNewAccountPage marketingCreatingNewAccountPage;
	private MarketingAccountInformationPage marketingAccountInformationPage;	
	private MarketingAccountEditingPage marketingAccountEditingPage;
	private MarketingAccountDuplicatingPage marketingAccountDuplicatingPage;
	
	@DataProvider(name="creating new account information")
	public Object[][] testCaseData() {
		String[] dataArray1=new String[5];
		dataArray1[0]="Rajnish";
		dataArray1[1]="6387911611";
		dataArray1[2]="rajneeshkumar9978@gmail.com";
		dataArray1[3]="kanpur";
		dataArray1[4]="i am tester";
		
		String[] dataArray2=new String[5];
		dataArray2[0]="prabhat";
		dataArray2[1]="123456789";
		dataArray2[2]="pr56@gmail.com";
		dataArray2[3]="gazipur";
		dataArray2[4]="i am electrical";
		
		String[][] dblDataArray1 =	new String[2][5];
		dblDataArray1[0]=dataArray1;
		dblDataArray1[1]=dataArray2;
		return dblDataArray1;
		
	}
	
	
	@Test(dataProvider = "creating new account information")
	public void verifyVT001CreateAccountTestScript(String accountName,String phone,String email,String billingAddress,String description) throws InterruptedException {
		
		
			
			getWebUtil().printMessage("verifyVT001CreateAccountTestScript is Started");
			getCommonMethod().goToMarketingAccountLink();
			marketingAccountLeandingPage=new MarketingAccountLeandingPage(getWebUtil());
			marketingAccountLeandingPage.createNewAccountPlusButton();
			marketingCreatingNewAccountPage=new MarketingCreatingNewAccountPage(getWebUtil());
			String achualName=marketingCreatingNewAccountPage.filapCreatingNewAccountBasicInformationForm(accountName,phone,email,billingAddress,description);
			marketingCreatingNewAccountPage.saveButton();
			marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());
			getWebUtil().myThread(5000);
			getCommonMethod().goToMarketingAccountLink();
			marketingAccountLeandingPage.innerTextOfSearchedElement(achualName, "accountname");
			getWebUtil().verifyString(achualName, "Rajnish");
			getWebUtil().printMessage("verifyVT001CreateAccountTestScript is Closed");
		}
		

	//@Test(dataProvider = "creating new account information")
	public void verifyVT002EditAccountTestScript(String accountName,String phone,String email,String billingAddress,String description) {
		getWebUtil().printMessage("verifyVT002EditAccountTestScript is Started");
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage=new MarketingAccountLeandingPage(getWebUtil());
		marketingAccountLeandingPage.createNewAccountPlusButton();
		marketingCreatingNewAccountPage=new MarketingCreatingNewAccountPage(getWebUtil());
		marketingCreatingNewAccountPage.filapCreatingNewAccountBasicInformationForm(accountName,phone,email,billingAddress,description);
		marketingCreatingNewAccountPage.saveButton();
		marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());	
		marketingAccountInformationPage.clickEditButton();
		marketingAccountEditingPage=new MarketingAccountEditingPage(getWebUtil());
		String achualName=marketingAccountEditingPage.filapCreatingNewAccountBasicInformationForm("sohan");
		marketingAccountEditingPage.saveButton();
		marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());
		getWebUtil().myThread(5000);
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage.innerTextOfSearchedElement(achualName, "accountname");
		getWebUtil().verifyString(achualName, "Rajnish");
		getWebUtil().printMessage("verifyVT002EditAccountTestScript is Closed");
		
	}
	//@Test(dataProvider = "creating new account information")
	public void verifyVT003DuplicateAccountTestScript(String accountName,String phone,String email,String billingAddress,String description) {
		getWebUtil().printMessage("verifyVT003DuplicateAccountTestScript is Started");
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage=new MarketingAccountLeandingPage(getWebUtil());
		marketingAccountLeandingPage.createNewAccountPlusButton();
		marketingCreatingNewAccountPage=new MarketingCreatingNewAccountPage(getWebUtil());
		marketingCreatingNewAccountPage.filapCreatingNewAccountBasicInformationForm(accountName,phone,email,billingAddress,description);
		marketingCreatingNewAccountPage.saveButton();
		marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());	
		marketingAccountInformationPage.clickDuplicateButton();
		marketingAccountDuplicatingPage=new MarketingAccountDuplicatingPage(getWebUtil());
		String achualName=marketingAccountDuplicatingPage.filapCreatingNewAccountBasicInformationForm("mohan");
		marketingAccountDuplicatingPage.saveButton();
		marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());
		getWebUtil().myThread(5000);
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage.innerTextOfSearchedElement(achualName, "accountname");
		getWebUtil().verifyString(achualName, "prabhat");
		getWebUtil().printMessage("verifyVT003DuplicateAccountTestScriptt is Closed");
	}
	//@Test(dataProvider = "creating new account information")
	public void verifyVT004DeleteAccountTestScript(String accountName,String phone,String email,String billingAddress,String description) {
		getWebUtil().printMessage("verifyVT00DeleteAccountTestScript is Started");
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage=new MarketingAccountLeandingPage(getWebUtil());
		marketingAccountLeandingPage.createNewAccountPlusButton();
		marketingCreatingNewAccountPage=new MarketingCreatingNewAccountPage(getWebUtil());
		String achualName=marketingCreatingNewAccountPage.filapCreatingNewAccountBasicInformationForm(accountName,phone,email,billingAddress,description);
		marketingCreatingNewAccountPage.saveButton();
		marketingAccountInformationPage=new MarketingAccountInformationPage(getWebUtil());
		marketingAccountInformationPage.clickDeleteButton();
		getWebUtil().popUpAccept();
		getWebUtil().myThread(5000);
		getCommonMethod().goToMarketingAccountLink();
		marketingAccountLeandingPage.innerTextOfSearchedElement(achualName, "accountname");
		getWebUtil().verifyString(achualName, "Rajnish");
		getWebUtil().printMessage("verifyVT00DeleteAccountTestScript is Closed");
	}
	
}






