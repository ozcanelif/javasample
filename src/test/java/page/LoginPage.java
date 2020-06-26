package page;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class LoginPage extends BasePage{

        public LoginPage(WebDriver driver) {
            super(driver);
        }

        public LoginPage login(String username, String password){
            setById("email", username);
            setById("password", password);
            clickBy(By.id("loginButton"));

            return this;
        }

    }


