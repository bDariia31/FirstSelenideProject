package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import de.sconto.utils.PropertiesLoader;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    private static final String validEmail= PropertiesLoader.loadProperty("valid.email");
    private static final String validPassword= PropertiesLoader.loadProperty("valid.password");

    public LoginPage enterData() {


        $("#loginEmail").shouldBe(Condition.visible).val(validEmail);// ввод данных(val) с ожиданием(shouldBe)
        $("#loginPassword").val(validPassword);//метод для ввода данных
        return Selenide.page(this);
    }

    public HomePage clickOnAnmelden() {

        $("#login-submit").click();
        return Selenide.page(HomePage.class);
    }
}
