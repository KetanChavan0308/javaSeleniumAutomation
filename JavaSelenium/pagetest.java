package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class pagetest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("browser open successfully");
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id=\"userName\"]")).sendKeys("Ketan");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("ketanchavan@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.id("currentAddress")).sendKeys("xyz appartment");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//div[@class='accordion']/div[1]/div/ul[@class='menu-list']/li[2]/span[@class='text']"))
				.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[@class=\"rct-title\"]"));

		driver.close();
		Thread.sleep(3000);
		System.out.println("browser close successfully");

	}

}
