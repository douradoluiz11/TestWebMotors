package stepdef;

import actions.WebMotorsAPIAction;
import actions.WebMotorsAction;
import io.cucumber.java8.En;

public class WebMotorsAPIStepDef implements En {

    WebMotorsAPIAction get = new WebMotorsAPIAction();

    public WebMotorsAPIStepDef() {

        Given("Busco Modelo Por API {string}, {int}", (String url, Integer id) -> {

            System.out.println(get.ValidaResposeGetModel(200, id, url));

        });

        Given("Busco Versão Por API {string}, {int}", (String url, Integer id) -> {

           System.out.println(get.ValidaResposeGetVersion(200, id, url));

        });

        Then("Busco Veiculo Por API {string}, {int}", (String url, Integer id) -> {

            System.out.println(get.ValidaResposeGetVehicles(200, id, url));

        });


    }

}
