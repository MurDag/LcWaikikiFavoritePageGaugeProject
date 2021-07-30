package definitions;

import PageObjectModel.AbstractClass;
import org.openqa.selenium.By;

public class LoginPageDefinitions extends AbstractClass {
    public static final By buttonErkekMenu = By.id("mega_menu_dd_6");
    public static final By buttonGomlek = By.xpath("//a[@href=\"/tr-TR/TR/kategori/erkek/gomlek\"]");
    public static final By h1ErkekGomlekModelleri = By.xpath("//div[@class=\"col-md-12\"]/h1");
}
