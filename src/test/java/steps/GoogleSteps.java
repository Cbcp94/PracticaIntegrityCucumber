package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    GooglePage google = new GooglePage();

    @Given("^navego a google$")
    public void navigateToGoogle() {
        google.navigateToGoogle();
    }

    @When("^busco algo$")
    public void enterSearchCriteria() {
        google.busqueda("Ecuador");
    }

    @And("^click en el boton buscar$")
    public void clickSearchButton() throws InterruptedException {
        google.clickElement();

    }

    @Then("^obtengo resultados$")
    public void validateResults() {
        google.closeNavigator();
    }
}
