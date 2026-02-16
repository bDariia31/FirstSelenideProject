package de.sconto.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.eo.Se;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public LoginPage enterData(String email, String password) {


        $("#loginEmail").shouldBe(Condition.visible).val(email);// ввод данных(val) с ожиданием(shouldBe)
        $("#loginPassword").val(password);//метод для ввода данных
        return Selenide.page(this);
    }

    public HomePage clickOnAnmelden() {

        $("#login-submit").click();
        return Selenide.page(HomePage.class);
    }
}
