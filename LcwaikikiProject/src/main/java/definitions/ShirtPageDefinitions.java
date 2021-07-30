package definitions;

import org.openqa.selenium.By;

public class ShirtPageDefinitions {

    public static final By buttonSirala = By.xpath("//a[@id=\"dropdownMenu1\"]");
    public static final By buttonEnYuksektenSirala = By.xpath("//a[@id=\"hfl_3\"]");
    public static final By labelSirala = By.xpath("//a[@id=\"dropdownMenu1\"]/label");
    public static final By shirtMenu = By.xpath("//div[@class=\"row c-items\"]/div/div[1]");
    public static final By shirtNames = By.xpath("//div[@class=\"info\"]/div/div[1]");
    public static final By buttonFavorilerim = By.xpath("//div[@class=\"col-sm-4 visible-md visible-lg pr-0\"]/a");
    public static final By buttonSelectAll = By.id("selectAll");
    public static final By checkFavoriteShirts = By.xpath("//div[@class=\"emi-icons-wrapper\"]/div[2]/div/label/input");
    public static final By removeSelected = By.id("removeSelected");
    public static final By pCheckRemoveAllFavoriteShirts = By.xpath("//p[@class=\"text-center bold favoriteNoItemHeaderColor\"]");

}
