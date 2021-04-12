package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");

        WebElement searchField = driver.findElement(By.cssSelector("#gh-cat-box>select"));
        Select categorySelect = new Select(searchField);
        categorySelect = new Select(searchField);
        categorySelect.selectByValue("293");


        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac-box2>input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li>h2")));


        List<WebElement> element = driver.findElements(By.cssSelector("div>ul[class*='srp-results srp-list clearfix']>li"));

        System.out.println("----------------------------------------");
        System.out.println("Ilość wyświetlonych produktów wynosi: " + element.size());
        System.out.println("----------------------------------------");
        System.out.println("Informacje o produkcie wyświetlonym jako pierwszy znajdują sie poniżej: " + "\n" + element.get(0).getText());
        System.out.println("----------------------------------------");

    }


}
