package ProgramPractice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.SetUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args){
	
 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\patil\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
 
//drawing border
   
  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_intro_inner_html");
  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  driver.switchTo().frame("iframeResult");
  WebElement clickbtn = driver.findElement(By.xpath("//button[@type='button']"));
  JavascriptExecutor js = ((JavascriptExecutor) driver);
  js.executeScript("argument[0].style.border='5px solid red'", clickbtn);
  
	
   //Title of the page
  //driver.getTitle() ==> internal logic mehtod with return type ==> string
	//driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	//JavascriptExecutor js = ((JavascriptExecutor) driver);
	
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	

}
