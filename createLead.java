package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createLead {

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
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhakya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lakhsmi");
WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
Select sourceDD = new Select(sourceWE);
sourceDD.selectByIndex(3);
WebElement MarketingCampaignWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
Select MarketingCampaignDD = new Select(MarketingCampaignWE);
MarketingCampaignDD.selectByValue("CATRQ_AUTOMOBILE");
WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
Select industryDD = new Select(industryWE);
industryDD.selectByVisibleText("Media");//by selectbyvisibletext method
driver.findElement(By.className("smallSubmit")).click();
String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(leadId);
String title = driver.getTitle();
System.out.println(title);


	}

}
