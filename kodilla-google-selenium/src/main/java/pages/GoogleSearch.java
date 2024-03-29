package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch extends AbstractPage {

    @FindBy(css = "input[title='Search']")
    static WebElement inputField;

    @FindBy(css = "input[value='GoogleSearch']")
    static List<WebElement> searchButton;
    private GoogleResults googleResults;

    public GoogleSearch(WebDriver driver) {
        super(driver);
    }

    public void searchResults() {
        PageFactory.initElements(driver, GoogleSearch.class);
        driver.switchTo().frame(0); //zamykamy zgody
        WebElement consentButton = driver.findElement(By.cssSelector("#introAgreeButton"));
        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.elementToBeClickable(consentButton)).click();
        inputField.sendKeys("Kodilla");
        googleResults = loadResults(driver);
        googleResults.iSeeResults();
    }

    public GoogleResults loadResults(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchButton.get(0))).click();
        GoogleResults googleResults = new GoogleResults(driver);
        return googleResults;
    }
}
