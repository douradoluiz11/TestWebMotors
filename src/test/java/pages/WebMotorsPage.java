package pages;

import org.openqa.selenium.By;

public class WebMotorsPage {

    public static By MARCA_HONDA = By.xpath("//div/a[@title='honda']");
    public static By VERSION = By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/div[2]/div[3]");
    public static By MODELOS = By.xpath("//div[contains(text(),'Todos os modelos')]");
    public static By LIST = By.xpath("//a[@class='Filters__line Filters__line__result']");
    public static By VERSAO_LISTA = By.xpath("//a[@class='Filters__line Filters__line__result']");

}
