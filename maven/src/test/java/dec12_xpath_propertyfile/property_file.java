package dec12_xpath_propertyfile;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class property_file {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\test\\appdata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		
		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		// NoSuchElementException
		driver.get(prop.getProperty("appUrl"));

		// identify and perform required operation, 0-30sec
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("userName"));

		// identify and perform required operation, 0-30 sec
		driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));

		driver.findElement(By.className("orangehrm-login-button")).click();

		driver.findElement(By.className("oxd-userdropdown-name")).click();

		driver.findElement(By.linkText("Logout")).click();

}
}
