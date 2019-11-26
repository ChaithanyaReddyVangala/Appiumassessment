package com.Selfdrvn.myAppiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class AppTest {
	
  public static URL url;
  public static DesiredCapabilities capabilities;
  public static AndroidDriver<MobileElement> driver;
  
  
  
  @BeforeSuite
  public void setupAppium() throws MalformedURLException {
    
    final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
    url = new URL(URL_STRING);

    capabilities = new DesiredCapabilities();
    capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Emulator");
    capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\puttaparthi\\Desktop\\PropertyGuru Singapore_v3.186.1_apkpure.com.apk");
   // capabilities.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.selfdrvn.Selfdrvn.*");
    capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
    capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9");
    capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

 
    driver = new AndroidDriver<MobileElement>(url, capabilities);
    driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
    
    
 
  
  }
 
  
  @Test
  public void myFirstTest() throws InterruptedException {
	  
	  
      Thread.sleep(10000);
          
 /*   WebElement signIn= driver.findElement(By.xpath("//android.widget.Button[@text=\"SIGN IN\"]"));
      
      signIn.click();
      
      Thread.sleep(5000); */
      
      // 1. Create an Appium scenario that launches a mobile app and fills in a form by using an appropriate selector. The form should consists of at least a dropdown list, alphanumeric field and numeric only field.
      // 2. Refer to no. 1, validation should be done when enter character into numeric only field.
      
      WebElement NavigateMenu= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
      
      NavigateMenu.click();
      
      
      WebElement LogInorsignIn= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Login or Signup\"]"));
      
      LogInorsignIn.click();
      
      System.out.println("1.Filling form with Numeric and AlphaNumeric fields");
      
      WebElement EmailAddress= driver.findElement(By.xpath("//android.widget.EditText[@text=\"Email Address\"]"));
      
      EmailAddress.sendKeys("Lakshmi.chaithanya@gmail.com");
      
      WebElement PasswordTextBox= driver.findElement(By.xpath("//android.widget.EditText[@text=\"Password\"]"));
      
      PasswordTextBox.sendKeys("12345reddy");
      
      WebElement BackClose= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
      
      BackClose.click();
      
      Thread.sleep(2000);
      
      WebElement NavigateMenu1= driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
      
      NavigateMenu1.click();
      
      Thread.sleep(2000);
      
     // 3.Create an Appium scenario launches a mobile app, perform a search and select an item from the search results.
      
      WebElement ResedentialLink= driver.findElement(By.id("com.allproperty.android.consumer.sg:id/drawer_residential"));
      
      ResedentialLink.click();
      
      System.out.println("2.Selecting DROPDOWN Values");
      
      WebElement TypeDD= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Type\"]"));
      
      TypeDD.click();
      
      WebElement LandedValue= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Landed\"]"));
      
      LandedValue.click();
      
      WebElement SearchBox= driver.findElement(By.xpath("//android.widget.EditText[@text=\"Enter MRT, location or property name\"]"));
      
      SearchBox.click();
          
      WebElement SearchReturnList= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Orchard / River Valley\"]"));
      
      SearchReturnList.click();
      
      System.out.println("3.Performing Search Operation");
      
      WebElement SearchButton= driver.findElement(By.id("com.allproperty.android.consumer.sg:id/btnSearch"));
      
      SearchButton.click();
      
    //4.Create an Appium scenario launches a mobile app, navigate to different pages in the app and assert the text in the page.
      
      System.out.println("4.Navigating to different pages in the app and assert the text in the page");
      
      WebElement ListResults= driver.findElement(By.xpath("//android.widget.TextView[@text=\"Emerald Hill Conservation House\"]"));
      
      ListResults.click();
      
      Thread.sleep(3000);
               
      Assert.assertTrue(driver.getPageSource().contains("Emerald Hill Conservation House"), "Page not Navigated Correctly");
	  
	  
  }

  
}