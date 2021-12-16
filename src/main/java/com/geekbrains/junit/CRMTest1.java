package com.geekbrains.junit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CRMTest1 {

    public static void scenario1() {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://crm.geekbrains.space/user/login");
        driver.manage().window().setSize(new Dimension(1301, 860));

        WebElement prependedInput2 = driver.findElement(By.id("prependedInput2"));
        prependedInput2.click();
        prependedInput2.sendKeys("Student2020!");

        WebElement submit = driver.findElement(By.id("_submit"));
        submit.click();

        WebElement first = driver.findElement(By.cssSelector(".first .last .title"));
        first.click();

        WebElement text = driver.findElement(By.linkText("Создать контактное лицо"));
        text.click();

        WebElement prependedInput3 = driver.findElement(By.id("crm_contact_lastName-uid-619d4671c5d6a"));
        prependedInput3.click();
        prependedInput3.sendKeys("Nikerov");

        WebElement prependedInput4 = driver.findElement(By.id("crm_contact_firstName-uid-619d4671c5c91"));
        prependedInput4.click();
        prependedInput4.sendKeys("Dmitryi");

        WebElement clik = driver.findElement(By.cssSelector(".select2-chosen"));
        Actions action = new Actions(driver);
        action.moveToElement(clik).build().perform();

        WebElement clik2 = driver.findElement(By.id("select2-drop-mask"));
        action.moveToElement(clik2).build().perform();

        WebElement lang = driver.findElement(By.cssSelector(".lang-ru"));
        lang.click();

        WebElement clik3 = driver.findElement(By.linkText("Открыть \"123test\""));
        action.moveToElement(clik3).build().perform();

        WebElement crm = driver.findElement(By.id("crm_contact_jobTitle-uid-619d4671c5e25"));
        crm.click();

        crm.sendKeys("test");

        WebElement btn = driver.findElement(By.cssSelector(".btn-group:nth-child(4) > .btn"));
        btn.click();
    }
}
