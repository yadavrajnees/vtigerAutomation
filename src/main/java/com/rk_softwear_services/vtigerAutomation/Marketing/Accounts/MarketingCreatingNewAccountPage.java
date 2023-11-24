package com.rk_softwear_services.vtigerAutomation.Marketing.Accounts;

import com.rk_softwear_services.vtigerAutomation.Marketing.objectRepository.MarketingOR;
import com.rk_softwear_services.vtigerAutomation.WebUtil.WebUtil;

public class MarketingCreatingNewAccountPage extends MarketingOR{

	private WebUtil utl;
	public MarketingCreatingNewAccountPage(WebUtil wu) {
		super(wu);
		this.utl=wu;
	}
	
	public String filapCreatingNewAccountBasicInformationForm(String accountName,String phone,String email,String billingAddress,String description) {
		
		
		utl.sendKeys(accountNameTB, accountName);
		utl.sendKeys(phoneTB, phone);
		utl.sendKeys(emailTB, email);
		utl.sendKeys(billingAddressTB, billingAddress);
//		utl.sendKeys(billingCityTB, "kanpur");
//		utl.sendKeys(billingCountryTB, dataArray[4]);
//		utl.sendKeys(billingPoBoxTB, dataArray[5]);
//		utl.sendKeys(billingPostalCodeTB, "po5656");
//		utl.sendKeys(billingStateTB, "utter pradesh");
		//utl.sendKeys(emailTB, "ankit23@gmail.com");
		utl.sendKeys(descriptionTB, description);
		return accountName;
	}
	
	public void filapCreatingNewAccountMoreInformationForm() {
		
	}
	
	public void saveButton() {
		utl.click(saveBT);
	}
	public void poUp() {
		try {
		utl.popUpAccept();
	}catch(Exception e) {
		utl.popUpDismiss();
	}
	}

}
