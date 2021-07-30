package PageObjectModel;

import static definitions.ElementsMap.*;

public class FormPage extends AbstractClass{

    public void moveToElement(String element) {
        moveToElement(elementsMap().get(element));
    }

    public void clickFunction(String element){
        clickFunction(elementsMap().get(element));
    }

    public void assertion(String element, String expected) {
        assertion(elementsMap().get(element),expected);
    }

    public void clickOnFirstXElementFromList(String  element, Integer sayi) throws InterruptedException {
        clickOnFirstXElementFromList(elementsMap().get(element), elementsMap().get("shirtNames"), sayi);
    }

    public void assertionManyElements(String elementShirtNames) {
        assertionManyElements(elementsMap().get(elementShirtNames));
    }

    public void checkAllShirtIsSelected(String element) {
        checkAllShirtIsSelected(elementsMap().get(element));
    }
}
