package WindowsHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssignment {
	public static void main(String[] args) throws Throwable {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String title = driver.getTitle();
	System.out.println("Testleaf:" +title);
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.partialLinkText("CRM/SFA")).click();
    
    String parentwindow = driver.getWindowHandle();
    System.out.println(parentwindow);
    System.out.println("The Parent window title is:" +driver.getTitle());
    
    driver.findElement(By.xpath("//a[text()='Contacts']")).click();
    driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
    driver.findElement(By.xpath("//input[@name='partyIdFrom']/following::img")).click();
    
    
    
    Set<String> windowhandles = driver.getWindowHandles();
    List<String> childwindow = new ArrayList<String>(windowhandles);
    driver.switchTo().window(childwindow.get(1));
    System.out.println("The first window title is:"+ driver.getTitle());
    driver.findElement(By.xpath("//a[@class='linktext']")).click();
    
    
    driver.switchTo().window(parentwindow);
    driver.findElement(By.xpath("//input[@name='partyIdTo']/following::img")).click();
    
    
    
    Set<String> windowhandles2 = driver.getWindowHandles();
    List<String> childwindow2 = new ArrayList<String>(windowhandles2);
    driver.switchTo().window(childwindow2.get(1));
    System.out.println("The second window title is:" +driver.getTitle());
    
    driver.findElement(By.xpath("//a[text()='DemoLBCust']")).click();
    
    
    driver.switchTo().window(parentwindow);
    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
    Alert alertbox = driver.switchTo().alert();
    alertbox.accept();
    
    
}
}
