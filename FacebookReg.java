package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookReg {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
driver.findElement(By.name("firstname")).sendKeys("Bhakya");
driver.findElement(By.name("lastname")).sendKeys("Lakshmi");
driver.findElement(By.name("reg_email__")).sendKeys("bhakiya1123@gmail.com");
driver.findElement(By.name("reg_passwd__")).sendKeys("Bhakya@0223");
WebElement dayWE = driver.findElement(By.name("birthday_day"));
Select dayDD = new Select(dayWE);
dayDD.selectByValue("23");
WebElement monthWE = driver.findElement(By.name("birthday_month"));
Select monthDD = new Select(monthWE);
monthDD.selectByValue("10");
WebElement yearWE = driver.findElement(By.name("birthday_year"));
Select yearDD = new Select(yearWE);
yearDD.selectByValue("1993");
WebElement genderWE = driver.findElement(By.id("sex"));
genderWE.click();	
}

}
