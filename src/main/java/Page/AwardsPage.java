package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AwardsPage {
    WebDriver driver;

    private FilmDetailPage filmDetailPage;

    @FindBy(xpath = "//a[@href='/title/tt0018773/?ref_=ev_nom']")
    WebElement filmTitle;

    public AwardsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public AwardsPage scrollDownAndFindFilm() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,3250)");
        return this;
    }

    public FilmDetailPage clickFilmTitle() {
        filmTitle.click();
        return filmDetailPage;
    }
}
