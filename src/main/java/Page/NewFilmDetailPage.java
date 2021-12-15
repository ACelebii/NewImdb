package Page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewFilmDetailPage {
    WebDriver driver;

    private PhotoGalleryPage photogallerypage;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//div[@class='ipc-metadata-list-item__content-container']")
    WebElement directorTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[2]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement writerTxt;

    @FindBy(xpath="//div[@data-testid='title-pc-wide-screen']//li[3]//div[@class='ipc-metadata-list-item__content-container']")
    WebElement starsTxt;

    @FindBy(xpath="//*[@class='ipc-title__text' and contains(text(), 'Photos')]")
    WebElement photosTitle;

    public NewFilmDetailPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement saveNewDirectorText() {
        directorTxt.getText();
        return directorTxt;
    }

        public WebElement saveNewWriterText() {
            writerTxt.getText();
            return writerTxt;
        }

        public WebElement saveNewStarText() {
            starsTxt.getText();
            return starsTxt;
        }

    public PhotoGalleryPage goToPhotos() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        photosTitle.click();
        return photogallerypage;
    }


}
