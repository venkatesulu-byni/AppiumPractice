package com.venkat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class Swipe extends BaseTest{
	
	@Test
	public void SwipeTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"), "true");
		
		WebElement firstImage = driver.findElement(By.xpath("//android.widget.ImageView[1]"));
		
//		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement) firstImage).getId(), 
//				"direction", "left",
//			    "percent", 0.75
//			    ));
		swipeAction(firstImage, "left");

		
		Assert.assertEquals(driver.findElement(By.xpath("//android.widget.ImageView[1]")).getAttribute("focusable"), "false");
		
		Thread.sleep(2000);
	}

}
