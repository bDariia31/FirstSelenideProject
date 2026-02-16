package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.CartPage;
import de.sconto.pages.HomePage;
import de.sconto.pages.ItemPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ItemSteps {

    HomePage home;
    ItemPage item;
    CartPage cart;

    @And("User clicks on first category")
    public void clicks_on_category()
    {
        home= Selenide.page(HomePage.class);
        home.clickOnCategory();
    }

    @And("User clicks on first item")
    public void click_on_item()
    {
        item=Selenide.page(ItemPage.class);
        item.clickOnItem();
    }

    @And("User adds item to cart")
    public void adds_item_to_cart()
    {
        cart=Selenide.page(CartPage.class);
        cart.clickOnWarenkorb().enterPLZ();
    }

    @And("User clicks on Zum Warenkorb button")
    public void clicks_on_Zum_Warenkorb()
    {
        cart=Selenide.page(CartPage.class);
        cart.clickOnZumWarenkorb();
    }


    @Then("User verifies item name is in the cart")
    public void verify_item_name_in_cart()
    {
        cart=Selenide.page(CartPage.class);
        cart.verifyItemName();

    }


}
