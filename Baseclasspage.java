package pageobjects;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Baseclasspage {
	
	public Baseclasspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(id="loginform-username")
	public static WebElement untb;
	
	
	@FindBy(id ="loginform-password")
	public static WebElement pwtb;
	
	@FindBy(xpath ="//button[text()='Login']")
	public static WebElement login;
	
	
	
	public void username()  {
//		Reporter.log("enter username", true);
//		Scanner sc = new Scanner(System.in);
//		String uname = sc.nextLine();
		untb.sendKeys("kkgroupuser");
		
	}
	
	public void password() {
//		Reporter.log("enter password", true);
//		Scanner sc = new Scanner(System.in);
//		String pwd1 = sc.nextLine();
		pwtb.sendKeys("qwerty");
		
	}
	
	public void login() {
		
		login.click();
	}
	
	public void Login() throws Throwable {
		username();
		password();
		login();
	}

}
