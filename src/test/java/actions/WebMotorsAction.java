package actions;

import Utils.DriverUtil;
import io.cucumber.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebMotorsAction implements En {

    WebDriver driver = DriverUtil.getDriver();

    public void moverMouseParaCompra(By elemento) {

        Actions action = new Actions(DriverUtil.getDriver());
        WebElement perifericoElement = DriverUtil.getDriver().findElement(elemento);
        action.moveToElement(perifericoElement).perform();

    }

    public void find(By elemento) {

        driver.findElement(elemento);

    }

    public void click(By elemento) {

        driver.findElement(elemento).click();

    }

    public void buscarElemento(String produtoDesejado, By lista) throws InterruptedException {

        Thread.sleep(2000);

        java.util.List<WebElement> listMarcas  =  driver.findElements(lista);

        for (int i=0; i < listMarcas.size(); i++) {
            Thread.sleep(2000);

            String nomeProduto = listMarcas.get(i).getText();
            if(listMarcas.get(i).getText().equalsIgnoreCase(produtoDesejado)) {

                System.out.println("Produto Correto:" + nomeProduto );

                listMarcas.get(i).click();
                break;

            } else {

                System.out.println("Produto INCORRETO: " + nomeProduto);
            }


        }


    }

    public void esperaImplicita(int segundos) {

        DriverUtil.getDriver().manage().timeouts().implicitlyWait(segundos, TimeUnit.SECONDS);

    }

    public void selecionarPorTextoVisivel(By elemento, String textoVisivel) {

        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), 30);
        WebElement selectElement = DriverUtil.getDriver().findElement(elemento);
        Select select = new Select(selectElement);
        select.selectByVisibleText(textoVisivel);

    }

    public void esperarElementoSerVisivel(By elemento, int tempoLimiteDeEspera) {
        WebDriverWait wait = new WebDriverWait(DriverUtil.getDriver(), tempoLimiteDeEspera);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
    }



}



