package scenario;

import base.BaseTest;
import org.junit.Test;
import page.BasketPage;
import page.HomePage;
import page.PaymentPage;
import page.ProductDetailPage;


public class LoginTest extends BaseTest {

    @Test
    public void n11TestCases() throws InterruptedException {

        new HomePage(driver)
                .selectCat(3)
                .selectSubCat(5)
                .callLoginPage()
                .login("elif.ozcan@n11.com", "Elif1158");
        Thread.sleep(3000);

        new ProductDetailPage(driver)
                .selectProduct(11)
                .addToBasket();
        Thread.sleep(3000);

        new BasketPage(driver).addNewAdress("elif özcan","İstanbul","Eyüp",
                "Alibeyköy","skdfjsk fskdjfs 24","5342424242",
                "43028029288","ev67");
        new BasketPage(driver).clickBuyButton();

        new PaymentPage(driver).setCreditCardInfo("1234","5678","1435","8900",
                 "kamil öztop","3","2022","123");



    }



}
