import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Flipkart {
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/Users/userName/chromedriver");
WebDriver driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

// Navigate to URL
driver.get("https://www.flikart.com");

//below step is to find directly username field in login page
driver.findElement(By.className("_2zrpKA")).sendKeys(" YOUR USER NAME");


/*Below step is to find password filed. But wait, here if you find 
element by class name you can see class name as “2zrpKA _3v41xv”. 
This wont work because there is a space between A and _. Selenium 
wont allow compound class name. So use xpath for the same as 
mentioned below */
driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("YOUR PASSWORD");

/* Now click on 'Sign In' button. But here also compound class name
 present. You cannot use findByClassName method. But remember one 
thing. Maximum all sign in pages are written as forms by UI 
developers. If it is form then no need to find element separately 
for login button. You can take any element in that form and use 
.submit() to submit the form. so i have taken username element 
again and submit using that */
driver.findElement(By.className("_2zrpKA")).submit();

//Close the browser.
driver.quit();

}
}
