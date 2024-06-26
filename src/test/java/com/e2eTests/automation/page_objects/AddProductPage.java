package com.e2eTests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTests.automation.utils.BasePage;
import com.e2eTests.automation.utils.Setup;

public class AddProductPage extends BasePage {


	@FindBy(how = How.XPATH, using = "//a[@class='btn btn-primary']")
	private static WebElement btnAddNew;

	@FindBy(how = How.ID, using = "Name")
	private static WebElement productName;

	@FindBy(how = How.ID, using = "ShortDescription")
	private static WebElement shortDescription;

	@FindBy(how = How.XPATH, using = "//button[@name='save']")
	private static WebElement btnSave;
	
	public AddProductPage() {
		super(Setup.getDriver());

	}

	public static WebElement getBtnAddNew() {
		return btnAddNew;
	}

	public static WebElement getProductName() {
		return productName;
	}

	public static WebElement getShortDescription() {
		return shortDescription;
}
	public static WebElement getBtnSave() {
		return btnSave;
	}
}
