package week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		
		    ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();		
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.findElement(By.id("username")).sendKeys("DemoCsr");
			WebElement webpass=driver.findElement(By.id("password"));
			webpass.sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.className("frameSectionHeader")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Venkyinfo");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatesh");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			driver.findElement(By.className("smallSubmit")).click();

	}

}
