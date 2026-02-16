package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {


   public static final String baseURL= PropertiesLoader.loadProperty("url");

    public LoginPage clickOnLoginIcon() {

        $(".headerElement__icon--login").click();

        return Selenide.page(LoginPage.class);
    }

    private SelenideElement  acceptAll=$("[data-accept-action='all']");

    public HomePage acceptCookies() {

        if(acceptAll.exists())
        {
           acceptAll.click();
        }
     return Selenide.page(this);
    }

    public LoginPage clickOnUserStatus() {


        $(".headerElement__status--login").click();

        return Selenide.page(LoginPage.class);
    }


    private static final String categoryNumber=PropertiesLoader.loadProperty("category");
    public ItemPage clickOnCategory() {

        $(".section:nth-child(4) div:nth-child(3) a:nth-child("+categoryNumber+")").click();
        return Selenide.page(ItemPage.class);
    }
}
