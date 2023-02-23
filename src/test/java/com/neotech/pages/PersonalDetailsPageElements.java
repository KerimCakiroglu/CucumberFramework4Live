package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods {

	@FindBy(id = "pimPersonalDetailsForm")
	public WebElement personalDetailsForm;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "pim.navbar.employeeName")
	public WebElement employeeName;

	@FindBy(id = "licenseNo")
	public WebElement licenseNrBox;

	@FindBy(id = "select-options-f4a0328c-dd05-e77b-88ef-6859ea288bce")
	public WebElement nationality;

	@FindBy(id = "select-options-f3474c2f-89d2-e561-4970-50e4c65baf8c")
	public WebElement gender;

	@FindBy(xpath = "//button[@type='submit']")
	public WebElement saveButton;

	@FindBy(id = "smoker")
	public WebElement smoker;

	@FindBy(id = "P1604189895_root")
	public WebElement datePicker;

	public PersonalDetailsPageElements() {
		PageFactory.initElements(driver, this);
	}
}
