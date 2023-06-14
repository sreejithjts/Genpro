package Genpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class saucedemo {
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sreejith\\OneDrive\\Desktop\\Selenium Drivers\\chromedriver\\chromedriver_win32 (2)");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.name("user-name")).sendKeys("standard_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.name("login-button")).click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("react-burger-menu-btn")))).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("user-name")).sendKeys("locked_out_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.findElement(By.name("user-name")).sendKeys("problem_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.findElement(By.name("user-name")).sendKeys("performance_glitch_user");
			driver.findElement(By.name("password")).sendKeys("secret_sauce");
			WebElement x = driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select"));
			Select objselect = new Select(x);
			objselect.selectByValue("lohi");
			driver.findElement(By.name("add-to-cart-sauce-labs-onesie")).click();
			driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
			driver.findElement(By.name("add-to-cart-sauce-labs-bolt-t-shirt")).click();
			driver.findElement(By.name("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
			driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.className("shopping_cart_link")).click();
			driver.findElement(By.name("remove-sauce-labs-onesie")).click();
			driver.findElement(By.name("remove-sauce-labs-bike-light")).click();
			driver.findElement(By.name("checkout")).click();
			driver.findElement(By.name("firstName")).sendKeys("Sreejith");
			driver.findElement(By.name("lastName")).sendKeys("J");
			driver.findElement(By.name("postalCode")).sendKeys("695024");
			driver.findElement(By.name("finish")).click();
			driver.findElement(By.name("back-to-products")).click();
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.id("logout_sidebar_link")).click();
			driver.close();
	}

}
