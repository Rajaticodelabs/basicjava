package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
        public WebDriver driver;

        public void setup(){
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                driver.get("https://equipmentnow.onrender.com/");
                driver.manage().window().maximize();
        }
        public void signUp(){
                driver.findElement(By.xpath("/html/body/div[1]/div/div/div/header/div/div[2]/nav/div/a[2]/span/span")).click();
                driver.findElement(By.xpath("//input[@placeholder='jane.doe@example.com']")).sendKeys("rk99@yopmail.com");
                driver.findElement(By.xpath(//input[@placeholder="jane"])).sendKeys("r");
                driver.findElement(By.xpath(//input[@autocomplete="new-password"]).sendKeys("k");
                driver.findElement(By.xpath(//html/body/div[1]/div/div/div/main/section/div[2]/div/form/div[1]/div[4]/input)).sendKeys("12345678");
                driver.findElement(By.xpath(//html/body/div[1]/div/div/div/main/section/div[2]/div/form/div[2]/div/fieldset/ul/li/span/label/span[1])).click();
                driver.findElement(By.xpath(//button[@type="submit"])).click();
        }

        public static void main(String[] args) {
                Main main = new Main();
                main.signUp();
        }
}