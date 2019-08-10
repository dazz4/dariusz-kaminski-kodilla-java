package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    private static final String XPATH_FIRSTNAME = "//input[contains(@name, \"firstname\")]";
    private static final String XPATH_LASTNAME = "//input[contains(@name, \"lastname\")]";
    private static final String XPATH_EMAIL = "//input[contains(@name, \"reg_email__\")]";
    private static final String XPATH_EMAIL_CONFIRM = "//input[contains(@name, \"reg_email_confirmation__\")]";
    private static final String XPATH_PASSWORD = "//input[contains(@name, \"reg_passwd__\")]";
    private static final String XPATH_BD_DAY = "//*[@id=\"day\"]";
    private static final String XPATH_BD_MONTH = "//*[@id=\"month\"]";
    private static final String XPATH_BD_YEAR = "//*[@id=\"year\"]";
    private static final String XPATH_GENDER = "//input[@name=\"sex\" and @value=\"2\"]";
    private static final String XPATH_SIGNUP = "//button[@type=\"submit\"]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement firstName = driver.findElement(By.xpath(XPATH_FIRSTNAME));
        firstName.sendKeys("Darek");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Kaminski");

        WebElement email = driver.findElement(By.xpath(XPATH_EMAIL));
        email.sendKeys("kodilla.dazz4@gmail.com");

        WebElement emailConfirmation = driver.findElement(By.xpath(XPATH_EMAIL_CONFIRM));
        emailConfirmation.sendKeys("kodilla.dazz4@gmail.com");

        WebElement password = driver.findElement(By.xpath(XPATH_PASSWORD));
        password.sendKeys("kodilla_password");

        WebElement selectBdDay = driver.findElement(By.xpath(XPATH_BD_DAY));
        Select selectDay = new Select(selectBdDay);
        selectDay.selectByIndex(20);

        WebElement selectBdMonth = driver.findElement(By.xpath(XPATH_BD_MONTH));
        Select selectMonth = new Select(selectBdMonth);
        selectMonth.selectByIndex(2);

        WebElement selectBdYear = driver.findElement(By.xpath(XPATH_BD_YEAR));
        Select selectYear = new Select(selectBdYear);
        selectYear.selectByIndex(30);

        WebElement selectByGender = driver.findElement(By.xpath(XPATH_GENDER));
        selectByGender.click();

        WebElement clickButton = driver.findElement(By.xpath(XPATH_SIGNUP));
        clickButton.click();
    }
}
