package scenario;

import base.QABaseTest;
import org.junit.Test;
import page.QARegisterPage;

public class QARegisterTest extends QABaseTest {

    @Test
    public void RegisterTest() {
        new QARegisterPage(driver).fillRegisterForm("Alper","Elif",
                "tadasdad@n11.com","123qweasd","123qweasd","N11");
        new QARegisterPage(driver).submitForm();

    }

}