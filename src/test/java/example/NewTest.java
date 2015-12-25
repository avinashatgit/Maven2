package example;

import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver;       
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;        
public class NewTest {      
        private WebDriver driver;       
        @Test              
        public void testEasy() {    
            driver.get("http://www.guru99.com/selenium-tutorial.html");  
          
            String title = driver.getTitle();                
            Assert.assertTrue(title.contains("Free Selenium Tutorials"));    
            Reporter.log("this isresutl");
        	System.out.println("hello");
        }   
        
        
        @BeforeTest
        public void beforeTest() {  
            driver = new FirefoxDriver();  
            driver.manage().window().maximize();
        }       
        @AfterTest
        public void afterTest() {
            driver.quit();          
        }       
}   