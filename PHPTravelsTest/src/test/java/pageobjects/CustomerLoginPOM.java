package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.BasePage;

public class CustomerLoginPOM

{

	//locators for login page elements
	public By account_button = By.id("ACCOUNT"); 
	public By myprofile = By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[4]/a");
	public By customerlogin_link = By.linkText("Customer Login");
	public By email_element = By.name("email");
	public By password_element = By.name("password");
	public By login_button = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/form/div[3]/button");
	public By customer_name = By.className("section-heading");
	public By logout_link = By.xpath("//*[@id='fadein']/div[4]/div/div[3]/ul/li[5]/a");
	public By err_msg = By.xpath("/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[5]/div");
	public By err_msg_supplier = By.xpath("/html/body/div[4]/div/div[2]/div[2]/div/div");
	//public By agents_login_link = By.linkText("Agents Login");
	public By supplier_login_link = By.linkText("Supplier Login");
public By agents_login_link = By.xpath("/html/body/header/div/div/div/div/div/div[2]/div/div[2]/div[3]/div/ul/li[3]/a");
	public By amail_element = By.name("email");
	public By apwd_element = By.xpath("/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[2]/label/span");
	public By alogin_button = By.xpath("/html/body/div/div[1]/main/div/div/div/div[1]/div/form/div[4]/button/span[1]");
    	


/*
	@FindBy(id = "ACCOUNT")
	WebElement account_button;
	
	@FindBy(linkText = "Customer Login")
	WebElement customerlogin_link;
	
	@FindBy(name = "email")
	WebElement email_element;
	
	@FindBy(name = "password")
	WebElement passwprd_element;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div[2]/div/form/div[3]/button")
	WebElement login_button;
	
    @FindBy(className = "section-heading")
    WebElement customer_name;
    
    @FindBy(linkText = "My Profile")
    WebElement myprofile_link;
    
    
    @FindBy(name = "firstname")
    WebElement profilename;
	
    @FindBy(linkText = "Logout")
    WebElement logout_link;
    */
    
}
