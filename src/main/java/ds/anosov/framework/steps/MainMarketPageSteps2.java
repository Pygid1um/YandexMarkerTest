package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class MainMarketPageSteps2 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^на странице маркета выбирает раздел \"(.*)\"$")
    public void selectCategoryMenu(String categoryMainMenu) {
        pageManager.getMainMarketPage().selectCategoryMenu(categoryMainMenu);
    }
}
