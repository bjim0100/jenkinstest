package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Profile_Page extends BasePage{
	public @FindBy(xpath ="//*[@id=\"email\"]") WebElement Textfield_email;
	public @FindBy(xpath ="//*[@id=\"password\"]") WebElement Textfield_password;
	public @FindBy(xpath ="//*[@id=\"submitButton\"]") WebElement button_login;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[1]/div[1]/div/input") WebElement Textfield_firstname;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[1]/div[2]/div/input") WebElement Textfield_lastname;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[2]/div[4]/div/input") WebElement Textfield_gps;
	public @FindBy(xpath = "//*[@id=\"datetimepicker1\"]/input") WebElement Textfield_dateofbirth;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[2]/div[2]/div/input") WebElement Textfield_address;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[2]/div/button") WebElement button_editprofile;
	public @FindBy(xpath = "sdsfdf") WebElement Textfield_message;
	public @FindBy(xpath ="//*[@id=\"__next\"]/div/div/div/div[3]/form/div[2]/div/div[1]/button") WebElement button_save;
	public @FindBy(xpath = "//*[@id=\"navbarNavDropdown\"]/ul/li/div/a[1]") WebElement button_profile;
	public @FindBy(xpath = "//*[@id=\"exampleFormControlSelect1\"]") WebElement dropdown_privacylevel;
	public @FindBy(linkText = "James Asafuah") WebElement button_profilename;
	public @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[1]/div[3]/div/input") WebElement Textfield_profileEmail;
	public @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[3]/form/div[1]/div[1]/div[4]/div/input") WebElement Textfield_number;
	public @FindBy(id = "inlineRadio2") WebElement radiobutton_female;
	
	
	public Profile_Page() throws IOException {
		super();
		
	}
	
	public Profile_Page getmarketcircle() throws Exception   {
		getDriver().get("http://20.52.44.20/auth/login");
	return new Profile_Page();	
}
	
	public Profile_Page enteremail() throws Exception   {
		sendKeysToWebElement(Textfield_email, "james@frontend.com");
	return new Profile_Page();	
}
	
	public Profile_Page enterpassword() throws Exception   {
		sendKeysToWebElement(Textfield_password, "passw0rd1");
	return new Profile_Page();	
}
	
	
	
	public Profile_Page clicklogin() throws Exception   {
		waitAndClickElement(button_login);
	return new Profile_Page();	
}
	
	public Profile_Page clickprofilename() throws Exception {
		waitAndClickElement(button_profilename);
		//getDriver().findElement(By.linkText("James Asafuah")).click();
		return new Profile_Page();
	}
	public Profile_Page clickprofile() throws Exception   {
		waitAndClickElement(button_profile);
	return new Profile_Page();	
}
	public Profile_Page clickeditprofile() throws Exception   {
		waitAndClickElement(button_editprofile);
	return new Profile_Page();	
}


	
	
	
	
	public Profile_Page enterFirstname(String firstname) throws Exception   {
			sendKeysToWebElement(Textfield_firstname, firstname);
		return new Profile_Page();
		
	}

	public Profile_Page enterLastname(String lastname) throws Exception   {
		sendKeysToWebElement(Textfield_lastname, lastname);
	return new Profile_Page();
	
}
	public Profile_Page enteraddress(String address) throws Exception   {
		sendKeysToWebElement(Textfield_lastname, address);
	return new Profile_Page();
	
}
	public Profile_Page enterdateofbirth() throws Exception {
		//sendKeysToWebElement(Textfield_dateofbirth, " 21Aug2020");
		getDriver().findElement(By.xpath("//*[@id=\"datetimepicker1\"]")).sendKeys("21/Aug/2020");
		return new Profile_Page();
		
		
	}
	
	public Profile_Page entergps(String gps) throws Exception {
		sendKeysToWebElement(Textfield_gps, gps);
		return new Profile_Page();
		
		
	}
	
	public Profile_Page clicksave() throws Exception   {
		
		waitAndClickElement(button_save);
	return new Profile_Page();
	
}
	public Profile_Page privacylevel() throws Exception {
		waitAndClickElement(dropdown_privacylevel);
		Select select = new Select(dropdown_privacylevel);
		select.selectByIndex(1);
		return new Profile_Page();
	}
	
	

	public Profile_Page editprofilesuccessmessage() throws Exception   {
		WebElement success = getDriver().findElement(By.xpath(""));
		waitAndClickElement(Textfield_message);
		Assert.assertEquals("", success.getText().toLowerCase().replaceAll(" ", ""));
		
	return new Profile_Page();
	
}
	public Profile_Page sendnumber(String number) throws Exception {
		sendKeysToWebElement(Textfield_number, number);
		return new Profile_Page();
		
	}
	public Profile_Page sendprofileemail() throws Exception {
		sendKeysToWebElement(Textfield_profileEmail, "lois@email.com");
		return new Profile_Page();
		
	}
	public Profile_Page selectGender() throws Exception {
		waitAndClickElement(radiobutton_female);
		return new Profile_Page();
	}
	
	
	
	
	
}
