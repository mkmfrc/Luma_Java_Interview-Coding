package automation.challengesFinal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrugAndDrop {
	static WebDriver Driver;
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	Driver = new ChromeDriver();
	Driver.get("http://demo.guru99.com/test/drag_drop.html");
	Driver.manage().window().maximize();
	Driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	
	
	WebElement drag = Driver.findElement(By.xpath("//*[text()=' BANK ']"));
	
	WebElement drop = Driver.findElement(By.xpath("//*[@id='bank']"));
	
	Actions ac = new Actions(Driver);
	ac.dragAndDrop(drag, drop).build().perform();
	
	//Second Element
	//WebElement dragD = Driver.findElement(By.xpath("//*[text()=' 5000']"));
	
	//WebElement dropA = Driver.findElement(By.xpath("//*[@id='amt7']"));
	//ac.dragAndDrop(dragD, dropA).build().perform();
}
}