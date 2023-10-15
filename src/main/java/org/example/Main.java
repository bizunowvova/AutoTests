package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://diary.ru/");
//        WebElement btn = driver.findElement(By.xpath("//a[@href='https://diary.ru/user/login']"));

        WebElement btn = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@href='https://diary.ru/user/registration']"))));
        btn.click();

        WebElement login = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='SignupForm[username]']"))));
        login.click();
        login.sendKeys("bizunowvova");

        WebElement pass = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='SignupForm[password]']"))));
        pass.click();
        pass.clear();
        pass.sendKeys("qwer1234");

        WebElement mail = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='SignupForm[email]']"))));
        mail.click();
        mail.sendKeys("bizunowvova@gmail.com");

        WebElement check = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@type='checkbox']"))));
        check.click();

        WebElement btn_reg = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='signup_btn']"))));
        btn_reg.click();

        WebElement radio = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='-1']"))));
        radio.click();
    }
}
