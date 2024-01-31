package lt.techin.login.praktinis;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class LoginPage extends BasePage {

    @FindBy(css = "p:nth-of-type(1)")
    private WebElement userName;

    @FindBy(css = "input[name='username']")
    WebElement inputName;

    @FindBy(css = "p:nth-of-type(2)")
    WebElement userPassword;

    @FindBy(css = "input[name='password']")
    WebElement inputPassword;


    @FindBy(css = ".orangehrm-login-button")
    WebElement pushLogin;

    @FindBy(css = "h6:first-child")
    WebElement checkName;



    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public String loginName() {
        return userName.getText().substring(userName.getText().lastIndexOf(" ") + 1);
    }

    public void pasteNameToInput(String username) {
        inputName.sendKeys(username);
    }

    public String loginPassword() {
        return userPassword.getText().substring(userPassword.getText().lastIndexOf(" ") + 1);
    }

    public void enterPassword(String userpassword) {
        inputPassword.sendKeys(userpassword);
    }

    public void clickLogin() {
        pushLogin.click();
    }

    public String checkNameValue() {
        return checkName.getText();
    }

    public void pageWait() {
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}
