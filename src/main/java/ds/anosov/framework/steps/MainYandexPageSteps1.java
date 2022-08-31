package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.Когда;

public class MainYandexPageSteps1 {

    PageManager pageManager = PageManager.getPageManager();

    @Когда("^в верхнем меню нажимает на \"(.*)\"$")
    public void selectMainMenu(String nameMainMenu) {
        pageManager.getMainYandexPage().selectMainMenu(nameMainMenu);
    }

}
