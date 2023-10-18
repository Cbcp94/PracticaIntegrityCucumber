package steps;

import io.cucumber.java.en.*;
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
        System.out.println(google.obtenerTitulo());
        google.compararTitutoEcuador();
        google.ingresoWikipedia();
        System.out.println(google.obtenerTitulo());
        google.compararTituloWikipedia();
        System.out.println(google.obtengoTxtEcuador());
        google.compararDetalle();
    }

    @Then("^obtengo resultados$")
    public void validateResults() {
        google.closeNavigator();
    }
}
