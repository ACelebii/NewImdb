package Page2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Page.LandingPage;


public class SecondLandingPage {

    WebDriver driver;
    WebDriverWait wait;

    private AllEventsPage alleventspage;

    @FindBy(className="ipc-button__text")
    WebElement menuBtn;

    public SecondLandingPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public SecondLandingPage clickMenuBtn() {
        menuBtn.click();
        return this;
    }

    public AllEventsPage clickAllEventsLink() {
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("All Events"))).click();
        return alleventspage;
    }

}
