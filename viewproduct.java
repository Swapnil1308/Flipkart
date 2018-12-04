package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ViewProduct {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://www.flipkart.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testViewProduct() throws Exception {
    driver.get(baseUrl + "/apple-iphone-se-space-grey-32-gb/p/itmetm9fypda5rfs?pid=MOBETM9FZWW5UEZG&srno=s_1_1&otracker=search&lid=LSTMOBETM9FZWW5UEZGJKPO31&fm=organic&iid=717a2bdd-6fba-42df-af1c-c70e67dcac28.MOBETM9FZWW5UEZG.SEARCH&qH=0b3f45b266a97d70");
    driver.findElement(By.cssSelector("button._2AkmmA.uSQV49")).click();
    driver.findElement(By.xpath("//div[@id='container']/div/div/div[2]/div/div/div/div[2]/div/ul/li/button")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
