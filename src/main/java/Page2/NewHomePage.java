package Page2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class NewHomePage {

    WebDriver driver;
    private NewResultsPage newresultspage;

    @FindBy(xpath="//input[@type='text']")
    WebElement txtBox;

    public NewHomePage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public NewResultsPage entersTxtAndSearch(String txt) {
        txtBox.sendKeys(txt);
        txtBox.sendKeys(Keys.ENTER);
        return newresultspage;
    }
}