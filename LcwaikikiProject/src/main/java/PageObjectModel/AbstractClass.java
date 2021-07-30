package PageObjectModel;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class AbstractClass {

    WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);
    Actions actions = new Actions(driver);
    public List<String> favoriteShirtNames = new ArrayList<>();
    public final Logger logger = Logger.getLogger(AbstractClass.class);

    public void clickFunction(By element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void assertion(By element, String expected) {
        WebElement actual = driver.findElement(element);
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(), expected);
        logger.info(actual.getText() + " sayfası başarılı bir şekilde açıldı !");
    }

    public void goToUrl(String url) {
        driver.get(url);
    }

    public void openDriver() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
    }

    public void assertUrl(String url) {
        Assert.assertEquals("Anasayfa açılırken bir hata oluştu !", url, driver.getCurrentUrl());
        logger.info("Anasayfa başarılı bir şekilde açıldı !");
    }

    public void moveToElement(By element) {
        WebElement element1 = driver.findElement(element);
        wait.until(ExpectedConditions.elementToBeClickable(element1));
        actions.moveToElement(driver.findElement(element)).build().perform();
    }

    public void waitBySecond(Integer second) throws InterruptedException {
        Thread.sleep(second * 1000);
    }

    public void clickOnFirstXElementFromList(By element, By nameShirtElement, Integer sayi) throws InterruptedException {
        List<WebElement> list = driver.findElements(element);
        List<WebElement> shirtNames = driver.findElements(nameShirtElement);
        if (sayi > list.size()) {
            logger.warn("Sayı değeri liste boyutundan büyük olamaz !");
        } else if (sayi < 0) {
            logger.warn("Sayı değeri liste boyutundan küçük olamaz !");
        } else {
            for (int i = 0; i < sayi; i++) {
                wait.until(ExpectedConditions.visibilityOf(list.get(i)));
                favoriteShirtNames.add(shirtNames.get(i).getText());
                list.get(i).click();
                Thread.sleep(500);
            }
        }
    }

    public void assertionManyElements(By elementShirtNames) {
        boolean isThere = true;
        List<WebElement> elementFavoriteShirtList = driver.findElements(elementShirtNames);
        List<String> nameFavoriteShirtList = new ArrayList<>();

        for (WebElement item : elementFavoriteShirtList) {
            nameFavoriteShirtList.add(item.getText());
        }
        int i = 0;
        for (WebElement item : elementFavoriteShirtList) {
            if (!nameFavoriteShirtList.contains(favoriteShirtNames.get(i))) {
                isThere = false;
            }
            i++;
        }

        if (isThere) {
            logger.info("Seçilen bütün ürünler Favorilerim sayfasında yer almaktadır.");
        } else {
            logger.warn("Seçilen bütün ürünler Favorilerim sayfasında yer almamaktadır !");
        }
    }

    public void checkAllShirtIsSelected(By element) {
        boolean isAllSelected = true;
        List<WebElement> webElement = driver.findElements(element);
        for (WebElement item : webElement) {
            if (item.isSelected() == false) {
                isAllSelected = false;
            }
        }
        if (isAllSelected) {
            logger.info("Listelenen bütün ürünler seçildi.");
        } else {
            logger.warn("Listelenen bütün ürünler seçilemedi.");
        }
    }
}
