package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.junit.Assert; 




public class Login_Page extends BasePage{

	public @FindBy(xpath = "//*[@id=\"email\"]")WebElement Textfield_Email;
	public @FindBy(xpath = "//*[@id=\"pass\"]")WebElement Textfield_Password;
	public @FindBy(name = "login")WebElement button_login;
	public @FindBy(xpath = "//*[@id=\"js_6\"]")WebElement button_homepage;
	
	public Login_Page() throws IOException {
		super();
		
	}
	
	public Login_Page getloginpage() throws IOException {
		getDriver().get("https://facebook.com");
		return new Login_Page();
		
	}
	
	public Login_Page sendEmail(String email) throws Exception {
		sendKeysToWebElement(Textfield_Email, email);
		return new Login_Page();
		
	}
	
	public Login_Page sendPassword(String password) throws Exception {
		sendKeysToWebElement(Textfield_Password, password);
		return new Login_Page();
		
	}
	
	public Login_Page clicklogin() throws Exception {
		waitAndClickElement(button_login);
		//getDriver().findElement(By.name("login")).click();
		return new Login_Page();
		
	}
	public Login_Page verifylogin() throws Exception {
		WebElement profile = getDriver().findElement(By.xpath("//*[@id=\"js_6\"]"));
		WaitUntilWebElementIsVisible(button_homepage);
		Assert.assertEquals(true, profile.isDisplayed());
		
		return new Login_Page();
		
	}
	

}
