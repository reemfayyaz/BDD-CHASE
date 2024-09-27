package nysoftusa.pages;
import nysoftusa.configuration.common.WebTestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static nysoftusa.configuration.common.WebTestBase.driver;
import static nysoftusa.webelements.ChaseHomePageWebElement.*;

public class ChaseHomePage extends WebTestBase {

    @FindBy(xpath =chaseLogoWebElement  )
    public WebElement chaseLogo ;

    @FindBy(xpath =spanishLanguageWebElement  )
    public WebElement spanish ;

    @FindBy(xpath =englishLanguageWebElement  )
    public WebElement english ;



    public ChaseHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void ChaseLogoFunctionality() {
        chaseLogo.click();
    }
}
