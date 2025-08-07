package tutorialninjaRegister;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_002 {
	@Test
	public  void Rsgisterverify() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("riya");
		driver.findElement(By.id("input-lastname")).sendKeys("pote");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(generatenewEmail());
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8768567894");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Assert.assertTrue((driver.findElement(By.linkText("Logout"))).isDisplayed());
	}
	public static String generatenewEmail() {
		
		
	
		return new Date().toString().replaceAll(" ", "").replaceAll("\\:", "")+"@gmail.com";
	
		
		

		

		
		
		
	}

}
