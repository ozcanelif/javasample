package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage {
    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public ProductDetailPage selectProduct(int productIndex) {
        driver.findElement(By.cssSelector("#view > ul > li:nth-of-type(" + productIndex + ") .pro a")).click();
        return this;
    }

    public void addToBasket() {
        clickBy(By.cssSelector("div.btnHolder> a:nth-of-type(2)"));
    }

}
