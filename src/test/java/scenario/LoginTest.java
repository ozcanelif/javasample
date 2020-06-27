package scenario;

import base.BaseTest;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.BasketPage;
import page.HomePage;
import page.PaymentPage;
import page.ProductDetailPage;

import java.util.ArrayList;
import java.util.List;


public class LoginTest extends BaseTest {

    @Test
    public void n11TestCases() throws InterruptedException {

        new HomePage(driver)
                .selectCat(3)
                .selectSubCat(5)
                .callLoginPage()
                .login("elif.ozcan@n11.com", "123qwe*");
        Thread.sleep(3000);

        new ProductDetailPage(driver)
                .selectProduct(11)
                .addToBasket();
        Thread.sleep(3000);

        new BasketPage(driver).addNewAdress("elif özcan","İstanbul","Eyüp",
                "Alibeyköy","skdfjsk fskdjfs 24","5342424242",
                "52825139106","ev67").clickBuyButton();

        new PaymentPage(driver).setCreditCardInfo("1234","5678","1435","8900",
                 "kamil öztop","3","2022","123");



    }





}
