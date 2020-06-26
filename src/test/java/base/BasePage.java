package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.HomePage;


public class BasePage {


        public WebDriver driver;

        public BasePage(WebDriver driver){
            this.driver = driver;
        }


        public void clickBy(By by){
            WebDriverWait waiter = new WebDriverWait(driver, 30);
            WebElement element = waiter.until(ExpectedConditions.elementToBeClickable(by));
            element.click();
        }

        public void setById(String id, String value){
            WebDriverWait waiter = new WebDriverWait(driver, 30);
            WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));

            element.click();
            element.clear();
            element.sendKeys(value);
        }

    public void typeById(String id, String value){
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        element.click();
        element.sendKeys(value);
    }
    public void selectFromDropDown(String id, String text) {
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement element = waiter.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
        Select select = new Select(element);
        select.selectByVisibleText(text);

    }
    public void setBy(By by, String text){
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        WebElement element = waiter.until(ExpectedConditions.elementToBeClickable(by));
        element.click();
        element.sendKeys(text);

    }
}


