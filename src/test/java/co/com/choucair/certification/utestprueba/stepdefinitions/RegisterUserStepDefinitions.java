package co.com.choucair.certification.utestprueba.stepdefinitions;

import co.com.choucair.certification.utestprueba.tasks.RegisteringUser;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class RegisterUserStepDefinitions {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Emmanuel");
    }
    @Given("user in the home page")
    public void userInTheHomePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.utest.com/"));
    }
    @When("user create an account completing all fields")
    public void userCreateAnAccountCompletingAllFields() {
        theActorInTheSpotlight().attemptsTo(RegisteringUser.makeInformation());
    }
    @Then("user shows its username")
    public void userShowsItsUsername() {
    }
}
