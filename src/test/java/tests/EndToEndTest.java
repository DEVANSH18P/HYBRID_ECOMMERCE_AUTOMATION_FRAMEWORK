package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;

public class EndToEndTest extends BaseTest {

    @Test
    public void completeEcommerceFlowTest() {

        LoginPage login = new LoginPage(driver);

        InventoryPage inventory = new InventoryPage(driver);

        CartPage cart = new CartPage(driver);

        CheckoutPage checkout = new CheckoutPage(driver);

        // Login
        login.login("standard_user", "secret_sauce");

        // Add product
        inventory.addProductsToCart();

        // Go to cart
        inventory.goToCart();

        // Checkout
        cart.clickCheckout();

        // User details
        checkout.enterDetails(
                "Devansh",
                "Pradhan",
                "248001"
        );

        // Finish order
        checkout.finishOrder();

        // Validation
        Assert.assertTrue(
                checkout.isOrderConfirmed()
        );

        System.out.println("Order placed successfully");
    }
}