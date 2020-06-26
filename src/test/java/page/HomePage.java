package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) throws InterruptedException {
        super(driver);
        clickBy(By.cssSelector("div.content>span.closeBtn"));
        Thread.sleep(3000);

    }
    public HomePage selectCat(int CatIndex) {
        driver.findElement(By.xpath("//nav[@class='catMenu']/ul/li[" + CatIndex + "]")).click();
        WebDriverWait waiter = new WebDriverWait(driver, 30);
return this;

    }

    public HomePage selectSubCat(int SubCatIndex) {
        WebDriverWait waiter = new WebDriverWait(driver, 30);
        driver.findElement(By.xpath("//li[@class='mainCat'][" + SubCatIndex + "]")).click();
return this;
    }

    public LoginPage callLoginPage() {
        clickBy(By.className("btnSignIn"));
        return new LoginPage(driver);
    }

}




