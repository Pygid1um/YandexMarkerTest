package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class ElectronicsPageSteps3 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^выбирает проверяет раздел Электроника2$")
    public void checkOpenElectronicsPage() {
        pageManager.getElectronicsPage().checkOpenElectronicsPage();
    }
}
