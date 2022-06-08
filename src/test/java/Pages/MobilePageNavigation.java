package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MobilePageNavigation {

	WebDriver driver;
	public MobilePageNavigation(WebDriver driver) {
		this.driver=driver;
	}
	
	//@FindBy(how = How.XPATH, using = "//*[@id=\"nav\"]/ol/li[1]/a") WebElement MobilePage;
	By MobilePage = By.xpath("//*[@id=\"nav\"]/ol/li[1]/a");
	
	public void phoneshopping() {
		if(driver.findElement(MobilePage).isDisplayed() == true)
			System.out.println("User is on correct place");
		else
			throw new IllegalArgumentException("User is not at correct place");
	}
	
	public void mobilenav() {
		driver.findElement(MobilePage).click();
	}
	
	public void getTitleofPage() {
		if(driver.getTitle().equals("Mobile"))
			System.out.println("User is navigated to correct page " + driver.getTitle());
		else
			throw new IllegalArgumentException("The title is not as what is expected_1" + driver.getTitle());
	}
	
}
