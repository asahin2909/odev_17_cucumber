package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebtablesStepDefinitions {

    WebDriver driver;

    @Given("User navigates to the webtables page")
    public void user_navigates_to_the_webtables_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdullah_sahin\\IdeaProjects\\chromedriver_win32");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/webtables");
    }

    @When("User clicks on the Add button and adds a new record")
    public void user_clicks_on_the_Add_button_and_adds_a_new_record() {
        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();

    }

    @When("User edits the added record")
    public void user_edits_the_added_record() {
    }

    @Then("User should see the updated record")
    public void user_should_see_the_updated_record() {
        driver.quit();
    }
}
