import PageObjectModel.AbstractClass;
import PageObjectModel.FormPage;
import com.thoughtworks.gauge.Step;
import utilities.Driver;


public class StepImplementation  extends  AbstractClass{
    FormPage formPage=new FormPage();
    @Step("Open Driver")
    public void implementation1() {
        openDriver();
    }

    @Step("<url> Url'sine Git")
    public void implementation2(String url) {
        goToUrl(url);
    }

    @Step("Açılan url ile <expectedUrl> url'i karşılaştır.")
    public void implementation3(String expectedUrl) {
        assertUrl(expectedUrl);
        logger.info("Anasayfa başarılı bir şekilde açıldı.");
    }

    @Step("<buttonErkekMenu> adlı elementin üzerinde dur.")
    public void implementation4(String element) throws InterruptedException {
        formPage.moveToElement(element);
        waitBySecond(2);
    }

    @Step("<element> adlı elemente tıkla.")
    public void implementation5(String element) {
        formPage.clickFunction(element);
    }

    @Step("<element> adlı element içinde <text> yazdığını kontrol et.")
    public void implementation6(String element, String text) throws InterruptedException {
        Thread.sleep(2000);
        formPage.assertion(element, text);
    }

    @Step("<shirtMenu> adlı element içindeki ilk <sayi> elemente tıkla.")
    public void implementation7(String element, Integer sayi) throws InterruptedException {
        formPage.clickOnFirstXElementFromList(element, sayi);
    }

    @Step("Tıklanan 3 ürünün bu sayfada listelendiğini kontrol et.")
    public void implementation8() {
        formPage.assertionManyElements("shirtNamesFromFavoritePage");
    }

    @Step("<element> xPath'li bütün elementlerin seçildiğini kontrol et.")
    public void implementation9(String element) {
        formPage.checkAllShirtIsSelected(element);
    }

    @Step("Close Driver")
    public void implementation10() {
        Driver.closeDriver();
    }
}
