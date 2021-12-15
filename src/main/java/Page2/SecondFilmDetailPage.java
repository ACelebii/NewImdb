package Page2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondFilmDetailPage {

    WebDriver driver;
    private NewHomePage newhomepage;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//div[@class='ipc-metadata-list-item__content-container']")
    WebElement directorTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement writerTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement starsTxt;

    @FindBy(id="home_img_holder")
    WebElement imdbHomeBtn;

    public SecondFilmDetailPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public SecondFilmDetailPage scrollDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        return this;
    }

    public WebElement saveDirectorsText() {
        directorTxt.getText();
        return directorTxt;
    }

    public WebElement saveWritersText() {
        writerTxt.getText();
        return writerTxt;
    }

    public WebElement saveStarsText() {
        starsTxt.getText();
        return starsTxt;
    }

    public NewHomePage clickImdbHomeBtn() throws InterruptedException {
        Thread.sleep(2000);
        imdbHomeBtn.click();
        return newhomepage;
    }
}
