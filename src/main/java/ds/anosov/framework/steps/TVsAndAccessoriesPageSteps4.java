package ds.anosov.framework.steps;

import ds.anosov.framework.managers.PageManager;
import io.cucumber.java.ru.И;

public class TVsAndAccessoriesPageSteps4 {

    PageManager pageManager = PageManager.getPageManager();

    @И("^переходит в подменю \"(.*)\"$")
    public void selectTvMenuSection(String sectionName) {
        pageManager.getTVsAndAccessoriesPage().selectTvMenuSection(sectionName);

    }
}
