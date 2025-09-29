package com.venkat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.testng.Assert;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumBy;

public class DragGesture extends BaseTest{
	
	@Test
	public void DragTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement ele = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		dragAction(ele, 0, 0);
		
		Thread.sleep(2000);
	}

}
