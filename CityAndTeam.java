package work;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CityAndTeam {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "C:\\\\SeleniumJars\\\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jobs.lever.co/traderev");
		
		driver.findElement(By.className("filter-button")).click();
		driver.findElement(By.partialLinkText("Toronto, Ontario, Canada")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Team')]")).click();
		driver.findElement(By.partialLinkText("Engineering")).click();
		
        List<WebElement> ulTo= driver.findElements(By.xpath("//*[@class='sort-by-location posting-category small-category-label']"));
        List<WebElement> ulEn= driver.findElements(By.xpath("//*[@class='sort-by-team posting-category small-category-label']"));
		
		Thread.sleep(3000);
		
		   System.out.println(ulTo.size());
		   System.out.println(ulEn.size());
	}

}
