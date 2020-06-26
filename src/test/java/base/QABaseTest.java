package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QABaseTest {

    public WebDriver driver;

    @Before
    public void Basic() {
        System.setProperty(
                "webdriver.chrome.driver", "src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://qa.n11.com/");
    }

    @After
    public void close() {
        driver.quit();
    }

}
