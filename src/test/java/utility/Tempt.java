package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tempt 
{
	
public static void main(String[]args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "E:\\automation support\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	//cancle initial Loginpage
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	//mouseover on login
	Actions act=new Actions(driver);
	WebElement abc=driver.findElement(By.xpath("//*[@class='_1_3w1N']"));
	act.moveToElement(abc).build().perform();
	
	
     //click on my profile
	driver.findElement(By.xpath("(//*[@class='_2NOVgj'])[1]")).click();
	
	//enterMobileNumber
	driver.findElementByXPath("//*[@class='_2IX_2- VJZDxU']").sendKeys("9168313434");
    //enter password
    driver.findElementByXPath("//*[@type='password']").sendKeys("abcd@1234");
	
	//click on Login
    driver.findElementByXPath("(//*[text()='Login'])[3]").click();
	
	
	
}

}
