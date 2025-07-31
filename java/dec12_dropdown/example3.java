package dec12_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/select-menu");
		//custom dropdown handling
		driver.findElement(By.cssSelector("#selectOne>div>*:first-child")).click();
		
		//get all options
		List<WebElement> options=driver.findElements(By.cssSelector("div[id^='react-select-3-option']"));
		System.out.println("Option count: "+options.size());
		for(WebElement element: options) {
			System.out.println(element.getText());
		}
		options.get(3).click();
	}

	}


