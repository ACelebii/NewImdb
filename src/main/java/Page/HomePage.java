package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;

    private ResultsPage resultsPage;

    @FindBy(xpath = "//input[@type='text']")
    WebElement txtBox;

    @FindBy(id = "suggestion-search-button")
    WebElement searchBtn;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public HomePage entersTxt(String txt) {
        txtBox.sendKeys(txt);
        return this;
    }

    public ResultsPage goResultPage() {
        searchBtn.click();
        return resultsPage;
    }
}
