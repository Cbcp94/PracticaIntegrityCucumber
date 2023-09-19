package pages;

public class GooglePage extends BasePage{
    public GooglePage() {
        super(driver);
    }

    private String searchBox = "//textarea[@id='APjFqb']";
    private String searchButton = "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[2]/div[2]/div[5]/center[1]/input[1]";

    public void navigateToGoogle() {
        navigateTo("https://www.google.com");
        maximizar();
    }

    public void busqueda(String criteria) {
        escritura(searchBox, criteria);
    }

    public void clickElement() throws InterruptedException {
        click(searchButton);
        Thread.sleep(3000);
    }

    public void closeNavigator() {
        close();
    }
}
