package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser  open succesfully ");
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);

		driver.findElement(By.id("email")).sendKeys("mr.kets17@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("pass")).sendKeys("1234567890");
		Thread.sleep(3000);

		driver.findElement(By.id("loginbutton")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//html[@id='facebook']//div[@id='login_link']//a[@href='https://www.facebook.com/recover/initiate/?ars=facebook_login']")).click();
		Thread.sleep(3000);
		System.out.println("forget password");

		driver.findElement(By.xpath("//input[@placeholder=\"Email address or mobile number\"]")).sendKeys("7083811011");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[@id=\"did_submit\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@action=\"cancel\"]")).click();
		Thread.sleep(3000);

		driver.close();
		System.out.println("Browser close succesfully");

	}

}
