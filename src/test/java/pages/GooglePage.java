package pages;

import org.junit.Assert;

public class GooglePage extends BasePage{
    public GooglePage() {
        super(driver);
    }

    private String searchBox = "//textarea[@id='APjFqb']";
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";
    private String firstTitle= "Ecuador - Buscar con Google";
    private  String wikipediEcuador = "//*[@id=\"kp-wp-tab-overview\"]/div[1]/div/div/div/div/div/div[1]/div/div/span/a/h3";
    private String secondTitle = "Ecuador - Wikipedia, la enciclopedia libre";
    private String textoDentroWikipedia = "//*[@id=\"mw-content-text\"]/div[1]/table[1]/tbody/tr[1]/th";
    private  String firstDetalle = "República del Ecuador1\n" +
                                    "Ecuadorpi Ripuwlika  (quechua)\n" +
                                    "Ekuatur Nunka  (jíbaro)";
    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
        maximizar();
    }

    public void busqueda(String criteria) {
        escritura(searchBox, criteria);
    }

    public void clickElement() throws InterruptedException {
        click(searchButton);
    }

    public void compararTitutoEcuador() {
        comparar(obtenerTitulo(),firstTitle);
        //Assert.assertEquals(obtenerTitulo(),firstTitule);
    }

    public void ingresoWikipedia() {
        click(wikipediEcuador);
    }

    public void compararTituloWikipedia() {
        comparar(obtenerTitulo(), secondTitle);
    }

    public String obtengoTxtEcuador() {
        return obtenerTextoObjeto(textoDentroWikipedia);
    }

    public void compararDetalle() {
        comparar(obtengoTxtEcuador(), firstDetalle);
    }

    public void closeNavigator() {
        close();
    }
}
