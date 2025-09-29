package com.venkat;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class WifiSettings extends BaseTest {

	@Test
	public void WifiSettingsTest() {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.ListView[@resource-id='android:id/list']/android.widget.LinearLayout[2]/android.widget.RelativeLayout")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		
		Assert.assertEquals(alertTitle, "WiFe settings");
		
		driver.findElement(By.id("android:id/edit")).sendKeys("Chinnu");
		driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
		
	}
}
