package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PlacedOrder {
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
  public void testPlacedOrder() throws Exception {
    driver.get(baseUrl + "/viewcart?otracker=PP_GoToCart");
    driver.findElement(By.xpath("//div[@id='container']/div/div/div/div/div/div[4]/div/div/form/button")).click();
    driver.findElement(By.xpath("//div[@id='CNTCT7699A86317A34CE490EB441C0']/button")).click();
    driver.findElement(By.xpath("//span[@id='to-payment']/button")).click();
    driver.findElement(By.xpath("//div[@id='container']/div/div/div/div/div[4]/div/div/div[2]/div/label[5]/div")).click();
    driver.findElement(By.name("captcha")).clear();
    driver.findElement(By.name("captcha")).sendKeys("x8r7d");
    driver.findElement(By.xpath("//button[@type='button']")).click();
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
