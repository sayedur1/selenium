package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

public class Selenium_Learning {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



        /*driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        // Form field testing//

        //driver.findElement(By.id("userName")).sendKeys("sayedur");

       driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sayedur");
        Thread.sleep(3000);
        driver.findElement(By.id("userEmail")).sendKeys("sayedur22@yahoo.com");
        Thread.sleep(3000);
        driver.findElement(By.id("currentAddress")).sendKeys("khamarerchar");
        Thread.sleep(3000);
        driver.findElement(By.id("permanentAddress")).sendKeys("same");
        Thread.sleep(3000);
        driver.findElement(By.id("submit")).click();
        Thread.sleep(3000);
        driver.quit();

         */


        //*** Alart window testing below ***//

       /* driver.get("https://demoqa.com/alerts");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);

        driver.quit();*/



       //  Link find out testing//

       /* driver.get("https://demoqa.com/links");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        List<WebElement> link= driver.findElements(By.tagName("a"));
        for(WebElement i:link)
            System.out.println("out put:"+i.getText()+" //"+i.getDomAttribute("href"));

       WebElement csselement=driver.findElement(By.cssSelector("a[id='simpleLink']"));
       String color=  csselement.getCssValue("color");
       System.out.println("color:"+color);
        Thread.sleep(3000);
        driver.quit();
        */

        //Select option start here//
        driver.get("https://demoqa.com/select-menu");
        Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        Select option=new Select(driver.findElement(By.cssSelector("div[class= 'css-1uccc91-singleValue']")));
         //option.selectByValue("css-1wa3eu0-placeholder");
        //Thread.sleep(2000);
        driver.quit();
    }
}
