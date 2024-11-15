package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	//declaration
	@FindBy(id="gender-male")
	private WebElement MaleRadioButton;
	
	@FindBy(id="gender-female")
	private WebElement FemaleRadioButton;
	
	@FindBy(id="FirstName")
	private WebElement firstNameTextField;
	
	@FindBy(id="LastName")
	private WebElement lastNameTextField;
	
	@FindBy(id="Email")
	private WebElement emailTextField;
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confirmPasswordTextField;
	
	@FindBy(id="register-button")
	private WebElement registerButton;
	
	//Inialization
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
//getters
	public WebElement getMaleRadioButton() {
		return MaleRadioButton;
	}
	


	public WebElement getFemaleRadioButton() {
		return FemaleRadioButton;
	}
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getConfirmPasswordTextField() {
		return confirmPasswordTextField;
	}
	public WebElement getRegisterButton() {
		return registerButton;
	}
	
	
}
