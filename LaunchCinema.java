package org.Cinema;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCinema {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),'PVR V Square M')]")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[2]")).click();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item']/span)[3]")).click();
	    driver.findElement(By.xpath("(//span[@class='mx-2'])[9]")).click();
	    
	    
		driver.findElement(By.xpath("(//span[@class='p-button-label p-c'])[5]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		//driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]")).click();
		WebElement seatno = driver.findElement(By.xpath("(//span[@class='seat-current-pvr'])[1]"));
		seatno.click();
		System.out.println("Seat no is 14:" +seatno);
		
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		
		WebElement Gp = driver.findElement(By.xpath("//div[@class='grand-prices']"));
		Gp.getText();
		System.out.println("The Grand price is:"+Gp);
		
		String title = driver.getTitle();
		System.out.println("The title is:" +title);
		
		
		
		
		
		
		
		
		
	
	
	}
	
}
