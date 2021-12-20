import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Thread.sleep(3000);
        driver.get("http://localhost:9001");

        Thread.sleep(3000);

        //TodoPOM pom = new TodoPOM(driver);

        //implicit wait
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("login-box"),0));

        //Thread.sleep(5000);

        WebElement usernameInput = driver.findElement(By.id("username-input"));
        usernameInput.sendKeys("LT");



        WebElement passwordInput = driver.findElement(By.id("password-input"));
        passwordInput.sendKeys("P4ssw0rd");

        WebElement loginButton = driver.findElement(By.id("submit-button"));
        loginButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.numberOfElementsToBeMoreThan(By.className("form-container"),0));

        WebElement amountInput = driver.findElement(By.id("amount-input"));
        amountInput.sendKeys("12345");

        WebElement descriptionInput = driver.findElement(By.id("description-input"));
        descriptionInput.sendKeys("Test from Selenium");

        WebElement typeInput = driver.findElement(By.id("inputGroupSelect01"));
        typeInput.click();

        WebElement otherInput = driver.findElement(By.id("other"));
        otherInput.click();

        WebElement submitButton =driver.findElement(By.id("submit-reimb-button"));
        submitButton.click();








        Thread.sleep(5000);
        driver.quit();




    }
}
