package com_nopcommerce;
/**
 * Project-1- ProjectName : com-nopcommerce
 *  BaseUrl = https://demo.nopcommerce.com/
 *  1. Setup chrome browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current url.
 *  5. Print the page source.
 *  6. Navigate to Url.
 *  “https://demo.nopcommerce.com/login?returnUrl=
 *  %2F”
 *  7. Print the current url.
 *  8. Navigate back to the home page.
 *  9. Navigate to the login page.
 *  10. Print the current url.
 *  11. Refresh the page.
 *  12. Enter the email to email field.
 *  13. Enter the password to password field.
 *  14. Click on Login Button.
 *  15. Close the browser.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Programme01_ComNopCommerce {
    static WebDriver driver;
    static String browser = "Chrome";
    static String baseUrl = "https://demo.nopcommerce.com/";

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else{
            System.out.println("Wrong browser selected");
        }
        driver.manage().window().maximize();
        System.out.println("1- Browser setup.");
        driver.get(baseUrl);
        System.out.println("2- URL opened.");
        System.out.println("3- Title of the page: "+driver.getTitle());
        System.out.println("4- Current URL of the page: "+driver.getCurrentUrl());
        System.out.println("5- Page source: "+driver.getPageSource());
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        System.out.println("6- Navigate to the URL: https://demo.nopcommerce.com/login?returnUrl=%2F");
        System.out.println("7- Current URL of the page: "+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("8- Navigated back to the home page.");
        driver.findElement(By.className("ico-login")).click();
        System.out.println("9- Navigated to login page by clicking on login link.");
        System.out.println("10- Current URL of the page: "+driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println("11- Page refreshed.");
        driver.findElement(By.id("Email")).sendKeys("prime123@gmail.com");
        System.out.println("12- Email entered in the email field.");
        driver.findElement(By.id("Password")).sendKeys("prime123");
        System.out.println("12- Password entered in the password field.");
        driver.findElement(By.linkText("Log in")).click();
        System.out.println("13- User clicked on login button.");
        driver.quit();
        System.out.println("14- Browser closed.");
    }
}
