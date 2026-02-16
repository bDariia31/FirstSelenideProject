package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {



    public CartPage clickOnWarenkorb() {

        $("article[id='29404894'] a[class='css-18kt30a e2h2vgt19']").click();
        $("[data-testid='addToCartButton']").click();


        return Selenide.page(this);
    }

    public CartPage enterPLZ() {

        $("#zipCode").val("48653");
        $("div[class='css-vxzmxr euirqaf0'] button[type='button']").click();
        return Selenide.page(this);
    }

    public CartPage clickOnZumWarenkorb() {

        $(".eslcmh61.css-1r8nyzz.ex1jt3d1").click();
        return Selenide.page(this);
    }


    private static final String titleItem= PropertiesLoader.loadProperty("title");


    public SelenideElement verifyItemName() {

       return $(".simpleText.simpleText--sizeArticleName").shouldHave(text(titleItem));


    }
}
