 package automation.challenges.FIN;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class iFramesDemo {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestinghelp.com/");

		driver.get("http://www.dwuser.com/education/content/the-magical-iframe-tag-an-introduction/");
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='eduFooterWrap']//iframe[1]")));
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SoftwareTestingHelp.com");
	}

}