package test2.openbrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class project {
	WebDriver driver;
  @Test
  public void f(WebDriver driver) {
	  expediapage ep=new expediapage(driver);
	  ep.flight();
	  ep.rtrip();
	  ep.from();
	  ep.destination();
	  ep.miami();
	  ep.to();
	  ep.sendto();
	  ep.lasvegas();
	  ep.juneten();
	  ep.junereturn();
	  ep.search();
  }
  
  @BeforeClass
  public void beforeClass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mary\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://expedia.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
  }
  
  @AfterClass
  public void afterclass() {
	  driver.close();
  }
}
