package work;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.firefox.FirefoxDriver;
public class Traderev {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.traderev.com/en-ca/");
		
		driver.findElement(By.xpath("//a[text()=' Careers ']")).click();

		driver.get("https://work.traderev.com/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(1,4000)");
		
		Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//a[@href='https://jobs.lever.co/traderev']")).click();
		
		String t ="Data Displayed properly";
		if ( driver.getPageSource().contains("https://jobs.lever.co/traderev")){
	         System.out.println("Status: " + t + " is present. ");
	      } else {
	         System.out.println("Status: " + t + " is not present. ");
	      }
		driver.close();
	}
}