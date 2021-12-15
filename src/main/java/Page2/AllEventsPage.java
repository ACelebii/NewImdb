package Page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllEventsPage {

    WebDriver driver;
    private Page2.GrammyAwardsPage grammyAwardsPage;

    @FindBy(xpath="//div[@id='event-list']//a[@title='Grammy Awards']")
    WebElement titleGrammyAwards;

    public AllEventsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public Page2.GrammyAwardsPage goToGrammyAwards() throws InterruptedException {
        Thread.sleep(3000);
        titleGrammyAwards.click();
        return grammyAwardsPage;
    }
}