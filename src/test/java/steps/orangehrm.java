package steps;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class orangehrm {
	public WebDriver driver;
	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("user enter the url")
	public void user_enter_the_url() {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@And("user enters username")
	public void user_enters_username() {
		driver.findElement(By.name("username")).sendKeys("Admin");
	}

	@And("user enters password")
	public void user_enters_password() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	}
	
	@And("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
	}
	
	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
		String title = driver.getTitle();
		System.out.println("title of the page is " +title);
		if(title.equals("OrangeHRM"))
		{
			System.out.println("User is on the home page");
		}
	}
}
