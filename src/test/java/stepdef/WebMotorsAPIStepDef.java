package stepdef;

import actions.Get;
import actions.WebMotorsAPIAction;
import actions.WebMotorsAction;
import io.cucumber.java8.En;

public class WebMotorsAPIStepDef implements En {

    Get getTest = new Get("http://desafioonline.webmotors.com.br:80");
    WebMotorsAPIAction action = new WebMotorsAPIAction();

    public WebMotorsAPIStepDef() {

        Given("Busco Modelo Por API {string}, {int}", (String url, Integer id) -> {

            System.out.println(action.ValidaResposeGetModel(200, id, getTest.getUrl(url)));

        });

        Given("Busco Versão Por API {string}, {int}", (String url, Integer id) -> {

           System.out.println(action.ValidaResposeGetVersion(200, id, getTest.getUrl(url)));

        });

        Then("Busco Veiculo Por API {string}, {int}", (String url, Integer id) -> {

            System.out.println(action.ValidaResposeGetVehicles(200, id, getTest.getUrl(url)));

        });


    }

}
