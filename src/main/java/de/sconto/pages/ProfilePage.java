package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {

private static final String userName= PropertiesLoader.loadProperty("user.name");
//  1 variant

//    public ProfilePage verifyUserName(String name)
//    {
//        $(".titleHeadline").shouldHave(text(name));
//        return Selenide.page(this);
//    }

    public SelenideElement verifyUserName()
    {
        return  $(".titleHeadline").shouldHave(text(userName));
    }

}
