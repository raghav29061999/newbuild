package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.MobilePageNavigation;
import Pages.priceverification;
import Pages.sortingfunctionality;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class logins {

	
	public static WebDriver driver = null;
	HomePage title;
	MobilePageNavigation nav;
	sortingfunctionality sorted;
	priceverification verifyprice;
	
	
	@Given("User is on the browser")
	public void user_is_on_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
			System.out.println("Opening the browser");
		    System.setProperty("webdriver.chrome.driver","./ChromeDriver/chromedriver.exe");
			driver = new ChromeDriver();
				 
			//To maximize browser
			driver.manage().window().maximize();		
	}

	@When("User launches the Url")
	public void user_launches_the_url() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		//To the Website URL
		System.out.println("Launch");
		driver.get(" http://live.techpanda.org/index.php/");
		driver.manage().deleteAllCookies();
		Thread.sleep(4000);
	    
	}

	@Then("user is taken to Page with title as")
	public void user_is_taken_to_page_with_title_as() {
		title = new HomePage(driver);
	    title.getTiltofPage();
	    
	}

	@Given("User is on the home page of website")
	public void user_is_on_the_home_page_of_website() {
	    // Write code here that turns the phrase above into concrete actions
		nav = new MobilePageNavigation(driver);
		nav.phoneshopping();
		
		
	   
	}

	@When("User proceeds\\(clicks) on the option")
	public void user_proceeds_clicks_on_the_option() {
	    // Write code here that turns the phrase above into concrete actions
		nav.mobilenav();
	    
	}

	@Then("User is navigated to Mobile selecting page")
	public void user_is_navigated_to_mobile_selecting_page() {
	    // Write code here that turns the phrase above into concrete actions
		nav.getTitleofPage();
	    
	}

	@Given("User is on the Mobiles Page")
	public void user_is_on_the_mobiles_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println(driver.getTitle());
	}

	@When("User selects the Sort By dropdown")
	public void user_selects_the_sort_by_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println(driver.getCurrentUrl());
	}

	@And("User Selects option sort by name from dropdown")
	public void user_selects_option_sort_by_name_from_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("3");
	    sorted = new sortingfunctionality(driver);
	}

	@Then("Products are sorted by name")
	public void products_are_sorted_by_name() {
	    // Write code here that turns the phrase above into concrete actions
	   sorted.toSort();
	}
	
	@Given("user is on the mobiles page. Step2")
	public void user_is_on_the_mobiles_pageStep2() {
	    // Write code here that turns the phrase above into concrete actions
	   verifyprice = new priceverification(driver);
	   System.out.println(driver.getTitle());
	}

	@And("user notes the price of Sony Experia.")
	public void user_notes_the_price_of_sony_experia() {
	    // Write code here that turns the phrase above into concrete actions
		verifyprice.initalPrice();
	    
	}

	@When("user clicks the Sony Experia mobile.")
	public void user_clicks_the_sony_experia_mobile() {
	    // Write code here that turns the phrase above into concrete actions
		verifyprice.phonedetails();
	    
	}

	@Then("user is navigated to Page Sony Xperia - Mobile.")
	public void user_is_navigated_to_page_sony_xperia_mobile() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getTitle());
	    
	}

	@And("user checks the price of mobile here.")
	public void user_checks_the_price_of_mobile_here() {
	    // Write code here that turns the phrase above into concrete actions
	    verifyprice.finaPrice();
	}

	@Then("user comapres the two prices.")
	public void user_comapres_the_two_prices() {
	    // Write code here that turns the phrase above into concrete actions
		verifyprice.comparepPrice();
	    
	}

	
}
