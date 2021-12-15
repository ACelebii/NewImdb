package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ResultsPage {
    WebDriver driver;
    WebDriverWait wait;

    private NewFilmDetailPage newFilmDetailPage;

    @FindBy(partialLinkText="Şarlo Sirkte")
    WebElement filmTitle;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public NewFilmDetailPage goToNewFilmDetailPage() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(filmTitle)).click();
        return newFilmDetailPage;
    }
}
