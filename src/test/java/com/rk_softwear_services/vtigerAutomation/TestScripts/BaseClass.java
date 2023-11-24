package com.rk_softwear_services.vtigerAutomation.TestScripts;

import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;
import com.rk_softwear_services.vtigerAutomation.common.pagesMethods.CommonPage;

import lombok.Getter;

@Getter
public class BaseClass {
	private WebUtil webUtil=WebUtil.createObject();
	private CommonPage commonMethod;
	
	private ExtentReports extent;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Extent-Report Initialization");
		extent=new ExtentReports();
		ExtentSparkReporter spark =	new ExtentSparkReporter("test-output/VtigerExtentReport.html");
		extent.attachReporter(spark);
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Connect To The Data Base");
	}
	
	@BeforeClass
	public void beforeClass() {
//		webUtil.launchBrowser();	
//		webUtil.goToHitUrl("http://localhost:8888/");
	}
	
	@Parameters({"username","userpassword"})
	@BeforeMethod
	public void beforeMethod(String username,String userpassword,Method mt) {
		ExtentTest extTest=extent.createTest(mt.getName());
		webUtil.setExtentTestObject(extTest);
		webUtil.launchBrowser();	
		webUtil.goToHitUrl("http://localhost:8888/");
		commonMethod=new CommonPage(webUtil);
		commonMethod.login(username,userpassword);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result,Method mt) {
		
		if(result.getStatus()==result.FAILURE) {
			String snapShotPath=webUtil.takeSnapShot(mt.getName());	
			webUtil.getExtentTestObject().addScreenCaptureFromPath(snapShotPath);
		}
		commonMethod.logout();
		extent.flush();
	}
	
	//@AfterClaas
	public void afterClass() {
		webUtil.myQuit();
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Disconnect From The Data Base");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Extent-Report Finalization");
		extent.flush();
	}
	
	
}
