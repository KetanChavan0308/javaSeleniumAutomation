package JavaSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser  open succesfully ");

		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//html[@id='facebook']//div[@id='login_link']/a[@href='/r.php?locale=en_GB&display=page']")).click();
		Thread.sleep(1000);
		System.out.println("Registration page opned");

		driver.findElement(By.name("firstname")).sendKeys("Vedant");
		Thread.sleep(1000);

		driver.findElement(By.name("lastname")).sendKeys("Nibe");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("vedantnibe@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vedantnibe@gmail.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("Vedant@2001");
		Thread.sleep(1000);
		try {
			WebElement d=driver.findElement(By.xpath("//select[@id=\"day\"]"));
			Select day =new Select(d);
			day.selectByValue("7");
			WebElement m=driver.findElement(By.id("month"));
			Select month=new Select(m);
			month.selectByIndex(0);
			WebElement y=driver.findElement(By.name("birthday_year"));
			Select year=new Select(y);
			year.selectByValue("2001");
		}catch(Exception x) {
			System.out.println(x);
		}

		try {
			WebElement r = driver.findElement(By.xpath("//input[@value=\"2\"]"));
           	r.click();
			
		} catch (Exception e) {
			System.out.println(e);
		}

		Thread.sleep(1000);

		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(1000);
		
		System.out.println("account created suucessfully");

		driver.close();
		System.out.println("Browser close succesfully");
	}

}
