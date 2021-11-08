package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FilterCity {

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jobs.lever.co/traderev");
		
		
		driver.findElement(By.className("filter-button")).click();
		driver.findElement(By.partialLinkText("Toronto, Ontario, Canada")).click();
		
		
		List<WebElement> ul= driver.findElements(By.xpath("//*[@class='sort-by-location posting-category small-category-label']"));
		
		Thread.sleep(3000);
		
		   System.out.println(ul.size());
		   
		   for(int i = 0; i<ul.size();i++)
		   {
			   System.out.println(ul.get(i).getText()+"-------------"+ul.get(i).isSelected());
		   }
	}

}
