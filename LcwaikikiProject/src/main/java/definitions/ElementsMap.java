package definitions;

import org.openqa.selenium.By;

import java.util.HashMap;

import static definitions.FavoritepageDefinitions.*;
import static definitions.LoginPageDefinitions.*;
import static definitions.ShirtPageDefinitions.*;


public class ElementsMap {
    public static HashMap<String, By> elementsMap() {
        HashMap<String, By> elementsMap = new HashMap<String, By>();
        elementsMap.put("buttonErkekMenu", buttonErkekMenu);
        elementsMap.put("buttonGomlek", buttonGomlek);
        elementsMap.put("h1ErkekGomlekModelleri", h1ErkekGomlekModelleri);
        elementsMap.put("buttonSirala", buttonSirala);
        elementsMap.put("buttonEnYuksektenSirala", buttonEnYuksektenSirala);
        elementsMap.put("labelSirala", labelSirala);
        elementsMap.put("shirtMenu", shirtMenu);
        elementsMap.put("shirtNames", shirtNames);
        elementsMap.put("buttonFavorilerim", buttonFavorilerim);
        elementsMap.put("h1Favorilerim", h1Favorilerim);
        elementsMap.put("shirtNamesFromFavoritePage", shirtNamesFromFavoritePage);
        elementsMap.put("buttonSelectAll", buttonSelectAll);
        elementsMap.put("checkFavoriteShirts", checkFavoriteShirts);
        elementsMap.put("removeSelected", removeSelected);
        elementsMap.put("pCheckRemoveAllFavoriteShirts", pCheckRemoveAllFavoriteShirts);
        return elementsMap;
    }

}
