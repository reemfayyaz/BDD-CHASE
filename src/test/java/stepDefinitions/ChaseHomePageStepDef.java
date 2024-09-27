package stepDefinitions;


import io.cucumber.java.en.Given;
import nysoftusa.configuration.common.WebTestBase;
import nysoftusa.pages.ChaseHomePage;

import static nysoftusa.configuration.common.GlobalReUsableMethods.clickOnElementByXpath;
import static nysoftusa.webelements.ChaseHomePageWebElement.englishLanguageWebElement;
import static nysoftusa.webelements.ChaseHomePageWebElement.spanishLanguageWebElement;


public class ChaseHomePageStepDef extends WebTestBase {

    ChaseHomePage chaseHomePage;

    @Given("user landed on chase home page")
    public void user_landed_on_chase_home_page() {
        chaseHomePage=new ChaseHomePage();
        System.out.println("Successfully landed on Chase, Welcome Aboard");
    }

    @Given("user check the Chase Logo is displayed")
    public void user_check_the_chase_logo_is_displayed() {

        chaseHomePage=new ChaseHomePage();
        chaseHomePage.chaseLogo.isDisplayed();
       boolean logo= chaseHomePage.chaseLogo.isDisplayed();
       System.out.println(logo);

    }

    @Given("user click on Chase logo icon")
    public void user_click_on_chase_logo_icon() {
        chaseHomePage=new ChaseHomePage();
        chaseHomePage.ChaseLogoFunctionality();
        String logo= String.valueOf(chaseHomePage.chaseLogo);
        getLog(logo);
    }

    @Given("user click on Spanish language")
    public void user_click_on_spanish_language() {
        chaseHomePage=new ChaseHomePage();
        chaseHomePage.spanish.click();
    }

    @Given("user click on English language")
    public void user_click_on_english_language() {
        chaseHomePage=new ChaseHomePage();
        chaseHomePage.english.click();
    }

    @Given("user verify the logo and language functionality is working properly")
    public void user_verify_the_logo_and_language_functionality_is_working_properly() {
        chaseHomePage=new ChaseHomePage();
    }





}
