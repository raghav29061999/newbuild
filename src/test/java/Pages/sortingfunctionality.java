package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class sortingfunctionality {

	
WebDriver driver;
	
	public sortingfunctionality(WebDriver driver) {
		this.driver=driver;
	}
	
	
	By sorting = By.xpath("//*[@id=\"top\"]/body/div/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select");
	By prices = By.className("price");
	
	
	
	
	public <WebElement> void toSort() {
		
		//verify price on intial load
		
		List<org.openqa.selenium.WebElement> beforeFilterPrice = driver.findElements(prices);
		//System.out.println(beforeFilterPrice);
		//remove the dollar sign and convert string to double
		List<Double> beforeFilterPriceList = new ArrayList<Double>();
		for(org.openqa.selenium.WebElement p : beforeFilterPrice) {
			beforeFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
			
		}
		//Now the prices of the elements before sorting is added into the list beforeFliterPricelist
		System.out.println("one");
		//filter the price
		Select dropdown = new Select(driver.findElement(sorting));
		dropdown.selectByVisibleText("Name");
		
		
		//capture price again
		List<org.openqa.selenium.WebElement> afterFilterPrice = driver.findElements(prices);
		//System.out.println(afterFilterPrice);
		//remove the dollar sign and convert string to double
		System.out.println("two");
		List<Double> afterFilterPriceList = new ArrayList<Double>();
		for(org.openqa.selenium.WebElement p :afterFilterPrice) {
			afterFilterPriceList.add(Double.valueOf(p.getText().replace("$", "")));
			
		}
		System.out.println("three");
		//compare the prices
		Assert.assertEquals(beforeFilterPriceList, afterFilterPriceList);
		
		
		
		
	}
}
