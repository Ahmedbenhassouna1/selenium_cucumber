package com.e2eTests.automation.step_definitions;

import com.e2eTests.automation.page_objects.AddProductPage;

import io.cucumber.java.en.When;

public class AddProductStepDefinition {

	public AddProductPage addProductPage;

	public AddProductStepDefinition() {

		addProductPage = new AddProductPage();
		
	}
	
	@When("je clique sur le bouton Add New")
	public void jeCliqueSurLeBoutonAddNew() {
		AddProductPage.getBtnAddNew().click();

	}

	@When("Je saisis le nom du produit")
	public void jeSaisisLeNomDuProduit() {
		AddProductPage.getProductName().sendKeys("Iphone 15");
	}

	@When("Je saisis une description du produit {string}")
	public void jeSaisisUneDescriptionDuProduit(String string) {
		AddProductPage.getShortDescription().sendKeys("Iphone couleur violet");
	}

	@When("Je clique sur le bouton save")
	public void jeCliqueSurLeBoutonSave() {
		AddProductPage.getBtnSave().click();
	}

}