package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingPage {
    WebDriver driver;
    WebDriverWait wait;

    private OscarsPage oscarsPage;

    @FindBy(className ="ipc-button__text")
    WebElement menuBtn;

    @FindBy(xpath="//div[@role='presentation'][2]")
    WebElement awardsandeventsFrame;

    public LandingPage(WebDriver driver) {
        this.driver= driver;
        PageFactory.initElements(driver, this);
    }

    public LandingPage clickMenuBtn() {
        menuBtn.click();
        return this;
    }

    public OscarsPage clickOscars() {
        WebElement oscars = awardsandeventsFrame.findElement(By.xpath("//a[@href='/oscars/?ref_=nv_ev_acd']"));
        wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(oscars)).click();
        return oscarsPage;
    }
}
