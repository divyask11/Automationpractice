package dec12_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         WebDriver driver=new ChromeDriver();
		
		//to open browser on full screen 
		driver.manage().window().maximize();
		
		//add implivityly time wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//add link
		driver.get("https://demoqa.com/select-menu");
		
		//custom or bootstrap drop down handling 
		//custom dropdown handling
				driver.findElement(By.cssSelector("#selectOne>div>*:first-child")).click();
				
				//get all options
				List<WebElement> option=driver.findElements(By.cssSelector("div[id^='react-select-3-option']"));
				System.out.println("option count :"+option.size());
		
				//print one by one option 
				for(WebElement element:option) {
					System.out.println(element.getText());
				}
				
				//click on specific option
				option.get(3).click();
				
				
	}

}

//setTimeout(function(){debugger;}, 5000)