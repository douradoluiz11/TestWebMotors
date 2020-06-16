package actions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class WebMotorsAPIAction {



    public String ExecutaGet(String baseURI, String url) {


        RestAssured.baseURI = baseURI;
        RestAssured.port = 80;
        String get = url;


        return get;


    }

    public String ValidaResposeGetModel (int statusCode, int makeID, String url) {


        Response response =
                given()
                        .contentType("application/json; charset=UTF-8")
                        .param("MakeID",makeID)
                        .when()
                        .get("http://desafioonline.webmotors.com.br:80"+ url)
                        .then()
                        .statusCode(statusCode)
                        .contentType("application/json; charset=UTF-8")
                        .extract()
                        .response();



        String resultResponse = response.asString();


        return resultResponse;

    }
    public String ValidaResposeGetVersion (int statusCode, int makeID, String url) {


        Response response =
                given()
                        .contentType("application/json; charset=UTF-8")
                        .param("ModelID",makeID)
                        .when()
                        .get("http://desafioonline.webmotors.com.br:80"+ url)
                        .then()
                        .statusCode(statusCode)
                        .contentType("application/json; charset=UTF-8")
                        .extract()
                        .response();



        String resultResponse = response.asString();


        return resultResponse;

    }

    public String ValidaResposeGetVehicles (int statusCode, int makeID, String url) {


        Response response =
                given()
                        .contentType("application/json; charset=UTF-8")
                        .param("Page",makeID)
                        .when()
                        .get("http://desafioonline.webmotors.com.br:80"+ url)
                        .then()
                        .statusCode(statusCode)
                        .contentType("application/json; charset=UTF-8")
                        .extract()
                        .response();



        String resultResponse = response.asString();


        return resultResponse;

    }

}
