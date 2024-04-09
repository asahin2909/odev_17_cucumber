package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsStepDefinitions {

    WebDriver driver;

    @Given("User navigates to the elements page")
    public void user_navigates_to_the_elements_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdullah_sahin\\IdeaProjects\\chromedriver_win32");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
    }

    @When("User clicks on the Buttons section")
    public void user_clicks_on_the_Buttons_section() {
        WebElement buttonsSection = driver.findElement(By.xpath("//span[text()='Buttons']"));
        buttonsSection.click();
    }

    @When("User clicks on the Click Me button")
    public void user_clicks_on_the_Click_Me_button() {
        WebElement clickMeButton = driver.findElement(By.id("doubleClickBtn"));
        clickMeButton.click();
    }

    @Then("User should see the message")
    public void user_should_see_the_message() {
        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String messageText = message.getText();
        System.out.println("Message: " + messageText);
        driver.quit();
    }
}
