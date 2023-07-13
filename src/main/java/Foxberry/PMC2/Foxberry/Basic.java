package Foxberry.PMC2.Foxberry;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException
	{
   	 WebDriverManager.chromedriver().setup();
   	 WebDriver driver = new ChromeDriver();
   	 driver.get("https://app.cmsdigipmc.foxberry.link/");
   	 //driver.findElement(By.className("tab-active header-color-home")).click();

   	 //PMC services
   	 driver.get("https://app.cmsdigipmc.foxberry.link/cep/e-services");
   	  
   	 //perticular services
   	 driver.get("https://app.cmsdigipmc.foxberry.link/cep/e-services/other-sevices/content/Earn%2520And%2520Learn%2520Scheme");
   	      Thread.sleep(2000);
   	      
   	  //click here check box    
      driver.findElement(By.xpath("//*[@id=\"para\"]/app-root/app-cep/div/app-header/div/app-strapi-content-viewer/div/div/div[1]/div[2]/button")).click();
      Thread.sleep(2000);
      Set <String> windows = driver.getWindowHandles();
      String mainwindow = driver.getWindowHandle();



      driver.switchTo().window(mainwindow);
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
	}

}
