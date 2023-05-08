package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Bulk_GRNpage {

	public Bulk_GRNpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath ="//input[@id='loginform-username']")
	public WebElement username;
	
	@FindBy(xpath ="//input[@id='loginform-password']")
	public WebElement password;
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	public WebElement login;
	
	@FindBy(xpath ="//a[@href='/shops/index']//div[@class='btn_more_details']//button[@class='btn pull-right'][normalize-space()='more details']")
	public WebElement moredetails;
	
	@FindBy(xpath="(//span[@class='glyphicon glyphicon-menu-hamburger'])[2]")
	public WebElement hamburger;
	
	@FindBy(xpath ="//div[@class='btn-group open']//a[@title='Shop GRN']")
	public WebElement grn;
	
	@FindBy(xpath ="//button[normalize-space()='Bulk GRN']")
	public WebElement bulkgrn;
	
	@FindBy(xpath="//input[@id='bulkgrn-invoice_no']")
	public WebElement invoice_no;
	
	@FindBy(xpath="//input[@id='bulkgrn-invoice_date']")
	public WebElement invoice_date;
	
	@FindBy(xpath="//td[@class=\"today day\"]")
	public WebElement todaydate;
	
	@FindBy(id="bulkgrn-supplier_id")
	public WebElement supplier_id;
	
	@FindBy(xpath="//input[@id='products']")
	public WebElement search_bar;
	
	@FindBy(xpath="//div[@style=\"overflow:hidden; padding:0px; margin:0px; height:40px; width:320px\"]")
	public WebElement item_click;
	
	@FindBy(xpath="//button[@id='create-cart-btn']")
	public WebElement Add_to_Cart;
	
	@FindBy(xpath="//span[@class='glyphicon glyphicon-shopping-cart cartBtn']")
	public WebElement Cart_Symbol;
	
	@FindBy(xpath="//button[normalize-space()='Proceed']")
	public WebElement Proceed_Button;
	
	
	public void login() {
		
		username.sendKeys("kkgroupuser");
		password.sendKeys("qwerty");
		login.click();
//		moredetails.click();
//		Select s = new Select(hamburger);
//		s.selectByIndex(3);
//		s.selectByVisibleText("Shop GRN");
//		hamburger.click();
//		grn.click();
		
	}
	
	public void Bulk_GRN_Details() {
	//	bulkgrn.click();
		invoice_no.sendKeys("1234");
		invoice_date.click();
		todaydate.click();
		Select sc = new  Select(supplier_id);
		sc.selectByIndex(2);
//		search_bar.sendKeys("1234");
//		item_click.click();
			
	}
	
	public void Proceed_With_Cart() throws Throwable {
		
		Add_to_Cart.click();
		Thread.sleep(3000);
		Cart_Symbol.click();
		Thread.sleep(3000);
	//	Proceed_Button.click();
	}

}
