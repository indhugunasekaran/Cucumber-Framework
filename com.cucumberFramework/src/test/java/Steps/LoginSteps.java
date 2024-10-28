package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;
@Given("user should navigate to demowebshop appplication")
public void userShouldNavigateToDemowebshopAppplication() {
    driver =new ChromeDriver();
    driver.get("https://demowebshop.tricentis.com/books");
}

@Given("user should click on login link")
public void userShouldClickOnLoginLink() {
	driver.findElement(By.xpath("//a[@class='ico-login']")).click();
}
	@Given("user should enter te username  as {string}")
	public void userShouldEnterTeUsernameAs(String string) {
	 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("javaseleniumA4@gmail.com");
	}

	@Given("user should enter the password as {int}")
	public void userShouldEnterThePasswordAs(Integer int1) {
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}

	@When("user click on login button")
	public void userClickOnLoginButton() {
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");
	}

	@Then("login should be successfull")
	public void loginShouldBeSuccessfull() {
	    
	}
	
}
