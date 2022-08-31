package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class ElectronicsPageSteps3 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^выбирает раздел \"(.*)\"$")
    public void selectElectronicsMenu(String electronicsMenu) {
        pageManager.getElectronicsPage().selectElectronicsMenu(electronicsMenu);
    }
}
