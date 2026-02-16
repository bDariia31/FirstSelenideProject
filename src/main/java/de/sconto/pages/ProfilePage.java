package de.sconto.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {


//  1 variant

//    public ProfilePage verifyUserName(String name)
//    {
//        $(".titleHeadline").shouldHave(text(name));
//        return Selenide.page(this);
//    }

    public SelenideElement verifyUserName(String name)
    {
        return  $(".titleHeadline").shouldHave(text(name));
    }

}
