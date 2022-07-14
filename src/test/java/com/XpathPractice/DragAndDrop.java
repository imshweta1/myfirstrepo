package com.XpathPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Actions action=new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//a[@class='button button-orange']//parent::li[@class='sel4 ui-draggable' and @data-id='1']")))
		.moveToElement(driver.findElement(By.xpath("//li[@class='placeholder']//parent::ol[@id='amt7']"))).release().build().perform();

	}

}
