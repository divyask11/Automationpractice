package dec12_dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		//to open browser on full screen 
		driver.manage().window().maximize();
		
		//add implivityly time wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//add link
		driver.get("https://demoqa.com/select-menu");
		
		//identify uniquely
		WebElement dropdown=driver.findElement(By.id("cars"));
		
		//create an instance of select class and pass the constructor value 
		Select slt = new Select(dropdown);
		
		//now you can perform any operation 
		System.out.println("does drop down allowed to select multiple option:"+slt.isMultiple());
		
		
		//select the option 
		//we can use thread slep to slow the script
		
		Thread.sleep(1000);
		slt.selectByVisibleText("Audi");
		
		Thread.sleep(1000);
		slt.selectByValue("saab");
		
		Thread.sleep(1000);
		slt.selectByIndex(2);
		
		//to get selected option count 
		System.out.println("option count :"+slt.getAllSelectedOptions().size());
		
		//to all drop down list option count 
		System.out.println("all drop down option :"+slt.getOptions().size());
		
		
		//slt.deselectAll();
		
		//or
		
		// now we perform des-selected operation 
		Thread.sleep(1000);
		slt.deselectByIndex(4);
		Thread.sleep(1000);
		slt.deselectByValue("volvo");
		Thread.sleep(1000);
		slt.selectByVisibleText("saab");
	}

}

/*
Operations on Skill dropdown
	- check multiselect allowed or not
	- by default selection
	- select required value from dropdown and validation that is selected or not
	- Total options getting displayed in the dropdown
*/ 