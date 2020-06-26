package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage extends BasePage {
    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void setCreditCardInfo(String cardNumber1, String cardNumber2, String cardNumber3,
                                  String cardNumber4, String fullname, String month
            , String year, String cvv) {
        setBy(By.cssSelector("div.creditCardField>div>input:nth-of-type(2)"), cardNumber1);
        setBy(By.cssSelector("div.creditCardField>div>input:nth-of-type(3)"), cardNumber2);
        setBy(By.cssSelector("div.creditCardField>div>input:nth-of-type(4)"), cardNumber3);
        setBy(By.cssSelector("div.creditCardField>div>input:nth-of-type(5)"), cardNumber4);
        setById("cardOwnerName", fullname);
        selectFromDropDown("expireMonth", month);
        selectFromDropDown("expireYear", year);
        setById("securityCode", cvv);
    }
}
