package test;
 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
public class landingTest {
 
    WebDriver driver;
 
    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
 
    @Test
    public void landingTestCase() throws InterruptedException {
        driver.get("https://www.easemytrip.com/");
        driver.findElement(By.xpath("//*[@id=\"homepagemenuUL\"]/li[7]")).click();
        driver.findElement(By.xpath("citynamesec")).click();
        driver.findElement(By.xpath("citynamesec")).sendKeys("chennai");
        driver.findElement(By.xpath("//*[@id=\"activity-in-chennai/\"]/div[2]/div")).click();

//        driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[1]/div/input")).sendKeys("500");
//        WebElement adultsDropdown = driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[2]/div/select")); 
//        Select selectAdults = new Select(adultsDropdown);
//        selectAdults.selectByIndex(1);  
//        
//        driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[4]/div[1]/div[1]/input")).sendKeys("Alex");
//        driver.findElement(By.id("txtEmailId")).sendKeys("Alex");
//        driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[4]/div[1]/div[3]/input")).sendKeys("8106137252");
//        driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[4]/div[2]/div[1]/label/span[2]/input")).click();
//        driver.findElement(By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[5]/div[1]/input")).click();
//        driver.findElement(By.id("pny")).click();
//        String extractedText = driver.findElement(
//            By.xpath("//*[@id=\"Strtfrm\"]/div[1]/div[2]/div[4]/div[1]/div[2]/p")
//        ).getText();
//        System.out.println("text: " + extractedText);

        
    }
    
    @AfterTest
    public void teardown() {
       // driver.quit();
    }
}