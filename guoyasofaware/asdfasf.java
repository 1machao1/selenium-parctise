package guoyasofaware;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asdfasf {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		driver.manage().window().maximize(); 
		
		driver.get("http://www.baidu.com");
		
		Thread.sleep(2000);
		
		boolean isSuccess=driver.getPageSource().contains("百度一下");
		System.out.println(isSuccess);
		
		WebElement userName=driver.findElement(By.id("kw"));
		userName.clear();
		userName.sendKeys("果芽软件");
		
		Thread.sleep(2000);
		
		/*WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345678");*/
		
		//Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.id("su"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("果芽软件");
		System.out.println(isSuccess);
		
		driver.quit();
		
	}
}
