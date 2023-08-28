package co.com.choucair.certification.utest.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.Task_LlenadoFormulario;
import tasks.Task_Login;
import tasks.OpenUp;
import tasks.Task_OpenChrome;


public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^correctly the information in the alphanumeric fields$")
    public void correctlyTheInformationInTheAlphanumericFields() {
        OnStage.theActorCalled("Sergio").wasAbleTo(Task_OpenChrome.onThePage());
        //OnStage.theActorCalled("Sergio").wasAbleTo(OpenUp.thePage(), (Task_OpenChrome.onThePage()));
    }

    @When("^Click on the Sign in button$")
    public void clickOnTheSignInButton() {
    OnStage.theActorCalled("Sergio").wasAbleTo(Task_Login.onThePage());
    }

    @Then("^you can fill the login fields for the start of session$")
    public void youCanFillTheLoginFieldsForTheStartOfSession() {
        OnStage.theActorCalled("Sergio").wasAbleTo(Task_LlenadoFormulario.onThePage());
    }

}
