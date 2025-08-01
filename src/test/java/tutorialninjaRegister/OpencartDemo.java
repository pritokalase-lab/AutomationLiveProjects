package tutorialninjaRegister;

import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpencartDemo {
	@Test
	public void verifyRegisteringWithMandatoryFeilds() {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("priya");
		driver.findElement(By.name("lastname")).sendKeys("deshmukha");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys(generatenewEmail());
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("8768567894");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")).isDisplayed());
		
		String expectedString ="Your Account Has Been Created!";
		Assert.assertEquals(driver.findElement(By.xpath("//div[@id ='content']//h1")).getText(),expectedString);
		
		String ActualProperDetailsone= "Congratulations! Your new account has been successfully created!";
		String ActualProperDetailstwo= "You can now take advantage of member privileges to enhance your online shopping experience with us.";
		String ActualProperDetailsthree= "If you have ANY questions about the operation of this online shop, please e-mail the store owner.";
		String ActualProperDetailfour= "A confirmation has been sent to the provided e-mail address. If you have not received it within the hour, please contact us.";
		String ActualProperDetailfive= "contact us.";
		
		String ExpectedProperDetails= driver.findElement(By.id("content")).getText();
		
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsone));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailstwo));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailsthree));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailfour));
		Assert.assertTrue(ExpectedProperDetails.contains(ActualProperDetailfive));
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//h2[normalize-space()='My Account']")).isDisplayed());
		
		driver.quit();
		
	}
	
	
	public static String generatenewEmail() {
		    return new Date().toString().replaceAll(" ", "").replaceAll("\\:", "")+"@gmail.com";
		    }
	}


