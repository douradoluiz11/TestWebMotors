package stepdef;

import Utils.DriverUtil;
import actions.WebMotorsAction;
import io.cucumber.java8.En;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.WebMotorsPage;

public class WebMotorsStepDef implements En {

    DriverUtil driver = new DriverUtil();
    WebMotorsAction action = new WebMotorsAction();


    public WebMotorsStepDef() {

        Given("Abro o Navegador", () -> {

            driver.getDriver();

        });

        Given("Acesso o Site {string}", (String site) -> {

            driver.getUrl(site);

        });



        Given("Clico na Marca", () -> {

            action.esperarElementoSerVisivel(WebMotorsPage.MARCA_HONDA,10);
            action.find(WebMotorsPage.MARCA_HONDA);
            action.click(WebMotorsPage.MARCA_HONDA);


        });

        Given("Seleciono o Modelo", () -> {

            action.esperaImplicita(10);
            action.click(WebMotorsPage.MODELOS);
            action.buscarElemento("CITY", WebMotorsPage.LIST);


        });

        Given("Seleciono a Versão", () -> {

            action.esperaImplicita(10);
            action.click(WebMotorsPage.VERSION);
            action.esperaImplicita(3);
            action.buscarElemento("1.5 DX 16V FLEX 4P AUTOMÁTICO", WebMotorsPage.VERSAO_LISTA);

        });


    }


}
