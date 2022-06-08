package Pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
		}
		
		
		
		
		public void getTiltofPage() {
			if(driver.getTitle().equals("Home page"))
				System.out.println("User is navigated to correct page " + driver.getTitle());
			else
				throw new IllegalArgumentException("The title is not as what is expected " + driver.getTitle());
		}
		
}
