package de.sconto.stepDefinitions;

import com.codeborne.selenide.Selenide;
import de.sconto.pages.HomePage;
import de.sconto.pages.LoginPage;
import de.sconto.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class LoginSteps {
    HomePage home;
    LoginPage login;
    ProfilePage profile;

    @Given("User is on HomePage")
    public void is_on_HomePage()
    {
        home=open("https://www.sconto.de",HomePage.class);
        getWebDriver().manage().window().maximize();
        home.acceptCookies(); //принимаем cookies

    }

    @When("User clicks on Login icon")
    public void click_on_login_icon()
    {
        home.clickOnLoginIcon();

    }


    @And("User enters correct data")
    public void enter_correct_data()
    {
        login= Selenide.page(LoginPage.class);
        login.enterData("maritest@gmail.com","Test1234$");
    }

    @And("User clicks on Anmelden button")
    public void clicks_on_Anmelden_button()
    {
        login.clickOnAnmelden();
    }

    @And("User clicks on User status")
    public void clicks_on_User_status()
    {
        home=Selenide.page(HomePage.class);
        home.clickOnUserStatus();
    }

@Then("User verifies his name is displayed")
    public void verify_user_name()
{
    profile=Selenide.page(ProfilePage.class);
    profile.verifyUserName("Mariia Testova");
}

}
