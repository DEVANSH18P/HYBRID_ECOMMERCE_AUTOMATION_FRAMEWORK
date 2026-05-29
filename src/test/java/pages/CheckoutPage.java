package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	

	    WebDriver driver;

	    By firstName = By.id("first-name");
	    By lastName = By.id("last-name");
	    By postalCode = By.id("postal-code");

	    By continueBtn = By.id("continue");
	    By finishBtn = By.id("finish");

	    By confirmationMsg = By.className("complete-header");

	    public CheckoutPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void enterDetails(String fName, String lName, String pin) {
	        driver.findElement(firstName).sendKeys(fName);
	        driver.findElement(lastName).sendKeys(lName);
	        driver.findElement(postalCode).sendKeys(pin);
	        driver.findElement(continueBtn).click();
	    }

	    public void finishOrder() {
	        driver.findElement(finishBtn).click();
	    }

	    public boolean isOrderConfirmed() {
	        return driver.findElement(confirmationMsg).isDisplayed();
	    }
}
