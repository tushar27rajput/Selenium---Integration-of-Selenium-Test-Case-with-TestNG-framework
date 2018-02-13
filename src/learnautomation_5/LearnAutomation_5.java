/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnautomation_5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 *
 * @author tusshar
 */
public class LearnAutomation_5 {

    /**
     * @param args the command line arguments
     */
    @Test
    public static void main(String[] args) {
        
                  System.setProperty("webdriver.gecko.driver","C:\\Users\\tusshar\\Downloads\\geckodriver.exe");
                  
                  WebDriver driver = new FirefoxDriver();
                  driver.navigate().to("http://www.facebook.com");
                  String title=driver.getTitle();
                  System.out.println(title);
                  driver.quit();
                  
                  
    }
    
}
