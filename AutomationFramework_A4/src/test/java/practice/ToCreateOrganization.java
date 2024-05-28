package practice;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToCreateOrganization {

	public static void main(String[] args) {

		// To launch browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("http://localhost:8888/");

		// To perform login
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();

		// To naviagte to organization link
		driver.findElement(By.linkText("Organizations")).click();

		// To click on create organization Lookup image
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();

		// To fill mandatory details
		Random r = new Random();
		int random = r.nextInt(1000);
		driver.findElement(By.name("accountname")).sendKeys("Wipro" + random);
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();

		// To verify
		String orgName = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
		if (orgName.contains("Wipro" + random)) {
			System.out.println(orgName + "--Passed--");
		} else {
			System.out.println("--Failed--");
		}

		// To logout
		WebElement logout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		Actions action = new Actions(driver);
		action.moveToElement(logout).perform();
		driver.findElement(By.linkText("Sign Out")).click();

		// To close
		driver.quit();

	}

}
