package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class priceverification {

	WebDriver driver;
	public static String price_1;
	public static String price_2;
	
	public priceverification(WebDriver driver) {
		this.driver = driver;
	}
	
	By txt_price1 = By.xpath("//*[@id=\"product-price-1\"]/span");
	By btn_Experia = By.partialLinkText("SONY");
	By txt_price2 = By.xpath("//*[@id=\"product-price-1\"]/span");
	
	
	public void initalPrice() {
		price_1 = driver.findElement(txt_price1).getText();
		System.out.println(price_1);
	}
	
	public void phonedetails() {
		driver.findElement(btn_Experia).click();
	}
	
	
	public void finaPrice() {
		price_2 = driver.findElement(txt_price1).getText();
		System.out.println(price_2);
	}
	
	public void comparepPrice() {
		if(price_2.equalsIgnoreCase(price_1))
				System.out.println("Prices are equal " + price_1);
		else
			throw new IllegalStateException("Prices are not equal " + price_1 + " not equals " + price_2);
		
	}
	
}
