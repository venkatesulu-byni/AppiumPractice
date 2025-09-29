package com.venkat;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollPage extends BaseTest{
	
	@Test
	public void ScrollDemoTest() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView2\"));"));
		Thread.sleep(2000);
	}

}
