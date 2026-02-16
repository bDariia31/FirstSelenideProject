package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import de.sconto.utils.PropertiesLoader;
import io.cucumber.java.en.And;

import static com.codeborne.selenide.Selenide.$;

public class ItemPage {

    private static final String itemNumber= PropertiesLoader.loadProperty("item");

    public ItemPage clickOnItem() {


        $("li:nth-child("+itemNumber+")").click();
        return Selenide.page(this);
    }

}
