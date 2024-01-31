package lt.techin.login.praktinis;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LogingTest extends BaseTest {

    @Test
    void loginToPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        String username = loginPage.loginName();
        loginPage.pasteNameToInput(username);
        String userpassword = loginPage.loginPassword();
        loginPage.enterPassword(userpassword);
        loginPage.clickLogin();
        String actual = loginPage.checkNameValue();
        Assertions.assertEquals("Dashboard", actual);
        loginPage.checkNameValue();

    }

}
