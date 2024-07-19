package com.swaglab.Util;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import com.swaglabs.keywords.UIKeywords;

public class WaitFor {
	public static FluentWait<WebDriver> wait;
	static {
		wait = new FluentWait<WebDriver>(UIKeywords.driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.ignoring(org.openqa.selenium.NoSuchElementException.class);
	}

	public static void elementToBeClickable(String locator) {
		// TODO Auto-generated method stub
		By element = By.cssSelector(locator);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
