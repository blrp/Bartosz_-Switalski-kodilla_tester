package pages;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleResults extends AbstractPage {

    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;                // [2]

    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }

    public void iSeeResults() {
        System.out.println("I see results");
        System.out.println("Number of results: " + results.size());
    }
    public WebElement oneRandomResult(){
        Random random = new Random();
        int randomPageId = random.nextInt(results.size());
        WebElement webElement = results.get(randomPageId);
        System.out.println(webElement.getTagName());
        System.out.println(webElement);
        return results.get(randomPageId);
    }
}