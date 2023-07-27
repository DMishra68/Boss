package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {
  @Test
  public void facebookOpen() throws InterruptedException {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().fullscreen();
	  Thread.sleep(4000);
	  driver.quit();
  }
}
