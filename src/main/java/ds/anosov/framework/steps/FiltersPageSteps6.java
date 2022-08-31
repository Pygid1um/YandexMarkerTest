package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class FiltersPageSteps6 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^указывает цену от \"(\\d*)\" до \"(\\d*)\"$")
    public void selectPrice(String minPrice, String maxPrice) {
        pageManager.getFiltersPage6().selectPrice(minPrice, maxPrice);
    }

    @И("^выбирает производителя \"(.*)\"$")
    public void setPrice(String value) {
        pageManager.getFiltersPage6().selectManufacturerCheckBox(value);
    }

    @И("^нажимает на кнопку \"(.*)\" с результатами$")
    public void clickShowResultButton() {
        pageManager.getFiltersPage6().clickShowResultButton();
    }
}
