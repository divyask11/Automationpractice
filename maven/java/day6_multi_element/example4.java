package day6_multi_element;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:google.com");
		
		//initialize search element 
		driver.findElement(By.name("q")).sendKeys("selenium");
		
	List<WebElement>	sugglist =driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child"));
	System.out.println("link in this page :"+(sugglist.size()==10));
	//name of each link
	for(int i=0;i<sugglist.size();i++) {
	
		//re-initialize sugg list to avoid exception 
		sugglist =driver.findElements(By.cssSelector("ul.G43f7e>li>div>*:nth-child(2)>*:first-child"));
	WebElement element=sugglist.get(i);//stage element exception 
	System.out.println(element.getText());
	if(element.getText().contains("selenium")) {
		System.out.println("sugg contains selenium word");
	}else {
		System.out.println("sugg does not contain selenium word ");
	}
	
		
		

	}
	}
}
