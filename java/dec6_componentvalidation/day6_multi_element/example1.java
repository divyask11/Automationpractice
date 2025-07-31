package day6_multi_element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demowebshop.tricentis.com/desktops");
		
	List<WebElement>	listlink =driver.findElements(By.tagName("a"));
	System.out.println("link in this page :"+listlink.size());
	//name of each link
	for(int i=0;i<listlink.size();i++) {
	
	WebElement element=listlink.get(i);
	System.out.println(element.getAttribute("href"));
	
		
		

	}
	}
}
