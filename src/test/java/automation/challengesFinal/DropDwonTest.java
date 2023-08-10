package automation.challengesFinal;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import smarttech.ny.generic.CommonUtil;

public class DropDwonTest {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		List<WebElement> ele = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		CommonUtil.getDropDown(ele, "Blue");
		Thread.sleep(5000);
		CommonUtil.getDropDown(ele, "Red");
		Thread.sleep(5000);
		CommonUtil.getDropDown(ele, "Yellow");
		Thread.sleep(5000);

	}

	// 1st way
	// Select se = new Select(driver.findElement(By.id("oldSelectMenu")));
	// se.selectByIndex(1); // Selecting by index
	// se.selectByVisibleText("Blue"); // Selecting visible text ;
	// se.selectByValue("1"); // selectByValue("1")
	
	
	// 2nd way and important

	public void getDropDown(List<WebElement> ele, String text) {
		ele = driver.findElements(By.xpath("//*[@id='oldSelectMenu']/option"));
		// System.out.println("Total size of vale : "+ele.size());
		for (WebElement newEle : ele) {
			// System.out.println("Value Name : "+newEle.getText());
			if (text.equals(newEle.getText())) {
				newEle.click();
				break;
			}
		}

	}
}
