package page;

import base.QABasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QARegisterPage extends QABasePage {
    public QARegisterPage(WebDriver driver) {
        super(driver);
    }

    public void fillRegisterForm(String name, String surname, String email,
                                 String password, String passwordAgain, String key) {
        clickBy((By.className("btnSignUp")));
        clickBy((By.cssSelector("div.popupFooter>a")));
        write("firstName", name);
        write("lastName", surname);
        write("registrationEmail", email);
        write("registrationPassword", password);
        write("passwordAgain", passwordAgain);
        clickBy(By.className("genderArea-two-line"));
        clickBy(By.xpath("//div[9]//div[1]//label[1]"));
        clickBy(By.xpath("//label[contains(text(),'mla pazarlama ve tan')]"));
        write("captchaText", key);

    }

    public void submitForm() {

        clickBy(By.id("submitButton"));

    }
}

