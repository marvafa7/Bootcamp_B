package test2.openbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expediapage {
WebDriver driver;

@FindBy (xpath="//*[@class='uitk-tab-anchor'])[2]")WebElement flight;
@FindBy (xpath="//*[@class='uitk-tab-text'])[7]")WebElement rtrip;
@FindBy (xpath="//*[@data-testid='submit-button']")WebElement searchButton;
@FindBy (xpath="(//*[@class='uitk-faux-input'])[1]")WebElement from;
@FindBy (xpath="//*[@id=\"location-field-leg1-origin-menu\"]/div[3]/ul/li[4]/button/div/div[1]/span/strong")WebElement miami;
@FindBy (xpath="//*[@aria-label='Going to']")WebElement to;
@FindBy (xpath="//*[@id=\"location-field-leg1-destination-menu\"]/div[3]/ul/li[7]/button/div/div[1]/span/strong")WebElement lasvegas;
@FindBy (id="d1-btn")WebElement departure;
@FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[5]/button")WebElement juneten;
@FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[3]/button/span")WebElement fromdone;
@FindBy (id="d2-btn")WebElement returning;
@FindBy (xpath = "//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[6]/button")WebElement junereturn;
@FindBy (xpath="//*[@id=\"wizard-flight-tab-roundtrip\"]/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[3]/button/span")WebElement returndone;


public expediapage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
	
	public void flight(){
		flight.click();	
	}
	public void rtrip(){
		rtrip.click();	
	}	
	public void from(){
		from.click();
	}
	public void destination() {
		from.sendKeys("m");
	}
	public void miami() {
		miami.click();		
	}
	public void to() {
		to.click();		
	}
	public void sendto() {
		to.sendKeys("l");		
	}
	public void lasvegas() {
		lasvegas.click();		
	}
	public void juneten() {
		juneten.click();
	}
	public void junereturn() {
		junereturn.click();
	}
	public void search() {
		searchButton.click();
	}
}
