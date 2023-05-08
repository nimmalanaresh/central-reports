package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Offerspage {
	
	public Offerspage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Offers']")
	public WebElement offers;
	
	@FindBy(xpath="//button[@class='btn_top btn-sm']")
	public WebElement create;
	
	@FindBy(xpath="//select[@id='offers-store_id']")
	public WebElement dd;
	
	@FindBy(id="offers-offer_type_string")
	public WebElement offertype;
	
	@FindBy(id="offers-name")
	public WebElement offername;
	
	@FindBy(id="offers-desc")
	public WebElement offerdesc;
	
	@FindBy(id="buy_products")
	public WebElement buyproduct;
	
//	@FindBy(xpath="//div[@text()='Onion Powder']")
//	public WebElement prodname;
	
	@FindBy(xpath="(//div[@class='col-sm-4'])[4]")
	public WebElement prodname;
	
	@FindBy(id="offer_products")
	public WebElement offerprod;
	
	@FindBy(xpath="(//i[@class='glyphicon glyphicon-calendar kv-dp-icon'])[1]")
    public WebElement date1;	
	
	@FindBy(xpath="(//i[@class='glyphicon glyphicon-calendar kv-dp-icon'])[2]")
    public WebElement date2;
	
	@FindBy(xpath="//td[@class='today day']")
	public WebElement startdate;
	
	@FindBy(xpath="//td[@class='today day']")
	public WebElement enddate;
	
	@FindBy(id="create-offer-btn")
	public WebElement submit;
	
	@FindBy(xpath="(//span[@class='glyphicon glyphicon-menu-hamburger'])[1]")
	public WebElement edit;
	
	@FindBy(xpath="(//i[@class='fa fa-dot-circle-o text-success'])[1]")
	public WebElement accept;
	
	@FindBy(id="dynamicmodel-comment")
	public WebElement comments;
	
	@FindBy(xpath="//button[@class='btn btn-success']")
	public WebElement submitcomments;
	
	@FindBy(xpath="(//label[@class='switch'])[1]")
	public WebElement radiobtn;
	
	public void createoffer() {
		
		offers.click();
		create.click();
		offername.sendKeys("bogo");
		offerdesc.sendKeys("pandagoo");
	}
	
	public void selectoffertype() {
		
		Select s = new Select(dd);
		//	s.selectByIndex(0);
			s.selectByIndex(1);
		
			Select ss = new Select(offertype);
			ss.selectByIndex(1);
	}
	
	public void submit() {
		
		buyproduct.sendKeys("12345");
		prodname.click();
		offerprod.sendKeys("12345");
		prodname.click();
		date1.click();
		startdate.click();
		date2.click();
		enddate.click();
		submit.click();
	}
	
	public void activateoffer() {
		
		edit.click();
		accept.click();
		comments.sendKeys("hgjghhjv");
		submitcomments.click();
	}
	
}
