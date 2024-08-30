package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	private static WebElement webElement;

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/");
	WebElement usernamefield = driver.findElement(By.id("username"));
usernamefield.sendKeys("demosalesmanager");
WebElement passwordfield = driver.findElement(By.id("password"));
passwordfield.sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.linkText("Create Account")).click();
	WebElement accountname = driver.findElement(By.className("inputBox"));
	accountname.sendKeys("Bhakyalakshmi");
	WebElement description = driver.findElement(By.name("description"));
	description.sendKeys("Selenium Automation Tester");
	WebElement industryWE = driver.findElement(By.name("industryEnumId"));
	Select industryDD = new Select(industryWE);
	industryDD.selectByValue("IND_SOFTWARE");
	WebElement ownershipWE = driver.findElement(By.name("ownershipEnumId"));
	Select ownershipDD=new Select(ownershipWE);
	ownershipDD.selectByVisibleText("S-Corporation");
	WebElement sourceWE = driver.findElement(By.name("dataSourceId"));
	Select sourceDD=new Select(sourceWE);
	sourceDD.selectByValue("LEAD_EMPLOYEE");
	WebElement campaingnWE = driver.findElement(By.id("marketingCampaignId"));
	Select campaingnDD = new Select(campaingnWE);
	campaingnDD.selectByIndex(6);
	WebElement stateWE = driver.findElement(By.id("generalStateProvinceGeoId"));
	Select stateDD = new Select(stateWE);
	stateDD.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	driver.close();
	}

}
