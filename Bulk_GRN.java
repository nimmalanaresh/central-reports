package central.reports;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageobjects.Bulk_GRNpage;

public class Bulk_GRN {

	
public WebDriver driver;

@Test
	public void abc() throws Throwable {
	
	 System.getProperty("user.dir");
	 FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\Global.properties");
	 Properties prop=new Properties();
	 prop.load(fis);
	
	    driver = new ChromeDriver();
	
	    driver.manage().window().maximize();
	   
    	driver.get(prop.getProperty("stage_url"));

     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     	
		Bulk_GRNpage g = new Bulk_GRNpage(driver);
		
		g.login();
		Thread.sleep(5000);
	    driver.get(prop.getProperty("bulkgrn_url"));
	    g.Bulk_GRN_Details();
	    
	    int i, j=2;
	    for( i=1; i<=2; i++) {
	    	
			FileInputStream f = new FileInputStream(prop.getProperty("Excel_File_Path"));
			Workbook wb = WorkbookFactory.create(f);
			Sheet sh = wb.getSheet(prop.getProperty("Sheet_Name"));
			Row r = sh.getRow(i);
			Cell c =r.getCell(j);
			String value = c.getStringCellValue();
			g.search_bar.sendKeys(value);
			    	
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
	    wait.until(ExpectedConditions.elementToBeClickable(g.item_click)).click();
	    Thread.sleep(3000);
	    }
	    g.Proceed_With_Cart();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].scrollIntoView();", g.Proceed_Button);
	    g.Proceed_Button.click();
	    driver.switchTo().alert().accept();
	    Thread.sleep(2000);
	    driver.switchTo().alert().accept();
	    

	    }
		}




