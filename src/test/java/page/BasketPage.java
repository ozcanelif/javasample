package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
        driver.get("https://n11.com/sepetim");
    }
    public BasketPage addNewAdress(String fullname, String cityName, String districtName,
                             String neighborhoodName, String adressDetail, String phoneNumber,
    String identityNo,String addressName) throws InterruptedException {
        clickBy(By.xpath("//div[8]//div[2]//p[1]"));
        setById("fullName",fullname);
        selectFromDropDown("cityId",cityName);
        Thread.sleep(1000);
        selectFromDropDown("districtId", districtName);
        Thread.sleep(1000);
        selectFromDropDown("neighbourhoodId", neighborhoodName);
        setById("addressDetail",adressDetail);
        typeById("gsm", phoneNumber);
        setById("tcNO", identityNo);
        setById("addressName", addressName);
        clickBy(By.cssSelector("div.content >div.btnHolder>span"));
        return this;
    }

    public BasketPage clickBuyButton(){
        clickBy(By.id("js-goToPaymentBtn"));
        return this;
    }


}
