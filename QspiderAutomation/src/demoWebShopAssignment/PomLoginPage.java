package demoWebShopAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomLoginPage {
@FindBy(linkText="Log in")
private WebElement LoginLink;

@FindBy(id="Email")
private WebElement emailTextField;

@FindBy(name="Password")
private WebElement passwordTextField;

@FindBy(id="RememberMe")
private WebElement rememberMeCheckBox;

@FindBy(partialLinkText ="Forgot password")
private WebElement forgotPasswordLink;

@FindBy(xpath = "//input[@value='Log in']")
private WebElement loginButton;

public PomLoginPage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getLoginLink() {
	return LoginLink;
}

public WebElement getEmailTextField() {
	return emailTextField;
}

public WebElement getPasswordTextField() {
	return passwordTextField;
}

public WebElement getRememberMeCheckBox() {
	return rememberMeCheckBox;
}

public WebElement getForgotPasswordLink() {
	return forgotPasswordLink;
}

public WebElement getLoginButton() {
	return loginButton;
}




}
