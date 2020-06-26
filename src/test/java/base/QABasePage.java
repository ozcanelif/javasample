package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QABasePage {
    WebDriver driver;

    public QABasePage(WebDriver driver) {

        this.driver = driver;
    }



    public void clickBy(By by) {
        WebElement Element = driver.findElement(by);
        Element.click();
    }

    public void write(String ID, String Key) {
        WebElement Element = driver.findElement(By.id(ID));
        Element.click();
        Element.clear();
        Element.sendKeys(Key);
    }
}

