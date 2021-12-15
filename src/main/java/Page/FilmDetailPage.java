package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FilmDetailPage {
    WebDriver driver;

    private HomePage homepage;
    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//div[@class='ipc-metadata-list-item__content-container']")
    WebElement directorTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement writerTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement starsTxt;

    @FindBy(id="home_img_holder")
    WebElement imdbHomeBtn;

    public FilmDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement saveDirectorTxt(){
        directorTxt.getText();
        return directorTxt;
    }
    public WebElement saveWriterTxt() {
        writerTxt.getText();
        return writerTxt;
    }
    public WebElement saveStarsTxt() {
        starsTxt.getText();
        return starsTxt;
    }

    public HomePage clickImdbHomeBtn() throws InterruptedException {
        Thread.sleep(2000);
        imdbHomeBtn.click();
        return homepage;
    }


}
