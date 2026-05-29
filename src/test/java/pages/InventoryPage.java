package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
WebDriver driver ;

By addToCartBtn = By.id("add-to-cart-sauce-labs-backpack");
By cartIcon = By.className("shopping_cart_link");

public  InventoryPage(WebDriver driver ) {
		this.driver = driver;
		
}

public void addProductsToCart() {
	driver.findElement(addToCartBtn).click();
	
}

public void goToCart() {
	driver.findElement(cartIcon).click();
}

}
