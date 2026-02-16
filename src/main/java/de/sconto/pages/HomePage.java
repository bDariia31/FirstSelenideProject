package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {


    public LoginPage clickOnLoginIcon() {

        $(".headerElement__icon--login").click();

        return Selenide.page(LoginPage.class);
    }

    public HomePage acceptCookies() {

        if($("[data-accept-action='all']").exists())
        {
            $("[data-accept-action='all']").click();
        }
     return Selenide.page(this);
    }

    public LoginPage clickOnUserStatus() {


        $(".headerElement__status--login").click();

        return Selenide.page(LoginPage.class);
    }
}
