package day6_multi_element;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class drop_down1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver=new ChromeDriver();
		//to open browser on full screen use
		driver.manage().window().maximize();		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//get a link 
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//identify drop down uniquely 
		WebElement dropdown=driver.findElement (By.id("Skills"));
		
		//create an instance of select class and pass the value of web element instance 
		Select slt = new Select(dropdown);
		
		//now you can perform any required operation on dropdown using select class object
        //operaton 1
		System.out.println("does drop down allo to select maltiple option:"+slt.isMultiple());
		
		//opration2
		WebElement element=slt.getFirstSelectedOption();
		System.out.println("default selected value:"+element.getText());
		
		//selection operation
		
		//1.select by text
		slt.selectByVisibleText("Analytics");
		System.out.println("after selecting the visible text :"+slt.getFirstSelectedOption().getText());
		
		//1.select by index
				slt.selectByIndex(5);
				System.out.println("after selecting the index:"+slt.getFirstSelectedOption().getText());
				
     	//1.select by index
				slt.selectByValue("APIs");
				System.out.println("after selecting the value :"+slt.getFirstSelectedOption().getText());
				
		//count the all list
				System.out.println("list count :"+slt.getOptions().size());
		
		
	}

}












/*
Operations on Skill dropdown
	- check multiselect allowed or not
	- by default selection
	- select required value from dropdown and validation that is selected or not
	- Total options getting displayed in the dropdown
*/