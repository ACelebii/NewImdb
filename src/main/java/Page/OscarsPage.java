package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OscarsPage {
    WebDriver driver;
    private AwardsPage awardsPage;

    @FindBy(xpath="//a[@href='/event/ev0000003/1929/1/?ref_=acd_eh']")
    WebElement yearBtn;

    public OscarsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AwardsPage clickyearBtn() {
        yearBtn.click();
        return awardsPage;
    }

}
