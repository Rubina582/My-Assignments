package FrameConcept;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement firstframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(firstframe);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.accept();
		WebElement successmsg = driver.findElement(By.id("demo"));
		String text1 = successmsg.getText();
		System.out.println(text1);
		
		}

}
