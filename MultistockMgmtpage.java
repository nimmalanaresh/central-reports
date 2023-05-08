package pageobjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class MultistockMgmtpage {
	
	public  MultistockMgmtpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//span[text()=' Multi Store Stock Transfer']")
	public WebElement Msm;

	@FindBy(xpath ="//a[@href='/new/multistocktransfer/stocktransfer']")
	public WebElement stcktnfsr;
	
	@FindBy(id ="select2-chosen-1")
	public WebElement src;
	
//	@FindBy(xpath="//select[@name='source_id']")
//    public WebElement src;	
	
	@FindBy(id="s2id_autogen1_search")
	public WebElement search;
	
	@FindBy(id="s2id_autogen2")
	public WebElement dstore;
	
	@FindBy(xpath="//select[@placeholder='Destination Multi selection ']")
	public WebElement dstore1;
	
	@FindBy(xpath="//button[@class='stkTransfr btn btn_search btn-sm']")
	public WebElement searchitems;
	
	@FindBy(id="62f3aade69c5a4608626425b")
	public WebElement item;
	
	@FindBy(xpath="//input[@class='sp']")
	public WebElement destsp;
	
	@FindBy(xpath="//input[@class='quantity']")
	public WebElement qty;
	
	@FindBy(xpath="//a[text()='AddToCart']")
	public WebElement Addtocart;
	
	public void stocktransfer(WebDriver driver) {
		Msm.click();
		driver.navigate().refresh();
	    Msm.click();
		stcktnfsr.click();
		src.click();
	}
	
	public void storeselection() {
		
		search.sendKeys("raghu", Keys.ENTER);
		dstore.click();
		dstore.sendKeys("sahoo", Keys.ENTER);
		dstore.sendKeys(Keys.ENTER, Keys.ENTER);
//		Select s = new Select(m.dstore1);
//		s.selectByIndex(1);
		searchitems.click();
	}
	
	public void selectitems() {
		item.click();
		destsp.clear();
		destsp.sendKeys("30");
		qty.clear();
		qty.sendKeys("4");
	//	Addtocart.click();
	}
}	

	
