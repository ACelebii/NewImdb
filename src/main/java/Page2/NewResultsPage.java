package Page2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NewResultsPage {

    WebDriver driver;
    WebDriverWait wait;
    private NewSecondFilmDetailPage newsecondfilmdetailpage;

    @FindBy(partialLinkText="The Jazz Singer")
    WebElement filmTitle;

    public NewResultsPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public NewSecondFilmDetailPage goToNewFilmDetailPage() {
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(filmTitle)).click();
        return newsecondfilmdetailpage;
    }
}